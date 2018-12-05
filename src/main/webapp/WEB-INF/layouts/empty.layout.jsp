<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="org.slf4j.LoggerFactory"%>
<%@page import="org.slf4j.Logger"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<title><tiles:insertAttribute name="title"/></title>
		<tiles:insertAttribute name="globalheader"/>
	</head>

	<body>
		<!-- Page Container -->
		<div class="page-container">
			<!-- Page Content -->
			<div class="page-content">
				<!-- Main Content -->
				<div class="content-wrapper">
					<!-- Content Area -->
					<div class="content">
						<tiles:insertAttribute name="body" />
						<tiles:insertAttribute name="footer" />
					</div>
					<!-- /Content Area -->
				</div>
			</div>
		</div>
	</body>
</html>