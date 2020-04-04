package com.aurora.commom.exception;

import com.aurora.model.response.CommonCode;
import com.aurora.model.response.ResponseResult;
import com.aurora.model.result.ResultCode;
import com.sun.deploy.net.HttpRequest;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常捕获类
 */
@ControllerAdvice
public class ExceptionCatch {

  @ExceptionHandler(Myexception.class)
  @ResponseBody
  public ResponseResult customException(Myexception e){
    ResultCode resultCode = e.getResultCode();
    ResponseResult responseResult = new ResponseResult(resultCode);
    return responseResult;
  }

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public ResponseResult SystemException(HttpServletRequest request, Exception e) throws IOException {
    System.out.println(request.getRequestURI()+" "+request.getParameter("a"));
    //获取请求体中的参数
    Map<String, String> parameterByHttpServletRequest = getParameterByHttpServletRequest(request);
    System.out.println(parameterByHttpServletRequest);
    ResponseResult responseResult = new ResponseResult(CommonCode.SYSTEMERROR);
    e.printStackTrace();
    return responseResult;
  }

  @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
  @ResponseBody
  public ResponseResult HttpRequestMethodNotSupportedException(Exception e) {
    ResponseResult responseResult = new ResponseResult(CommonCode.SYSTEMERROR);
    e.printStackTrace();
    responseResult.setMessage(e.getMessage());
    return responseResult;
  }

  /**
   * 从HttpServletRequest中1获取参数和值
   * @param request
   * @return
   */
  private Map<String,String> getParameterByHttpServletRequest(HttpServletRequest request){
    Map<String,String> parameterMap = new HashMap<>();
    Enumeration em = request.getParameterNames();
    while (em.hasMoreElements()) {
      String name = (String) em.nextElement();
      parameterMap.put(name,request.getParameter(name));
    }
    return parameterMap;
  }

}
