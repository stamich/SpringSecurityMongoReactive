package io.codecity.securitymanager.repository;

import io.codecity.securitymanager.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, ObjectId> {

    Mono<User> findByEmail(String email);
    Flux<User> findByActive(Boolean active);
}
