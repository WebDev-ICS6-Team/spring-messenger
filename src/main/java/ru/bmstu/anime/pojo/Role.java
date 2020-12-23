package ru.bmstu.anime.pojo;

import org.springframework.security.core.GrantedAuthority;

public enum Role {
    USER, ADMIN;

    public String getRole() {
        return name();
    }
}
