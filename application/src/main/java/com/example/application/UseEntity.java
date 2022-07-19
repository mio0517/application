package com.example.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="")
public class UseEntity {
  @Id
 
  private Integer id;
  private String name;
  private String address;
  private String email;
  private Date createDate;
  private Date updateDate;

  public UserEntity() {}
}
