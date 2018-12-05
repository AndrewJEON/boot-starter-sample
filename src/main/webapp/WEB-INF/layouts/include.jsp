<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="org.slf4j.LoggerFactory"%>
<%@page import="org.slf4j.Logger"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="com.sample.myapplication.framework.core.env.ProfileManager"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%
Logger logger = LoggerFactory.getLogger(this.getClass());

ServletContext sc = request.getServletContext();
ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
ProfileManager profileManager = (ProfileManager) ac.getBean("profileManager");
boolean debug = profileManager.isDebugMode();

//page attribute
//${contextPath}	: application이 배포된 contextPath (정적리소스는 이 경로를 Prefix로 반드시 붙일 것)
//${locale}			: Response에서 사용할 locale (지역화 기준)
//${serverDateTime}	: 서버시간
pageContext.setAttribute("debug", debug);
pageContext.setAttribute("contextPath", request.getContextPath());
pageContext.setAttribute("locale", response.getLocale().toString());
pageContext.setAttribute("localeDashed", response.getLocale().toString().replace("_", "-"));
pageContext.setAttribute("lang", response.getLocale().getLanguage());
pageContext.setAttribute("country", response.getLocale().getCountry());
pageContext.setAttribute("serverTime", LocalDateTime.now());

if(!Boolean.TRUE.equals(pageContext.getAttribute("pageContextJavaScriptIncluded"))) {
	pageContext.setAttribute("pageContextJavaScriptIncluded", Boolean.TRUE);
%>
	<script type="text/javascript">
		window['debug'] = window['debug'] || ${debug};
		window['contextPath'] = window['contextPath'] || "${contextPath}";
		window['locale'] = window['locale'] || "${locale}";
		window['localeDashed'] = window['localeDashed'] || "${localeDashed}";
		window['lang'] = window['lang'] || "${lang}";
		window['country'] = window['country'] || "${country}";
	<c:if test="${not empty meJSON}">
		window['me'] = window['me'] || ${meJSON};
	</c:if>
	</script>
<%}%>