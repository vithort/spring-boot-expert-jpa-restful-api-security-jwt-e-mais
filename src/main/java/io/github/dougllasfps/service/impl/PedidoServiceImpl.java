package io.github.dougllasfps.service.impl;

import io.github.dougllasfps.domain.entity.Cliente;
import io.github.dougllasfps.domain.entity.ItemPedido;
import io.github.dougllasfps.domain.entity.Pedido;
import io.github.dougllasfps.domain.entity.Produto;
import io.github.dougllasfps.domain.repository.Clientes;
import io.github.dougllasfps.domain.repository.ItemsPedido;
import io.github.dougllasfps.domain.repository.Pedidos;
import io.github.dougllasfps.domain.repository.Produtos;
import io.github.dougllasfps.exception.RegraNegocioException;
import io.github.dougllasfps.rest.dto.ItemPedidoDTO;
import io.github.dougllasfps.rest.dto.PedidoDTO;
import io.github.dougllasfps.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor // annotation faz com que gere o construtor com argumentos obrigatorios (que contém final)
public class PedidoServiceImpl implements PedidoService {

    private final Pedidos repository;
    private final Clientes clientesRepository;
    private final Produtos produtosRepository;
    private final ItemsPedido itemsPedidoRepository;

    @Override
    @Transactional // annotation: ou faz tudo ou faz rollback se acontecer um erro
    public Pedido salvar(PedidoDTO dto) {
        Integer idCliente = dto.getCliente();
        Cliente cliente = clientesRepository
                .findById(idCliente)
                .orElseThrow(() -> new RegraNegocioException("Código de Cliente inválido!"));

        Pedido pedido = new Pedido();
        pedido.setTotal(dto.getTotal());
        pedido.setDataPedido(LocalDate.now());
        pedido.setCliente(cliente);

        List<ItemPedido> itemsPedido = converterItems(pedido, dto.getItems());
        repository.save(pedido);
        itemsPedidoRepository.saveAll(itemsPedido);

        pedido.setItens(itemsPedido);

        return pedido;
    }

    private List<ItemPedido> converterItems(Pedido pedido, List<ItemPedidoDTO> items) {
        if (items.isEmpty()) {
            throw new RegraNegocioException("Não é possível realizar um pedido sem items!");
        }
        return items
                .stream()
                .map(dto -> {
                    Integer idProduto = dto.getProduto();
                    Produto produto = produtosRepository
                            .findById(idProduto)
                            .orElseThrow(
                                    () -> new RegraNegocioException("Código de Produto inválido! Código: " + idProduto)
                            );
                    ItemPedido itemPedido = new ItemPedido();
                    itemPedido.setQuantidade(dto.getQuantidade());
                    itemPedido.setPedido(pedido);
                    itemPedido.setProduto(produto);
                    return itemPedido;
                })
                .collect(Collectors.toList());
    }
}
