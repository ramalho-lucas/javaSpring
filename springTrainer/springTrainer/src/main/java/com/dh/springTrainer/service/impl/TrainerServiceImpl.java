package com.dh.springTrainer.service.impl;

import com.dh.springTrainer.model.Trainer;
import com.dh.springTrainer.service.ITrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService {
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Joao"), new Trainer("Lucas"));
    }
}
