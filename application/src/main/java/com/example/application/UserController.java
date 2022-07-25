package com.example.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {
  @Autowired
  private UserRepository userRepository;
  private UserRepository2 userRepository2;
  @RequestMapping("user/show")
  public String list(Model m){

  List<UserEntity> list = userRepository.findAll();
    m.addAttribute("userList", list); 

    return "user/show";

  }

  @RequestMapping("user/detail")
  public String detail(Model m) {

    List<UserEntity> list = userRepository.findAll();
    m.addAttribute("user", list);

    return "user/detail";
  }

  @RequestMapping("user/new")
  public String create(Model m) {

    List<UserEntity> list = userRepository.findAll();
    m.addAttribute("user", list);

    return "/new";
  }  

  @GetMapping("user/new")
  public String usercreate(Model m,
  @RequestParam(name = "name1", required = false) String name1,
  @RequestParam(name = "date", required = false) String date,
  @RequestParam(name = "time", required = false) String time,
  @RequestParam(name = "people", required = false) Integer people,
  @RequestParam(name = "tel1", required = false) String tel1
  ) {
    m.addAttribute("name1", name1);
    m.addAttribute("date", date);
    m.addAttribute("time", time);
    m.addAttribute("people", people);
    m.addAttribute("tel1", tel1);
    UserEntity2 user = new UserEntity2();
    user.setName1(name1);
    user.setDate(date);
    user.setTime(time);
    user.setPeople(people);
    user.setTel1(tel1);
   // userRepository2.save(user);
    m.addAttribute("userData", user);
   return"user/new";
  }


  @GetMapping("user/save")
  public String save(Model m,
  @ModelAttribute UserEntity user
  ) {
    m.addAttribute("user", user);
    userRepository.save(user);

    return "redirect:/user/show";
  }

  @RequestMapping("/user/userinfo")
  public String info(Model m){

  List<UserEntity> list = userRepository.findAll();
    m.addAttribute("userList", list); 

    return "user/userinfo";

  }
}