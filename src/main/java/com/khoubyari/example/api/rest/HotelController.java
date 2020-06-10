package com.khoubyari.example.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Demonstrates how to set up RESTful API endpoints using Spring MVC
 */

@RestController
@RequestMapping(value = "/example/v1/hotels")

public class HotelController  {

 
    @GetMapping("/allhotleslsList")
    public String getAllHotel() {
        return "Welcome to Hotel";
    }

  
   
}