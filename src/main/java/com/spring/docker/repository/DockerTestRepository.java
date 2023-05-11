package com.spring.docker.repository;

import com.spring.docker.entity.DockerTest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DockerTestRepository extends MongoRepository<DockerTest,String> {
}
