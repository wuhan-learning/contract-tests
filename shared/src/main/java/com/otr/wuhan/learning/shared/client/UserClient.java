package com.otr.wuhan.learning.shared.client;

import com.otr.wuhan.learning.shared.client.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "user-service", decode404 = true)
public interface UserClient {
    @GetMapping("/users")
    List<UserDto> getAllUsers();

    @GetMapping("/users/{userName}")
    Optional<UserDto> getUser(@PathVariable("userName") String userName);
}
