package com.drsqrt.spring.controllers;

import com.drsqrt.spring.dtos.ResponseEntity;
import com.drsqrt.spring.entity.User;
import com.drsqrt.spring.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

  private final HomeService homeService;

  public HomeController(HomeService homeService) {
    this.homeService = homeService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> printName(@PathVariable("id") Integer id) {
    return new ResponseEntity<>(homeService.getUserById(id), 200);
  }

}
