/**
 * com Inc
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package com.hightech.apidoc.common.knife.result;

/**
 * 公共/遗留状态码
 * 
 * @author user
 * @version $Id: CommonStateCode.java, v 0.1 2015年9月10日 下午5:18:51 user Exp $
 */
public interface CommonStateCode {
	//基础状态码
	StateCode SUCCESS = new StateCode(0, "成功");
	StateCode ILLEGAL_PARAMETER = new StateCode(-102, "无效的参数");
	StateCode DUPLICATE_INVOKE = new StateCode(-108,"重复调用");
	StateCode PARAMETER_LACK =  new StateCode(-101, "请求参数缺失");
	StateCode BODY_LACK =  new StateCode(-100, "post请求消息体缺失");
	StateCode ILLEGAL_TOKEN =  new StateCode(-106, "非法的token");
	StateCode NO_RELATED_DATA =  new StateCode(-107,"无相关数据");
	StateCode FAILED =  new StateCode(-110, "操作失败");
	StateCode OPERATE_UP_LIMIT =  new StateCode(-111, "操作上限");
	StateCode DATA_EMPTY =  new StateCode(-302,"返回数据为空");
	StateCode PARSE_ERROR =  new StateCode(-306,"参数解析失败");
	StateCode DATA_ERROR =  new StateCode(-307,"返回数据格式错误");
	StateCode ILLEGAL_SIGN = new StateCode(-701, "无效的签名");
	StateCode OVERDUE_TIME = new StateCode(-702, "超时的时间戳");
	StateCode ERROR_REQUEST = new StateCode(-995,"错误的请求");
	StateCode DB_ERROR = new StateCode(-996,"数据库异常");
	StateCode INNER_SERVER_ERROR = new StateCode(-997, "非正常的内部服务");
	StateCode SERVERS_LINK_ERROR = new StateCode(-998, "服务器间通信异常");
	StateCode OTHER_SERVER_ERROR = new StateCode(-999, "亲，服务器君又开小差了.您放心，我们的程序猿正批评教育之");

}
