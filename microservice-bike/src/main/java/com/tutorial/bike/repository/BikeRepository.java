package com.tutorial.bike.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.bike.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long>{

	List<Bike> findByUserId(Long userId);
}
