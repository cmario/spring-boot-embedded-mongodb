package com.example.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "entities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entity {

    @Id
    private String id;

    private String name;

}
