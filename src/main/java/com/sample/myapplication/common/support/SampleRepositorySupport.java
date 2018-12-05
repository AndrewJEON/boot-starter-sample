package com.sample.myapplication.common.support;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 모든 Repository의 상위 클래스
 *
 * @author SungHyun Cheong
 */
public class SampleRepositorySupport extends SampleComponentSupport {

	protected String mapperNamespace = this.getClass().getName() + ".";

	@Autowired protected SqlSession sqlSession;


}
