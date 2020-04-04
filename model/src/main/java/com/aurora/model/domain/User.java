package com.aurora.model.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
  private int id;
  private String name;
  private String password;
  private String username;
}
