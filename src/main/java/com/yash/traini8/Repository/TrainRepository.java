package com.yash.traini8.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yash.traini8.Entity.TrainingCenter;

public interface TrainRepository extends MongoRepository<TrainingCenter, String> {
}