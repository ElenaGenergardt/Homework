package com.example.shop62.repository;

import com.example.shop62.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация репозитория продуктов, использующая {@link HashMap} в качестве хранилища.
 */
public class ProductRepositoryMap implements ProductRepository{
    /**
     * Хранилище продуктов в памяти.
     */
    private Map<Long, Product> stonage = new HashMap<>();
    /**
     * Текущий идентификатор для нового продукта.
     */
    private Long currentId = 1L;
    /**
     * Реализация всех методов, созданных в интерфейсе продукта.
     */
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(stonage.values());
    }

    @Override
    public Product save(Product product) {
        product.setId(currentId);
        stonage.put(currentId, product);
        currentId++;
        return product;
    }

    @Override
    public Product update(Product product) {
        Product existing = stonage.get(product.getId());
        if(existing == null){
            return null;
        } stonage.put(product.getId(), product);
        return product;
    }

    @Override
    public Product getById(long id) {
        return stonage.get(id);
    }

    @Override
    public Product delete(long id) {
        return stonage.remove(id);
    }
}
