package com.aurora.model.response;

import com.aurora.model.result.QueryResult;
import com.aurora.model.result.ResultCode;
import lombok.ToString;

/**
 *
 * 查询响应的结果 包含数据集 queryResult和结构代码 resultCode
 */
@ToString
public class QueryResponseResult extends ResponseResult {
  QueryResult queryResult;

  public QueryResponseResult(ResultCode resultCode,QueryResult queryResult) {
    super(resultCode);
    this.queryResult = queryResult;
  }
}
