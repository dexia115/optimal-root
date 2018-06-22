package com.optimal.kdm.common.utils.exception;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3286433140006922463L;

	private Integer code;
	
	private String message;

	public BusinessException() {
	}

	public BusinessException(int code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

}
