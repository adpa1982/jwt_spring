package com.tutorial.user.feingclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.tutorial.user.model.Car;

@FeignClient(name = "car-service", path = "/car")
public interface CarFeignClient {
	
	@PostMapping("/")
    Car save(@RequestBody Car car);

    @GetMapping("/byuser/{userId}")
    List<Car> getCars(@PathVariable("userId") Long userId);

}
