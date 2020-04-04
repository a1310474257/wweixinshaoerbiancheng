package com.aurora.web.controller;


import com.aurora.api.UserApi;

import com.aurora.commom.exception.ExceptionCast;
import com.aurora.model.domain.User;
import com.aurora.model.response.CommonCode;

import com.aurora.web.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Transactional
@Api(value = "用户管理接口",description = "提供增删查改")
public class UserController implements UserApi {

  @Autowired
  private UserService userService;

  @ApiOperation("查询所有用户")
  @GetMapping("/findAll")
  @Override
  public List<User> finAll() throws Exception {
    return userService.findAll();
  }


  @RequestMapping("/insert")
  @Override
  public void insert(@RequestBody User user) throws Exception{
    int i = 1/0;

  }

//  @RequestMapping("/findAll")
//  public List<User> findAll(){
//    return userService.findAll();
//  }
//
//  @RequestMapping("/user")
//  public void insert(){

//
//    User user1 = new User();
//    user1.setName("蚂蚁花呗");
//    user1.setPassword("sss");
//    user1.setUsername("灰太狼");
//    userService.Insert(user1);
//  }

  @RequestMapping("/test")
  public int test() throws Exception{
//    int i = 1/0;
    ExceptionCast.Myexception(CommonCode.FAIL);

    return 1;
  }
}
