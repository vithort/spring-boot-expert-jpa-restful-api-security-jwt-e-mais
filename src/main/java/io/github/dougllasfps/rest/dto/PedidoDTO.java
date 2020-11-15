package io.github.dougllasfps.rest.dto;

import io.github.dougllasfps.validation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {

    @NotNull(message = "Informe o Código do Cliente!")
    private Integer cliente;
    @NotNull(message = "Campo Total do Pedido é obrigatório!")
    private BigDecimal total;
    @NotEmptyList(message = "Pedido não pode ser realizado sem itens!")
    private List<ItemPedidoDTO> items;

}
