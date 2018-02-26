package com.example.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class MongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbApplication.class, args);
    }

    @RestController
    public static class MainController {

        @Autowired
        private EntityRepository repository;

        @PostMapping("/entity")
        public Mono<ResponseEntity<Void>> saveEntity() {
            return repository.save(new Entity(null, "test"))
                    .map(e -> ResponseEntity.noContent().build());
        }

    }

}