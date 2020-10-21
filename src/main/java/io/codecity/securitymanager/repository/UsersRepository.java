package io.codecity.securitymanager.repository;

import io.codecity.securitymanager.model.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UsersRepository extends ReactiveMongoRepository<Users, ObjectId> {

    Mono<Users> findByEmail(String email);
    Flux<Users> findByActive(Boolean active);
}
