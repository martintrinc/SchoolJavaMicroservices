package com.app.school.service.Authentication;

import com.app.school.model.Dti.UserDti;
import com.app.school.model.Dto.UserDto;
import com.app.school.model.User;
import com.app.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
//    private JwtTokenProvider jwtTokenProvider;

    @Override
    public User registerUser(UserDto userDto) {
        // Implementasi logika registrasi pengguna di sini
    }

    @Override
    public String loginUser(UserDti userDti) {
        // Implementasi logika login pengguna di sini
    }
}
