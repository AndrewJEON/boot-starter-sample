package com.sample.myapplication.config;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

/**
 * Application Custom Configuration
 * - application 설정(yml)에 커스텀 설정 속성정보를 매핑
 *
 * 24. Externalized Configuration 참고
 *
 * @author SungHyun Cheong <hashmap27@gmail.com>
 */

@Data
@Configuration
@ConfigurationProperties(value="app-config")
@Validated
public class AppConfig {

	/** 테스트 속성 */
	@NotNull @NotEmpty
	private String test;

}
