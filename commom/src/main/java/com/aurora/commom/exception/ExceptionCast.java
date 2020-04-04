package com.aurora.commom.exception;

import com.aurora.model.result.ResultCode;

/**
 * 异常抛出类
 */
public class ExceptionCast {

  /**
   * 抛出我的异常
   * @param resultCode
   */
  public static void Myexception(ResultCode resultCode){
    throw  new Myexception(resultCode);
  }


}
