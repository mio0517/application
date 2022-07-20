package com.example.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @RequestMapping("/user/show")
  public String list(Model m){
  List<UserEntity> list = userRepository.findAll();

    m.addAttribute("userList", list); 

    return "/user/show";

  }
  
}