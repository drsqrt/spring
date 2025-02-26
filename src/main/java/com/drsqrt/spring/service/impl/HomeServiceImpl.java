package com.drsqrt.spring.service.impl;

import com.drsqrt.spring.entity.User;
import com.drsqrt.spring.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HomeServiceImpl implements HomeService {

  @Override
  public User getUserById(Integer id) {
    User user = getAllUsers().getOrDefault(id, null);
    return user != null ? user : new User(0, "Unknown", 0, null);
  }

  private Map<Integer, User> getAllUsers() {
    User ayush = new User(1, "ayush", 23, List.of("chess", "maths"));
    User yuvraj = new User(2, "yuvraj", 23, List.of("chess", "maths"));
    User harshit = new User(3, "harshit", 27, List.of("chess", "maths"));

    Map<Integer, User> users = new HashMap<>();
    users.put(ayush.getId(), ayush);
    users.put(yuvraj.getId(), yuvraj);
    users.put(harshit.getId(), harshit);
    return users;
  }
}
