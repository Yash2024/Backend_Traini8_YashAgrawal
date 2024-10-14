package com.yash.traini8.Controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.traini8.Entity.TrainingCenter;
import com.yash.traini8.Service.TrainService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/train")
public class TrainRest {

    @Autowired
    private TrainService trainService;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
    
        trainService.addCenter(trainingCenter);
        return new ResponseEntity<>(trainingCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainService.getCenters();
        return new ResponseEntity<>(centers, HttpStatus.OK);
    }
    
   
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllTrainingCenters() {
        trainService.deleteAllCenters();
        return new ResponseEntity<>("All training centers deleted successfully", HttpStatus.OK);
    }
}
