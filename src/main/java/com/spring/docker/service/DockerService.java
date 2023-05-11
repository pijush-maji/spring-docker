package com.spring.docker.service;

import com.spring.docker.dto.DockerTestDto;
public interface DockerService {

    DockerTestDto getDbData(String id);
    DockerTestDto addDbData(DockerTestDto dockerTestDto);
}
