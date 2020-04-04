package com.aurora.commom.exception;

import com.aurora.model.result.ResultCode;

/**
 * 自定义异常类
 */
public class Myexception extends RuntimeException {
  private ResultCode resultCode;
    public Myexception(ResultCode resultCode) {
      super("错误代码: "+resultCode.code()+"  错误信息: "+resultCode.message());
      this.resultCode = resultCode;
    }

  public ResultCode getResultCode(){
    return this.resultCode;
  }

}
