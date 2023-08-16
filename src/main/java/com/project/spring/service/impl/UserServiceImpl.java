package com.project.spring.service.impl;

import com.project.spring.model.AppUser;
import com.project.spring.repositories.UserRepository;
import com.project.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public Optional<AppUser> findUserById(Long id) {
        return this.userRepository.findById(id);
    }
    @Override
    public Optional<AppUser> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    @Override
    public Optional<AppUser> findUserByResetToken(String resetToken) {
        return userRepository.findByResetToken(resetToken);
    }
    @Override
    public void save(AppUser user) {
        userRepository.save(user);
    }
}
