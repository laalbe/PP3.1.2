package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.getRoleById(id);
    }

    @Override
    public List<Role> allRoles() {
        return roleRepository.allRoles();
    }

    @Override
    public Role getDefaultRole() {
        return roleRepository.getDefaultRole();
    }
}
