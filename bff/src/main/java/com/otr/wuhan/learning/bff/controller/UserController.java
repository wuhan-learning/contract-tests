package com.otr.wuhan.learning.bff.controller;

import com.otr.wuhan.learning.shared.client.UserClient;
import com.otr.wuhan.learning.shared.client.dto.UserDto;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private final UserClient userClient;

    public UserController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/api/users")
    public List<UserDto> getUsers() {
        return userClient.getAllUsers()
                .stream()
                .map(this::desensitization)
                .collect(Collectors.toList());
    }

    @GetMapping("/api/users/{userName}")
    UserDto getUser(@PathVariable String userName) {
        return userClient.getUser(userName).map(this::desensitization).orElse(null);
    }

    private UserDto desensitization(UserDto userDto) {
        String mobile = userDto.getMobile();
        if (Strings.isNotEmpty(mobile) && mobile.length() == 11) {
            mobile = mobile.substring(0, 7) + "****";
        }
        userDto.setMobile(mobile);
        return userDto;
    }
}
