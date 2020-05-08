package com.qintess.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.qintess.security.model.User;
import com.qintess.security.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
