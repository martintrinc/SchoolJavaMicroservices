package com.app.school.service.Authentication;


import org.springframework.security.authentication.AuthenticationManager;

public class JwtAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
}

