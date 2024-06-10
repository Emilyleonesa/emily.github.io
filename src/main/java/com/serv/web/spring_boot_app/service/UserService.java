package com.serv.web.spring_boot_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.serv.web.spring_boot_app.repository.FakeUserRepository;
import com.serv.web.spring_boot_app.repository.FakeUserRepository.User;

@Service
public class UserService {

    private final FakeUserRepository userRepository = new FakeUserRepository();

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
