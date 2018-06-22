package com.optimal.kdm.common.utils;

import java.io.Serializable;
import org.slf4j.MDC;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("Json响应数据")
@Data
public class ResultResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4076568121456415472L;

	@ApiModelProperty("true成功 false失败")
	private boolean success;

	private String message;

	@ApiModelProperty("请求ID")
	private String logMessageId;

	@ApiModelProperty("返回数据")
	private Object result;

	
	public static ResultResponse ok(String message) {
		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setSuccess(true);
		resultResponse.setMessage(message);
		resultResponse.setLogMessageId(MDC.get(Constants.GLOBAL_MSG_ID));
		
		return resultResponse;
	}
	
	public static ResultResponse ok(String message, Object result) {
		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setSuccess(true);
		resultResponse.setMessage(message);
		resultResponse.setLogMessageId(MDC.get(Constants.GLOBAL_MSG_ID));
		resultResponse.setResult(result);
		
		return resultResponse;
	}
	
	public static ResultResponse fail(String message) {
		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setSuccess(false);
		resultResponse.setMessage(message);
		resultResponse.setLogMessageId(MDC.get(Constants.GLOBAL_MSG_ID));
		
		return resultResponse;
	}

}
