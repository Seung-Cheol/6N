package com.example.Nsixxx.user.controller;

import com.example.Nsixxx.utils.BooleanResponse;
import com.example.Nsixxx.utils.ResponseData;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController()
@RequiredArgsConstructor()
@RequestMapping("/api/user")
public class UserController {
  @PostMapping("/login")
  public ResponseEntity<ResponseData<BooleanResponse>> login(HttpServletRequest response) {
    int a = 1;
    return new ResponseEntity<>(new ResponseData<>("로그인 완료",null),HttpStatus.OK);
  }
}
