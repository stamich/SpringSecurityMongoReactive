package io.codecity.securitymanager.service;

import io.codecity.securitymanager.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> findAll();
    Mono<User> findByEmail(String email);
    Flux<User> findByActive(Boolean active);
}
