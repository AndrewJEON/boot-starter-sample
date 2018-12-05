<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="pageTitleVM" class="" style="border-left: 1px solid #ddd; border-right: 1px solid #ddd;">
	<div class="page-header-content">
		<div class="page-title">
			<h4>
				<i class="icon-arrow-left52 position-left"></i>
				<span class="text-semibold" v-if="pageTitle">{{pageTitle}}</span>
				<small class="display-block" v-if="pageDescription">{{pageDescription}}</small>
			</h4>
			<a class="heading-elements-toggle"><i class="icon-more"></i></a>
		</div>

		<div class="heading-elemnts">
			<ul class="breadcrumb heading-text">
				<li><a href="${contextPath}/"><i class="icon-home2 position-left"></i> Home</a></li>
				<li v-if="parentMenuTitle">{{parentMenuTitle}}</li>
				<li class="active" v-if="subMenuTitle">{{subMenuTitle}}</li>
			</ul>
		</div>
	</div>
</div>

<script type="text/javascript">
	var pageTitleVM = new Vue({
		name: "PageTitleVM",
		el: "#pageTitleVM",
		data: {
			pateTitle: "",
			pateDescription: "",
			subMenuTitle: "",
			parentMenuTitle: ""
		},
		methods: {
			setPageLocation: function (dataNav, pageDesc, pageTitle) {
				//좌측메뉴찾기
				dataNav = dataNav || document.location.pathname;
				var subMenu = $("#navigation > li ul > li > a[data-nav='" + dataNav + "']");
				if(subMenu.size()==0) {
					subMenu = $("#navigation > li ul > li > a[href='" + contextPath + "/" + dataNav + "']");
				}
				if(subMenu.size()==0) {
					console.log("지정한 메뉴를 찾을 수 었습니다. dataNav: " + dataNav);
				}
				var parentMenu = subMenu.parent().parents("li");

				//expand menu
				$(".navigation .active").removeClass("active"); //collapse old active navigation
				parentMenu.addClass("active").children("ul").show();
				parentMenu.children("ul").show();
				subMenu.parent().addClass("active");

				//breadcrumb
				this.$data.subMenuTitle = subMenu.text();
				this.$data.parentMenuTitle = parentMenu.find("> a span").text();

				//pageTitle
				this.$data.pageTitle = pageTitle || this.$data.subMenuTitle;

				//pageDescription
				this.$data.pageDescription = pageDesc || subMenu.attr('data-desc');
			}
		},
		mounted: function () {
			this.$nextTick(function () {
		    	// 모든 화면이 렌더링된 후 실행합니다.
		    	this.setPageLocation();
	    	})
	   	}
	});
</script>