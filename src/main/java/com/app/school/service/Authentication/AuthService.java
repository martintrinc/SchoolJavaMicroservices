package com.app.school.service.Authentication;

import com.app.school.model.Dti.UserDti;
import com.app.school.model.Dto.UserDto;
import com.app.school.model.User;

public interface AuthService {
    User registerUser(UserDto userDto);
    String loginUser(UserDti userDti);
}

