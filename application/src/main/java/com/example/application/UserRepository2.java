package com.example.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository2 extends JpaRepository<UserEntity2, Integer> {
  
  @Query(
    value="SELECT name1, store, date, time, people, tel1 FROM info WHERE store = user.store",
    nativeQuery=true //直接SQLを実行する機能
  )
  public List<UserEntity2> findAllOrderByPriceDesc();

}
