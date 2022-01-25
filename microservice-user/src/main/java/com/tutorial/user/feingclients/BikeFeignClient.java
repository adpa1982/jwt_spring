package com.tutorial.user.feingclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.tutorial.user.model.Bike;

@FeignClient(name = "bike-service", path = "/bike")
public interface BikeFeignClient {
	
	@PostMapping("/")
    Bike save(@RequestBody Bike bike);

    @GetMapping("/byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") Long userId);

}
