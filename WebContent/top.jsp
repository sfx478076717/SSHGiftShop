<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="css/top.css" rel="stylesheet" style="text/css" />
<script>
	function exit() {
		if (confirm("确认要退出系统 ？")) {
			location.href = "index.jsp";
		}
	}
</script>
</head>
<body>

	<table align="right" height="34" width="100">
		<tr>
			<s:if test="%{username!=null}">
				<td>
					<div class="nav" id="sunav">
						<ul>
							<li class="sunav"><a href="" >${username}</a> <span>
									<ul>
										<li><a href="">购物车</a></li>
										<li><a href="">我的订单</a></li>
										<li><a href="">收礼人</a></li>
										<li><a href="">我的收藏</a></li>
										<li><a onclick="exit()">安全退出</a></li>
									</ul>
							</span></li>
						</ul>
					</div>

				</td>
				<td><a href="register.jsp" class="login_button">注 册</a></td>
			</s:if>
			<s:else>
				<td><a href="login.jsp" class="login_button">登 录</a></td>
				<td><a href="register.jsp" class="login_button">注 册</a></td>
			</s:else>
		</tr>
	</table>
</body>
</html>