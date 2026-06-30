package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    @PostMapping("/countries")
    public Country addCountry(
            @RequestBody Country country) {

        System.out.println("START");

        return country;
    }
}