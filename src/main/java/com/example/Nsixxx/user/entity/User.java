package com.example.Nsixxx.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="member_id")
  private Long id;

  @Column(nullable = false)
  private String email;

  @Column
  private String password;

  @Column
  private String username;

  @Column(name="profile_image",nullable = false)
  private String profileImage;

  @Column
  private Boolean isPlannerOpened;

  @Builder
  public User(String email, String password, String username, String profileImage, Boolean isPlannerOpened){
    this.email = email;
    this.password = password;
    this.username = username;
    this.profileImage = profileImage;
    this.isPlannerOpened = isPlannerOpened;
  }

  public void updateUsername(String username){
    this.username = username;
  }

  public void updateProfileImage(String profileImage){
    this.profileImage = profileImage;
  }

  public void updatePlannerOpened(Boolean plannerOpened ){
    this.isPlannerOpened = plannerOpened;
  }
  public boolean isPlannerOpened(){
    return this.isPlannerOpened;
  }
}
