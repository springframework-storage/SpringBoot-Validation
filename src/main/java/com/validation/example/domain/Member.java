package com.validation.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Member {

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String phone1;

  @Column(nullable = false)
  private String phone2;

  @Column(nullable = false)
  private String phone3;

  @Column(nullable = false)
  private String email;

  public Member() {}

  public Member(String name, String phone1, String phone2, String phone3, String email) {
    this.name = name;
    this.phone1 = phone1;
    this.phone2 = phone2;
    this.phone3 = phone3;
    this.email = email;
  }

}
