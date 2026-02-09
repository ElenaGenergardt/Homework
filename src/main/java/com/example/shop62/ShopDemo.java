package com.example.shop62;

import com.example.shop62.model.Role;
import com.example.shop62.model.User;
import com.example.shop62.service.UserService;

import java.time.LocalDateTime;

/**
 * Демонстрационный класс для работы с магазином.
 */
public class ShopDemo {
    /**
     * Главный метод приложения.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        // Создание администратора
        User admin = new User(
                "admin@shop.com",
                "admin123",
                "System Administrator",
                Role.ADMIN,
                LocalDateTime.now()
        );

        // Репозиторий пользователей
//        UserRepository userRepository = new UserRepositoryMap();

//        userRepository.save(admin);


        // Проверка содержимого хранилища
//        userRepository.getAll().forEach(System.out::println);


//        User user = userRepository.findById(789L).orElse(null);
    }

    // IoC
    // 1. Традиционный подход
    // Приложение -> создает зависимости -> использование

    // 2. IoC
    // Контейнер -> создает зависимости -> внедряет в приложение

    // DI

    UserService service = new UserService();    // Мы создаем и контролируем

    // shop.jar
}
