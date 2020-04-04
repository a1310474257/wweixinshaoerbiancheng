package com.aurora.model.response;

import com.aurora.model.result.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * 常用响应结果代码
 */
@ToString
@Data
public  class CommonCode implements ResultCode {

  public static CommonCode SUCCESS = new CommonCode(true,10000,"操作成功！");
  public static CommonCode FAIL = new CommonCode(false,11111,"操作失败！");
  public static CommonCode SYSTEMERROR = new CommonCode(false,99999,"系统异常！");
  //操作是否成功
  boolean success;
  //操作代码
  int code;
  //提示信息
  String message;

  public CommonCode(boolean success, int code, String message) {
    this.success = success;
    this.code = code;
    this.message = message;
  }

  @Override
  public boolean success() {
    return success;
  }

  @Override
  public int code() {
    return code;
  }

  @Override
  public String message() {
    return message;
  }


}
