package com.example.mongodb;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EntityRepository extends ReactiveMongoRepository<Entity, String> {

}
