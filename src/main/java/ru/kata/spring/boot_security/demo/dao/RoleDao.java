package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleDao {
    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(Role role);

    Role getRoleByUsername(String role);

    List<Role> getAllRoles();
}
