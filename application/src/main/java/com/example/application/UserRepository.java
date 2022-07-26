package com.example.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
  

  @Query(
    value="SELECT* FROM list WHERE name = :store",
    nativeQuery=true //直接SQLを実行する機能


  )
  public UserEntity findByName(@Param("store") String store);

}

