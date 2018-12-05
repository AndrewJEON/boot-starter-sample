package com.sample.myapplication.framework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * HttpStatus.NOT_FOUND로 응답하는 API 예외 클래스
 *
 * @author SungHyun Cheong
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class Sample404NotFoundException extends SampleApiException {

	private static final long serialVersionUID = -920716545660662747L;

	public Sample404NotFoundException(String errorCode) {
		super(HttpStatus.NOT_FOUND, errorCode);
	}

	public Sample404NotFoundException(String errorCode, Throwable cause) {
		super(HttpStatus.NOT_FOUND, errorCode, cause);
	}

	public Sample404NotFoundException(String errorCode, String message, String verbose) {
		super(HttpStatus.NOT_FOUND, errorCode, message, verbose);
	}

	public Sample404NotFoundException(String errorCode, String message, String verbose, Throwable cause) {
		super(HttpStatus.NOT_FOUND, errorCode, message, verbose, cause);
	}

	public Sample404NotFoundException(String errorCode, String message, String verbose, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(HttpStatus.NOT_FOUND, errorCode, message, verbose, cause, enableSuppression, writableStackTrace);
	}

}
