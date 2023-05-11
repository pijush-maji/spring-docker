package com.spring.docker.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dokcer-test")
public class DockerTest {

    private String id;
    private String name;
    private Integer amount;

    public DockerTest() {
    }

    public DockerTest(String id, String name, Integer amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
