package com.example.shop62.model;
/**
 * Перечисление, представляющее статус заказа.
 */
public enum OrderStatus {
    /**
     * Создан, но не оплачен.
     */
    CREATED,
    /**
     * Оплачен.
     */
    PAID,
    /**
     * Собирается на складе.
     */
    PROCESSING,
    /**
     * Передан в доставку.
     */
    SHIPPED,
    /**
     * Доставлен и вручен.
     */
    DELIVERED,
    /**
     * Отменен.
     */
    CANCELED
}
