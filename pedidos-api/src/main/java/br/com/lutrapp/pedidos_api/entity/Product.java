package br.com.lutrapp.pedidos_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private UUID id = UUID.randomUUID();
    private String name;
    private Double price;
}
