<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/layouts/include.jsp"%>

<!-- HEADER START -->
<!-- 여기에 공통 Header 추가 -->

<!-- Global StyleSheet -->
<!--
	BootStrap
	BootStrap4는 jQuery와 Popper.js를 사용하므로 아래와 같이 추가한다.
	BootStrap의 css만 사용할 경우 css만 추가하면 된다.
-->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>


<!--
	이하 Library들은 npm을 이용한 종속성 관리가 가능하다.
	sample의 경우 여러 npm보다는 CDN을 통해 직접 주입함.
	필요 Library가 있을 경우 추가.
-->

<!--
	BabelPolyfill JS
	Babel은 ES2015+문법을 ES5지원 브라우저에서 해석할 수 있도록 변환해주는 트랜스파일러.
		- 하지만, 새롭게 추가된 전역 객체들(Promise, Map, Set...)과 String.padStart등 전역 객체에 추가된 메서드들은
		  트랜스파일링만으론 해결하기 어렵기 때문에 core-js 나 regenerator-runtime과 같은 별도 polyfill이 필요함.
		- Babel 기반에서 폴리필을 추가하는 방법은 두가지가 존재하는데 babel-polyfill을 사용하는 방법과
		  bable-plugin-transform-runtime을 사용하는 방법.
		- 여기서는 babel-polyfill 사용방법을 채택.
		- 참고 자료: https://programmingsummaries.tistory.com/401
	BabelPolyfill CDN: https://cdnjs.com/libraries/babel-polyfill
-->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/babel-polyfill/7.0.0/polyfill.min.js"></script>

<!--
	UnderScore JS
	UnderScore CDN: https://cdnjs.com/libraries/underscore.js || https://www.jsdelivr.com/package/npm/underscore
	UnderScore String CDN: https://cdnjs.com/libraries/underscore.string || https://www.jsdelivr.com/package/npm/underscore.string
-->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.9.1/underscore-min.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/underscore.string/3.3.5/underscore.string.min.js"></script> -->
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/underscore@1.9.1/underscore.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/underscore.string@3.3.5/index.min.js"></script>

<!--
	Moment JS - 시간관련 Library
	MOMENT CDN: https://cdnjs.com/libraries/moment.js || https://www.jsdelivr.com/package/npm/moment
	MOMENT-TIMEZONE CDN: https://cdnjs.com/libraries/moment-timezone || https://www.jsdelivr.com/package/npm/moment-timezone
-->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.2/moment.min.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.22.2/locale/ko.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment-timezone/0.5.23/moment-timezone.min.js"></script> -->

<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/moment@2.22.2/locale/ko.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/moment-timezone@0.5.23/moment-timezone.js"></script>

<!--
	VueJS
	VueJS CDN: https://cdnjs.com/libraries/vue || https://www.jsdelivr.com/package/npm/vue
	VuexJS CDN: https://cdnjs.com/libraries/vuex || https://www.jsdelivr.com/package/npm/vuex?path=dist
	Vue-validator CDN: https://cdnjs.com/libraries/vue-validator ||  https://www.jsdelivr.com/package/npm/vue-validator?version=2.1.7&path=dist
	Vee-validator CDN: https://cdnjs.com/libraries/vee-validate || https://www.jsdelivr.com/package/npm/vee-validate?path=dist%2Flocale
-->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/vue/2.5.17/vue.min.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/vuex/3.0.1/vuex.min.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/vue-validator/2.1.7/vue-validator.min.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/vee-validate/2.1.1/locale/ko.js"></script> -->
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/vue@2.5.17/dist/vue.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/vuex@3.0.1/dist/vuex.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/vue-validator@2.1.7/dist/vue-validator.min.js"></script>
<script type="text/javascript">
Vue.use(VeeValidate);
</script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/vee-validate@2.1.3/dist/locale/ko.js"></script>

<!--
	axios JS - 현재 가장 성공적인 HTTP 클라이언트 Library.
	axios CDN: https://cdnjs.com/libraries/axios
-->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.18.0/axios.min.js"></script>


<!--
	select2 JS
	select CDN: https://cdnjs.com/libraries/select2 || https://www.jsdelivr.com/package/npm/select2?version=4.0.5
-->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.5/js/select2.min.js"></script> -->
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.5/js/i18n/ko.js"></script> -->
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/select2@4.0.5/dist/js/select2.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/select2@4.0.5/dist/js/i18n/ko.js"></script>

<script type="text/javascript">
	moment.locale("ko");

    //개발환경에 따라 vue devtools 설정
    Vue.config.devtools = window['debug'] || false;
</script>