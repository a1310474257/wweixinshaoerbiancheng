package com.aurora.api;



import com.aurora.model.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value = "用户管理接口",description = "提供增删查改")
public interface UserApi {

  /**
   * 查询所有用户
   * @return
   */
  @ApiImplicitParams({
    @ApiImplicitParam(name = "user",value = "用户",required = true)
  })
  @ApiOperation("新增一个用户")
  public List<User> finAll() throws Exception;

  /**
   * 更新用户
   * @param user
   */
  @ApiOperation("新增用户")
  public void insert(User user) throws Exception;

}
