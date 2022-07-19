package com.example.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.init.UnmarshallerRepositoryPopulatorFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @RequestMapping("/user/home")
  public String list(Model m) {
    List<UserEntity> list = userRepository.findAll();

    m.addAttribute("", );
    return "";

  }

  @RequestMapping("/user/research")
  public String 

 
}