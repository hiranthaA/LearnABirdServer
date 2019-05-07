package com.example.LearnABirdServer.controller;

import com.example.LearnABirdServer.model.Bird;
import com.example.LearnABirdServer.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bird")
public class DataController {

    @Autowired
    private DataService service;

    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public Bird addBird(@RequestBody Bird bird){
        byte[] byteset = "Any String you want".getBytes();
        return  service.addBird(bird);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Bird> getBirds() {
        return service.getBirds();
    }
}
