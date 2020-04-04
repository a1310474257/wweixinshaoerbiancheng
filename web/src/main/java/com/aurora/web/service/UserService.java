package com.aurora.web.service;

import com.aurora.model.domain.User;
import com.aurora.web.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  private UserDao userDao;

  public String show(){
    return "Hello world!";
  }

  public List<User> findAll() throws Exception{
    return userDao.finAll();
  }

  public void Insert(User user) throws Exception{
    userDao.insert(user);
  }
}
