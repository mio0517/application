package com.example.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @RequestMapping("/user/show")
  public String list(Model m){

  List<UserEntity> list = userRepository.findAll();
    m.addAttribute("userList", list); 

    return "/show";

  }

  @RequestMapping("/user/detail")
  public String detail(Model m) {

    List<UserEntity> list = userRepository.findAll();
    m.addAttribute("user", list);

    return "/detail";
  }

  @RequestMapping("user/new")
  public String create(Model m) {

    List<UserEntity> list = userRepository.findAll();
    m.addAttribute("user", list);

    return "/new";
  }  

  @GetMapping("/user/save")
  public String save(Model m,
  @RequestParam("name") String name,
  @RequestParam("date") String date,
  @RequestParam("time") String time,
  @RequestParam("people") int people,
  @RequestParam("tel") String tel
  ) {
    m.addAttribute("name", name);
    m.addAttribute("date", date);
    m.addAttribute("time", time);
    m.addAttribute("people", people);
    m.addAttribute("tel", tel);

    UserEntity user = new UserEntity();
    user.setName(name);
    user.setDate(date);
    user.setTime(time);
    user.setPeople(people);
    user.setTel(tel);

    userRepository.save(user);

    return "redirect:/user/show";
  }
}