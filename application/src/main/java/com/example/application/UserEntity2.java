package com.example.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info")
public class UserEntity2 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;
  private String name1;
  private String store;
  private String date;
  private String time;
  private Integer people;
  private String tel1;
  private Integer favorite;
  
  public UserEntity2() {
  }

  public UserEntity2(Integer id, String name1, String store, String date, String time, Integer people, String tel1,
      Integer favorite) {
    this.id = id;
    this.name1 = name1;
    this.store = store;
    this.date = date;
    this.time = time;
    this.people = people;
    this.tel1 = tel1;
    this.favorite = favorite;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Integer getPeople() {
    return people;
  }

  public void setPeople(Integer people) {
    this.people = people;
  }

  public String getTel1() {
    return tel1;
  }

  public void setTel1(String tel1) {
    this.tel1 = tel1;
  }

  public Integer getFavorite() {
    return favorite;
  }

  public void setFavorite(Integer favorite) {
    this.favorite = favorite;
  }

  
}
