package com.drsqrt.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Getter
@Setter
@AllArgsConstructor
public class User {

  private Integer id;
  private String name;
  private Integer age;
  private List<String> hobbies;
}
