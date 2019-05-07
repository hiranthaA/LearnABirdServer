package com.example.LearnABirdServer.service;

import com.example.LearnABirdServer.model.Bird;

import java.util.List;

public interface DataService {

    public Bird addBird(Bird bird);

    public List<Bird> getBirds();
}
