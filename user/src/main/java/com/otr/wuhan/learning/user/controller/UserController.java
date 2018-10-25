package com.otr.wuhan.learning.user.controller;

import com.otr.wuhan.learning.shared.client.UserClient;
import com.otr.wuhan.learning.shared.client.dto.UserDto;
import com.otr.wuhan.learning.user.db.UserEntity;
import com.otr.wuhan.learning.user.db.UserRepository;
import com.otr.wuhan.learning.user.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserEntity::toUserDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/users/{userName}")
    public UserDto getUser(@PathVariable String userName) throws BusinessException {
        return userRepository
                .findById(userName)
                .map(UserEntity::toUserDto)
                .orElseThrow(() -> new BusinessException("user_not_found", "User " + userName + " not found"));
    }
}
