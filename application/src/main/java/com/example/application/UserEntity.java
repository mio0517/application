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
  private int tel;
  private Integer time;
  private Integer seats;

  public UserEntity() {}

  public UserEntity(Integer id, String name, String genre, String address, int tel, Integer time, Integer seats) {
    this.id = id;
    this.name = name;
    this.genre = genre;
    this.address = address;
    this.tel = tel;
    this.time = time;
    this.seats = seats;
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
    return tel;
  }
  public void setTell(int tel) {
    this.tel = tel;
  }
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }
  public Integer getSeat() {
    return seats;
  }
  public void setSeat(Integer seats) {
    this.seats = seats;
  }

}
