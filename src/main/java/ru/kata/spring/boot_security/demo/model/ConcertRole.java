package ru.kata.spring.boot_security.demo.model;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConcertRole implements Converter<String, Role> {
    @Override
    public Role convert(String id) {
        long parseId = Integer.parseInt(id);
        for (Role role: Role.values()) {
            if (role.ordinal() == parseId) {
                return role;
            }
        }
        return null;
    }
}
