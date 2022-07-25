package com.example.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository2 extends JpaRepository<UserEntity2, Integer> {
  
}
