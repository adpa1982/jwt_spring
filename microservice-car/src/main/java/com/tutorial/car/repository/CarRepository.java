package com.tutorial.car.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.car.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	List<Car> findByUserId(Long userId);
}
