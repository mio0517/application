package com.example.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="list")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String genre;
  private String address;
  private String tel;
  private String opening;
  private Integer seats;
  private Integer countreserved;

  public UserEntity() {}

  public UserEntity(Integer id, String name, String genre, String address, String tel, String opening, Integer seats, Integer countreserved) {
    this.id = id;
    this.name = name;
    this.genre = genre;
    this.address = address;
    this.tel = tel;
    this.opening = opening;
    this.seats = seats;
    this.countreserved = countreserved;
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
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getOpening() {
    return opening;
  }
  public void setOpening(String opening) {
    this.opening = opening;
  }
  public Integer getSeats() {
    return seats;
  }
  public void setSeats(Integer seats) {
    this.seats = seats;
  }
  public Integer getCountreserved() {
    return countreserved;
  }
  public void setCountreserved(Integer countreserved) {
    this.countreserved = countreserved;
  }

}
