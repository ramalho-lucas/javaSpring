package com.dh.springTrainer.controller;

import com.dh.springTrainer.model.Trainer;
import com.dh.springTrainer.service.impl.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerServiceImpl trainerService;

    //@RequestMapping(value = "/listar",method = RequestMethod.GET)
    @GetMapping(value = "/listar")
    public List<Trainer> getTrainer(){
        return trainerService.listTrainer();
    }
}
