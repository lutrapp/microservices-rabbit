package br.com.lutrapp.pedidos_api.entity;

import br.com.lutrapp.pedidos_api.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private UUID id = UUID.randomUUID();
    private String client;
    private List<OrderItem> orderItem = new ArrayList<>();
    private Double totalValue;
    private String emailNotification;
    private Status status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;
}
