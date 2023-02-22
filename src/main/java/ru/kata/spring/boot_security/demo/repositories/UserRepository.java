package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    //EntityGraph указывает план загрузки связанных сущностей,
    //позволяет управлять тем какие данные должны быть зыгружены
    //вместе с выбираемыми сущностями
    //помогает использовать меньше запросов к базе данных
    @EntityGraph(attributePaths = {"roles"})
    User findByUsername(String username);
}