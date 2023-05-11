package com.spring.docker.controller;

import com.spring.docker.dto.DockerTestDto;
import com.spring.docker.service.DockerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DockerController {

    private  final DockerService dockerService;

    public DockerController(DockerService dockerService){
        this.dockerService = dockerService;
    }

    @GetMapping("/docker")
    public String getDockerMessage(){
        return "Dockerizing spring boot application";
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<DockerTestDto> getDBData(@PathVariable String id){
        return new ResponseEntity<>(dockerService.getDbData(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<DockerTestDto> addData(
            @RequestBody DockerTestDto dockerTestDto
    ){
        return new ResponseEntity<>(
                dockerService.addDbData(dockerTestDto),
                HttpStatus.CREATED
        );
    }
}
