package com.example.Nsixxx.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Nsixxx.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

