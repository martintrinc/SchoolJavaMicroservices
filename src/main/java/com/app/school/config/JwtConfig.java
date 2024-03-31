package com.app.school.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${security.jwt.token.secret-key}")
    private String secretKey;

    @Value("${security.jwt.token.expire-length}")
    private long validityInMilliseconds;

    @Bean
    public JwtTokenProvider jwtTokenProvider() {
        JwtTokenProvider jwtTokenProvider = new JwtTokenProvider();
//        jwtTokenProvider.setSecretKey(secretKey);
//        jwtTokenProvider.setValidityInMilliseconds(validityInMilliseconds);
        return jwtTokenProvider;
    }

    private class JwtTokenProvider {
    }
}
