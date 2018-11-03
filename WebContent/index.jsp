<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<s:include value="top.jsp" />
<link type="text/css" href="styles/css/style.css" rel="stylesheet">
<link type="text/css" href="styles/css/img.css" rel="stylesheet">

</head>
<body>
	<br>
	<%-- <s:if test="%{username!=null}"> --%>
	<div class="top_bg">
		<div class="top_content">
			<div class="logo">
				<a href="index.jsp"><img src="styles/images/logo.png" /></a>
			</div>
			<ul class="nav1">
				<li><a href="index.jsp" class="white">首页</a></li>
				<li><a href="#" class="white">礼品中心</a></li>
				<li><a href="#" class="white" target="_parent">送礼攻略</a></li>
				<li><a href="#" class="white" target="_parent">下载APP</a></li>
			</ul>
		</div>
	</div>

	<!--头部end-->
	<!--banner start-->
	<div class="lp_img">
		<img src="styles/images/img2.png" />
	</div>

	<!--banner end-->
	<!--服务类别 start-->
	<div class="pics">
		<ul>
			<li class="pic4"><div class="arrow_pink2">
					<h3>他人代付</h3>
					<h4 class="pic_text2">
						想要礼物，发到<br />朋友圈里求代付，<br />测试人品的时候到了！
					</h4>
				</div></li>
			<li class="pic5"><div class="arrow_pink2">
					<h3>定时送达</h3>
					<h4 class="pic_text2">
						就想要礼物<br />在某一天送到？<br />礼记不会让你错过！
					</h4>
				</div></li>
			<li class="pic6"><div class="arrow_pink2">
					<h3>语音贺卡</h3>
					<h4 class="pic_text2">
						扫描二维码<br />听祝福留言，<br />送礼送出新玩法！
					</h4>
				</div></li>
		</ul>
		<div class="clear"></div>
	</div>
	<!--服务类别 end-->
	<div class="clear"></div>
	<div class="ws_bg">
		<!--七大图标 start-->
		<div class="clear"></div>
		<ul class="tb_list" style="margin-top: 10px;">
			<li><span class="tb1"></span>
				<p>礼物首选</p></li>
			<li><span class="tb2"></span>
				<p>正品采购</p></li>
			<li><span class="tb3"></span>
				<p>闪电发货</p></li>
			<li><span class="tb4"></span>
				<p>精美包装</p></li>
			<li><span class="tb5"></span>
				<p>万千信赖</p></li>
			<li><span class="tb6"></span>
				<p>全场包邮</p></li>
			<li><span class="tb7"></span>
				<p>退货保障</p></li>

		</ul>
		<!--七大图标 end-->
		<div class="clear"></div>
	</div>
	<div class="clear"></div>
	<!--底部-->
	<!--底部start-->
	<div class="clear"></div>
	<div class="footer">
		<div class="footer_content">
			<span class="contat_foot">联系我们<br /> 客服中心：178-6428-2316<br />
				客服邮箱：ziqi1106@163.com<br /> 官网地址：www.itshixun.com
			</span> <span class="weixin"></span>
			<dl class="aboutus">
				<dd>
					<a href="#" target="_parent">关于我们</a>
				</dd>
				<dd>
					<a href="#" target="_parent">加入我们</a>
				</dd>
				<dd>
					<a href="#" target="_parent">商业合作</a>
				</dd>
			</dl>
		</div>
		<p align="center"
			style="font-size: 14px; clear: both; margin-top: 5px;">
			ZIQI 版权所有 &nbsp;&nbsp;All Rights Reserved&nbsp;&nbsp;
			鲁ICP备13021294
			<script type="text/javascript">
				var cnzz_protocol = (("https:" == document.location.protocol) ? " https://"
						: " http://");
				document
						.write(unescape("%3Cspan id='cnzz_stat_icon_1253772990'%3E%3C/span%3E%3Cscript src='"
								+ cnzz_protocol
								+ "s4.cnzz.com/z_stat.php%3Fid%3D1253772990%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
			</script>
		</p>
	</div>
	<!-- <h2>尚未登陆</h2>
		对不起，您还未登录，不能查看更多！ -->


</body>
</html>