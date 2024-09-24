package br.com.lutrapp.pedidos_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem {
    private UUID id = UUID.randomUUID();
    private Product product;
    private Integer qtde;
}
