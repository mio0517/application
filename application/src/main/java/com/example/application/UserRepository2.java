package com.example.application;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository2 extends JpaRepository<UserEntity2, Integer> {
  
 
}
