package com.sample.myapplication.framework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * HttpStatus.CONFLICT로 응답하는 API 예외 클래스
 *
 * @author SungHyun Cheong
 */
@ResponseStatus(code = HttpStatus.CONFLICT)
public class Sample409ConflictException extends SampleApiException {

	private static final long serialVersionUID = -4002580765336985225L;

	public Sample409ConflictException(String errorCode) {
		super(HttpStatus.CONFLICT, errorCode);
	}

	public Sample409ConflictException(String errorCode, Throwable cause) {
		super(HttpStatus.CONFLICT, errorCode, cause);
	}

	public Sample409ConflictException(String errorCode, String message, String verbose) {
		super(HttpStatus.CONFLICT, errorCode, message, verbose);
	}

	public Sample409ConflictException(String errorCode, String message, String verbose, Throwable cause) {
		super(HttpStatus.CONFLICT, errorCode, message, verbose, cause);
	}

	public Sample409ConflictException(String errorCode, String message, String verbose, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(HttpStatus.CONFLICT, errorCode, message, verbose, cause, enableSuppression, writableStackTrace);
	}

}
