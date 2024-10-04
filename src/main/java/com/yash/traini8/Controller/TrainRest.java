package com.yash.traini8.Controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.Valid;

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

@RestController
@RequestMapping("/api/train")
public class TrainRest {

    @Autowired
    private TrainService trainService;

    @PostMapping
    public ResponseEntity<Object> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
    	

        trainService.addCenter(trainingCenter);
        return new ResponseEntity<>(trainingCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainService.getCenters();
        return new ResponseEntity<>(centers, HttpStatus.OK);
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Phone number validation method using regex (for example, 10 digits)
    private boolean isValidPhoneNumber(String phone) {
        String phoneRegex = "^[0-9]{10}$"; // Adjust this regex to fit your phone number format (10 digits)
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
    
   
}
