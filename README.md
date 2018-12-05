# Boot Starter Sample #

### 이 저장소는? ###

* Spring Boot 2.1.1.RELEASE Version Sample

### Sample의 목적? ###

* 목표
    * Restful API 호출 가능할 것
    * JSP를 이용한 View 처리가 가능할 것
        * Tiles와 VueJS를 이용
    * Spring Security를 이용한 인증 및 인가 체계 도입
    * Spring Boot Reference 학습.
        * Spring Boot Reference Guide 문서 순서대로 Sample 작성 진행


* 프로젝트 환경
    * Java & Spring Framework Base Line
        * JDK 8
        * Spring Boot 2.1.1.RELEASE
        * Spring Framework 5.1.3.RELEASE
        * Spring Cloud Greenwich.M3
    * Maven 3.3+
    * Sevlet Containers
        * tomcat 9.0 - Servlet Version 4.0


* 주요 사항
    * Spring Boot 기반으로 작성된 Sample
    * Spring, Apache등 Global에서 검증된 Library를 지향
        * 개인적인 Util성 기능 개발은 지양


* Maven Dependency
    * spring-boot-starter-web: Spring Web(MVC 모델로 개발)
    * spring-boot-starter-validation: JSR-303 Validation 지원(구현체는 Hibernate-validator)
    * spring-cloud-starter-sleuth: 분산트레이스 지원(TraceId, SpanId부여)
    * spring-boot-starter-actuator: Production Level의 모니터링 지원
    * spring-boot-starter-aop: Spring AOP
    * mybatis-spring-boot-starter: 마이바티스 지원
    * (개발용)lombok: 코딩생산성 향싱 지원
    * jstl: JSP 표준 태그 라이브러리
    * tomcat-embed-jasper: JSP 엔진
    * spring-security-taglibs: Spring Security 태그지원
    * guava: google이 작성한 자바 오픈소스 라이브러리. 유용한 유틸함수와 클래스 제공.
    * commons-lang3: apache commons 계열 library로 java.lang의 클래스에 대하 추가 기능 제공
    * commons-text: apache commons 계열 library로 문자열 작업 알고리즘에 중점을 둔 라이브러리
    * commons-io: apache commons 계열 library로 I/O기능 개발 지원 유틸리티 라이브러리
    * jackson-dataformat-xml: jackson의 xml 직렬화/역질렬화 지원
    * woodstox-cor-asl: JDK의 StAX구현보다 빠르고 출력모양 및 공간처리가 우수
        * https://github.com/FasterXML/woodstox/wiki
    * titles-jsp: apache tiles3 library
    * (개발용)spring-boog-configuration-processor: spring boot의 configuration 개발도구 지원
    * (개발용)spring-boot-devtools: 소스 수정 시 자동재배포로 개발생산성 향상 지원
    * (개발용)spring-boot-starter-test: spring Test
    * 추가 시 지속 갱신 예정.


* JavaScript 및 Client Layer Dependency
    * BootStrap4 - Client view처리를 위한 디자인.
        * https://getbootstrap.com
    * BabelPolyfill - 트랜스파일러.
        * https://babeljs.io
    * Underscore, Underscore.String - 기본 JavaScript 객체들을 확장하지 않고 함수형 프로그래밍을 지원할 수 있는 Library
        * https://underscorejs.org
    * moment, moment-locale, moment-timezone - JavaScript 시간관련 Library
        * https://momentjs.com
        * https://momentjs.com/timezone
    * VueJS - vue 프레임워크
        * https://kr.vuejs.org
    * Vuex - vue의 상태관리 프레임워크(Redux에 영감을 받은 상태관리 Dispatch패턴. Vuex는 복잡한 페이지에서 유용함)
        * https://vuex.vuejs.org/kr
    * vee-validate: Vue용 validate library
        * https://baiant.github.io/vee-validate
    * axios - HTTP Client Library
        * https://github.com/axios/axios
    * select2, i18n/ko - jquery plugin(일반 selectbox 기능 확장)
        * https://select2.org

<br />

### 연락처 ###

* 정성현 <hashmap27@gmail.com> or <public27@naver.com>