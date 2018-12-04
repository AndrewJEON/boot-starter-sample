package com.sample.myapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Spring Web MVC 관련 설정
 *
 * 28.1.1. Spring MVC Auto-configuration
 *
 * > Custom Configuration 진행.
 * if you want to keep Spring Boot MVC features and you want to add additional MVC configuration
 * (interceptors, formatters, view controllers, and other features)
 * , you can add your own @Configuration class of type WebMvcConfigurer but without @EnableWebMvc
 *
 * @author SungHyun Cheong
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	/**
	 * WebMvcConfigurer 구현
	 * View 관련 부품 추가
	 * View 처리 관련 기술	- apache Tiles3
	 */

	/** ViewResolver 설정 - TilesViewResolver */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		//Apache Tiles3 ViewResolver
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}

	/** TilesConfigurer - Apache Tiles3의 Config 수행 */
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		//Tiles정의 파일의 위치 (scan대상 목록)
		tilesConfigurer.setDefinitions(new String[] {
				"/WEB-INF/layouts/**/*.tiles.xml",
				"/WEB-INF/views/**/*.tiles.xml"
		});
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}

	/** ResourceHandlers - 정적리소스 Cache정책 튜닝 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/* 캐싱정책 */
    	registry.addResourceHandler("/favicon.ico").addResourceLocations("/").setCacheControl(CacheControl.noCache().mustRevalidate());
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/").setCacheControl(CacheControl.noCache().mustRevalidate());
		registry.addResourceHandler("/app/**").addResourceLocations("classpath:/static/app/").setCacheControl(CacheControl.noStore().mustRevalidate()); //아예 저장금지 (noStore)
	}


}
