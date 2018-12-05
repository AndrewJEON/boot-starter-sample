package com.sample.myapplication.common.support;

import org.apache.commons.text.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.myapplication.framework.exception.SampleRuntimeException;

/**
 * 모든 Component의 최상위 클래스
 *
 * @author SungHyun Cheong
 */
public class SampleComponentSupport {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired protected ObjectMapper objectMapper;

	/**
	 * 주어진 객체를 JSON문자열 Serialize (Jackson2 ObjectMapper 사용)
	 * @param object 변환대상 객체
	 * @return JSON 문자열
	 */
	public String toJson(Object object) {
		return toJson(object, null);
	}

	/**
	 * 주어진 객체를 JSON 문자열로 Serialize (Default Jackson2 ObjectMapper 사용)
	 * @param object 변환대상 객체
	 * @param serializationView Serialization에 사용할 View Class(<code>@JsonView</code> 참고)
	 * @return JSON 문자열
	 */
	public String toJson(Object object, Class<?> serializationView) {
		String json = null;

		try {
			if(serializationView != null) {
				json = objectMapper.writerWithView(serializationView).writeValueAsString(object);
			} else {
				json = (object == null) ? null : objectMapper.writeValueAsString(object);
			}
		} catch(JsonProcessingException ex) {
			throw new SampleRuntimeException("Failed to Write as Json", ex);
		}

		return StringEscapeUtils.escapeJson(json);
		//return StringUtils.replace(json, "/", "\\/")
	}
}
