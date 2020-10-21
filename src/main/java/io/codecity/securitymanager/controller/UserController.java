package io.codecity.securitymanager.controller;

import io.codecity.securitymanager.model.Users;
import io.codecity.securitymanager.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)
    public Flux<Users> getAllUsers() {
        return usersService.findAll();
    }
}
