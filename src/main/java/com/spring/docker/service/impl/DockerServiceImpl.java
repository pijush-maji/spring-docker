package com.spring.docker.service.impl;

import com.spring.docker.dto.DockerTestDto;
import com.spring.docker.entity.DockerTest;
import com.spring.docker.repository.DockerTestRepository;
import com.spring.docker.service.DockerService;
import org.springframework.stereotype.Service;

@Service
public class DockerServiceImpl implements DockerService {

    private final DockerTestRepository dockerTestRepository;

    public DockerServiceImpl(DockerTestRepository dockerTestRepository){
        this.dockerTestRepository= dockerTestRepository;
    }
    @Override
    public DockerTestDto getDbData(String id) {
        DockerTest data = dockerTestRepository.findById(id).get();
        DockerTestDto dockerTestDto = new DockerTestDto(
                data.getId(),
                data.getName(),
                data.getAmount()
        );
        return dockerTestDto;
    }

    @Override
    public DockerTestDto addDbData(DockerTestDto dockerTestDto) {
        DockerTest data = new DockerTest();
        data.setName(dockerTestDto.getName());
        data.setAmount(dockerTestDto.getAmount());
        DockerTest saveData = dockerTestRepository.save(data);
        return new DockerTestDto(saveData.getId(),
                saveData.getName(),
                saveData.getAmount());
    }
}
