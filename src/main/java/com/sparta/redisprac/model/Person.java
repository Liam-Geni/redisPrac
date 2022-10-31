package com.sparta.redisprac.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


import java.time.LocalDateTime;


@Getter
@RedisHash(value = "people", timeToLive = 30)
public class Person{

    @Id
    private String id;
    private final String name;
    private final Integer age;
    private final LocalDateTime createdAt;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
        this.createdAt = LocalDateTime.now();
    }
}
