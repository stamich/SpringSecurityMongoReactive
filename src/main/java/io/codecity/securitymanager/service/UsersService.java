package io.codecity.securitymanager.service;

import io.codecity.securitymanager.model.Users;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsersService {

    Flux<Users> findAll();
    Mono<Users> findByEmail(String email);
    Flux<Users> findByActive(Boolean active);
}
