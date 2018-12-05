package com.sample.myapplication.framework.core.env;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.EnumUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.sample.myapplication.config.type.ServerProfileType;

/**
 * Spring Profile Manager
 *
 * @author SungHyun Cheong
 */
@Component
public class ProfileManager implements InitializingBean {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired Environment environment;

	/** 환경에서 Active Profile 목록 추출  */
	public List<String> getActiveProfiles() {
		return Arrays.asList(environment.getActiveProfiles());
	}

	/** 환경에서 default Profile 목록 추출 */
	public List<String> getDefaultProfiles() {
		return Arrays.asList(environment.getDefaultProfiles());
	}

	/** 운영환경인가? */
	public boolean isProduction() { return is(ServerProfileType.PRODUCTION); }

	/** 스테이지환경인가? */
	public boolean isStage() { return is(ServerProfileType.STAGE); }

	/** 개발환경인가? */
	public boolean isDevelopment() { return is(ServerProfileType.DEVELOPMENT); }

	/** 로컬환경인가? */
	public boolean isLoacl() { return is(ServerProfileType.LOCAL); }

	/** Debug 모드인가? */
	public boolean isDebugMode() { return isLoacl() || isDevelopment() || isStage(); }

	/** 주어진 Profile이 Spring Profiles Active에 포함하는지 여부 */
	public boolean is(ServerProfileType serverProfileType) {
		return getActiveProfiles().contains(serverProfileType.name().toLowerCase());
	}

	/** 서버 Spring Profile */
	private ServerProfileType serverProfile = null;
	/** 서버 Spring Profile */
	public ServerProfileType getServerProfile() {
		return serverProfile;
	}
	/** 서버 Spring Profile 초기화 */
	private void initServerProfile() {
		Optional<ServerProfileType> optionalServerProfile = EnumUtils.getEnumList(ServerProfileType.class)
				.stream()
				.filter(item -> is(item))
				.findFirst();
		serverProfile = optionalServerProfile.isPresent() ? optionalServerProfile.get() : null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//서버 Spring Profile
		initServerProfile();
		logger.info(
				"\r\n=====================================" +
				"\r\n# Spring Active Profiles: " + getActiveProfiles() +
				"\r\n# Spring Default Profiles: " + getDefaultProfiles() +
				"\r\n=====================================");
	}

}
