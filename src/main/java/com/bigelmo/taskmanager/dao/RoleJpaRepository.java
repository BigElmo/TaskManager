package com.bigelmo.taskmanager.dao;

import com.bigelmo.taskmanager.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleJpaRepository extends JpaRepository<Role, Long> {
    Role findOneByName(String name);
}
