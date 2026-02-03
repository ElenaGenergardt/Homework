package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long id;
    private User user;
    private BigDecimal totalAmount;
    private LocalDateTime createAt;
    private String shippingAddress;
    private OrderStatus status;
    private List<OrderItem> item;

}
