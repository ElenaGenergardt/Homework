package model;

import java.math.BigDecimal;

public class OrderItem {
    private long id;
    private Order order;
    private Product product;
    private Integer quantity;
    private BigDecimal pricePerUnit;
}
