package com.aurora.web.dao;


import com.aurora.model.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

  @Select("select * from user")
  public List<User> finAll() throws Exception;

  @Insert("insert into user(username,password,name) values (#{name},#{password},#{name})")
  public void insert(User user) throws Exception;

}
