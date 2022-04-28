package com.danielnagy.szakdolgozat.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class SecurityUtils {

    public static final String ROLE_PREFIX = "ROLE_";
    public static final String AUTH_HEADER = "authorization";
    public static final String AUTH_TOKEN_TYPE = "Bearer";

    public static SimpleGrantedAuthority convertToAuthority(String role){

        String formattedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX + role;

        return new SimpleGrantedAuthority(formattedRole);
    }

}
