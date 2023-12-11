package com.example.Nsixxx.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter()
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData<T>{
  private final String message;
  private final T data;
  public ResponseData(String message, T data){
    this.message = message;
    this.data = data;
  }
}
