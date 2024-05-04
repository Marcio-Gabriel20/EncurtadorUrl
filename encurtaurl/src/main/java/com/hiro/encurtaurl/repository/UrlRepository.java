package com.hiro.encurtaurl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hiro.encurtaurl.entity.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
    
}