package com.yash.traini8.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.traini8.Entity.TrainingCenter;
import com.yash.traini8.Repository.TrainRepository;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepo;

    public void addCenter(TrainingCenter trainingCenter) {
        // Set the createdOn timestamp before saving
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        trainRepo.save(trainingCenter);
    }

    public List<TrainingCenter> getCenters() {
        return trainRepo.findAll();
    }
}
