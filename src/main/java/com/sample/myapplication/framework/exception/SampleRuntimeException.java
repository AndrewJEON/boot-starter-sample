package com.sample.myapplication.framework.exception;

/**
 * 예외처리의 최상위 Exception - RuntimeException 계열
 * 기본 RuntimeException 대신 사용
 *
 * @author SungHyun Cheong
 */
public class SampleRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -6698475426820670005L;

	public SampleRuntimeException() {
		super();
	}

	public SampleRuntimeException(String message) {
		super(message);
	}

	public SampleRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public SampleRuntimeException(Throwable cause) {
		super(cause);
	}

	public SampleRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
