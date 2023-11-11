package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/cars")
public class Carcontroller {

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    System.out.println(req);
  }
}
