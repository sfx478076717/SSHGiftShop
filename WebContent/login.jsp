<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link href="css/login.css" rel="stylesheet" style="text/css" />
</head>
<body>
<s:include value="top.jsp"/>
	<div class="login_content">
		<div class="login_name">
			<h3>用户登录</h3>
			<form action="login.action" method="post">
				<div>
					用户名：<input name="username" id="username" type="text"
						class="login_input" />
				</div>
				<div>
					密&nbsp;&nbsp;&nbsp;&nbsp;码：<input name="password" id="password"
						type="password" class="login_input" />
				</div>
				<div align="center">
				<table>
					<tr>
						<td>
							<input type="submit" class="login_button" value="登&nbsp;&nbsp;录"/>
						</td>
						<td>
							<input type="button" class="login_button" value="注&nbsp;&nbsp;册"/>
						</td>
					</tr>
				</table>
				</div>
				
				<a href="" >忘记密码？</a><br/>
				<s:fielderror />
			</form>
		</div>
	</div>
	
</body>
</html>