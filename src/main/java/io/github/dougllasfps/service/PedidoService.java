package io.github.dougllasfps.service;

import io.github.dougllasfps.domain.entity.Pedido;
import io.github.dougllasfps.domain.enums.Statuspedido;
import io.github.dougllasfps.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, Statuspedido statusPedido);
}
