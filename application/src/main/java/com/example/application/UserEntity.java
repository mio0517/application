package com.example.application;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="list")
public class UserEntity {
  @Id
  private Integer id;
  private String name;
  private String genre;
  private String address;
  private int tell;
  private Integer time;
  private Integer seat;

  public UserEntity() {}

  public UserEntity(Integer id, String name, String genre, String address, int tell, Integer time, Integer seat) {
    this.id = id;
    this.name = name;
    this.genre = genre;
    this.address = address;
    this.tell = tell;
    this.time = time;
    this.seat = seat;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public int getTell() {
    return tell;
  }
  public void setTell(int tell) {
    this.tell = tell;
  }
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }
  public Integer getSeat() {
    return seat;
  }
  public void setSeat(Integer seat) {
    this.seat = seat;
  }

}
