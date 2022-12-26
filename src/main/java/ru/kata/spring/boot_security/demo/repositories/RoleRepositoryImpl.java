package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class RoleRepositoryImpl {


    @PersistenceContext
    private EntityManager entityManager;

    public Set<Role> findAll() {
        return entityManager.createQuery("select p from Role p ", Role.class)
                .getResultStream().collect(Collectors.toSet());
    }


}
