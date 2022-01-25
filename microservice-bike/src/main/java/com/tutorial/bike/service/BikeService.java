package com.tutorial.bike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.bike.entity.Bike;
import com.tutorial.bike.repository.BikeRepository;

@Service
public class BikeService {
	
	@Autowired
    BikeRepository bikeRepository;

    public List<Bike> getAll() {
        return bikeRepository.findAll();
    }

    public Bike getBikeById(Long id) {
        return bikeRepository.findById(id).orElse(null);
    }

    public Bike save(Bike bike) {
        Bike bikeNew = bikeRepository.save(bike);
        return bikeNew;
    }

    public List<Bike> byUserId(Long userId) {
        return bikeRepository.findByUserId(userId);
    }

}
