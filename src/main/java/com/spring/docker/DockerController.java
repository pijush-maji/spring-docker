package com.spring.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/docker")
    public String getDockerMessage(){
        return "Dockerizing spring boot application";
    }
}
