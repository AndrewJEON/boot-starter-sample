package com.sample.myapplication.framework.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * API Exception - HttpStatus, errorCode, message, verboseMessage를 가짐
 *
 * @author SungHyun Cheong
 */
@Getter
public class SampleApiException extends SampleRuntimeException {

	private static final long serialVersionUID = 5079208252714965964L;

	private final HttpStatus status;

	private final String errorCode;

	private final String message;

	/** 에러 상세 메시지 */
	private String verbose;

	public SampleApiException(HttpStatus status, String errorCode) {
		super(errorCode);
		this.status = status;
		this.errorCode = errorCode;
		this.message = errorCode;
	}

	public SampleApiException(HttpStatus status, String errorCode, Throwable cause) {
		super(errorCode, cause);
		this.status = status;
		this.errorCode = errorCode;
		this.message = errorCode;
	}

	public SampleApiException(HttpStatus status, String errorCode, String message, String verbose) {
		super(errorCode);
		this.status = status;
		this.errorCode = errorCode;
		this.message = message;
		this.verbose = verbose;
	}

	public SampleApiException(HttpStatus status, String errorCode, String message, String verbose, Throwable cause) {
		super(errorCode, cause);
		this.status = status;
		this.errorCode = errorCode;
		this.message = message;
		this.verbose = verbose;
	}

	public SampleApiException(HttpStatus status, String errorCode, String message, String verbose, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(errorCode, cause, enableSuppression, writableStackTrace);
		this.status = status;
		this.errorCode = errorCode;
		this.message = message;
		this.verbose = verbose;
	}

}
