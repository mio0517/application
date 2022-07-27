package com.example.application;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository2 extends JpaRepository<UserEntity2, Integer> {
  
  @Query(
    value="SELECT* FROM info WHERE store = :store",
    nativeQuery=true //直接SQLを実行する機能


  )
  public List<UserEntity2> findByStore(@Param("store") Integer store);
}
