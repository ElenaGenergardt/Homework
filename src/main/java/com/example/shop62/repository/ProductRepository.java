package com.example.shop62.repository;

import com.example.shop62.model.Product;

import java.util.List;
/**
 * Интерфейс для репозитория продукта.
 */
public interface ProductRepository {
    /**
     * Возвращает список всех продуктов.
     *
     * @return список всех продуктов.
     */
    List<Product> getAll();
    /**
     * Сохраняет продукт.
     *
     * @param product продукт для сохранения.
     * @return сохраненный продукт.
     */
    Product save(Product product);
    /**
     * Обновляет продукт.
     *
     * @param product продукт для обновления.
     * @return обновленный продукт.
     */
    Product update(Product product);
    /**
     * Возвращает продукт по его идентификатору.
     *
     * @param id идентификатор продукта.
     * @return продукт с указанным идентификатором или null, если продукт не найден.
     */
    Product getById(long id);
    /**
     * Удаляет продукт по его идентификатору.
     *
     * @param id идентификатор продукта.
     * @return удаленный продукт или null, если продукт не найден.
     */
    Product delete(long id);
}
