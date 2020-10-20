package io.codecity.securitymanager.controller;

import io.codecity.securitymanager.model.User;
import io.codecity.securitymanager.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }
}
