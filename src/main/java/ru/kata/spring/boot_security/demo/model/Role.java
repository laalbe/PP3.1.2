package ru.kata.spring.boot_security.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

//@Entity
//@Table (name = "roles")
public enum Role implements GrantedAuthority {
    USER, ADMIN;

    @Override
    public String getAuthority() {
       return name();
    }
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;

    //private String name;

    //public Long getId() {
      //  return id;
    //}

   // public void setId(Long id) {
     //   this.id = id;
    //}

    //public String getName() {
      //  return name;
    //}

    //public void setName(String name) {
     //   this.name = name;
    //}

    //@Override

}
