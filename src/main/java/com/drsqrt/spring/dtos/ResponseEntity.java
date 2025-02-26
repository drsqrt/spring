package com.drsqrt.spring.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@Getter
public class ResponseEntity<T> {

  T response;
  Integer status;
  String time;

  public ResponseEntity(T response, Integer status) {
    this.response = response;
    this.status = status;
    this.time =  LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
  }
}
