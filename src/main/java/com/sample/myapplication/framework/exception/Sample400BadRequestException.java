package com.sample.myapplication.framework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * HttpStatus.BAD_REQUEST로 응답하는 API 예외 클래스
 *
 * @author SungHyun Cheong
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class Sample400BadRequestException extends SampleApiException {

	private static final long serialVersionUID = -1372560163309414479L;

	public Sample400BadRequestException(String errorCode) {
		super(HttpStatus.BAD_REQUEST, errorCode);
	}

	public Sample400BadRequestException(String errorCode, Throwable cause) {
		super(HttpStatus.BAD_REQUEST, errorCode, cause);
	}

	public Sample400BadRequestException(String errorCode, String message, String verbose) {
		super(HttpStatus.BAD_REQUEST, errorCode, message, verbose);
	}

	public Sample400BadRequestException(String errorCode, String message, String verbose, Throwable cause) {
		super(HttpStatus.BAD_REQUEST, errorCode, message, verbose, cause);
	}

	public Sample400BadRequestException(String errorCode, String message, String verbose, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(HttpStatus.BAD_REQUEST, errorCode, message, verbose, cause, enableSuppression, writableStackTrace);
	}

}
