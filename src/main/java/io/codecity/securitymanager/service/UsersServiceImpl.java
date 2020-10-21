package io.codecity.securitymanager.service;

import io.codecity.securitymanager.model.Users;
import io.codecity.securitymanager.repository.UsersRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Flux<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Mono<Users> findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public Flux<Users> findByActive(Boolean active) {
        return usersRepository.findByActive(active);
    }
}
