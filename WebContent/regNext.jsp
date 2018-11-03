<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="top.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完善资料</title>
</head>
<body>
	<h2>资料完善</h2>
	<form action="" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" name="sex" /></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="birthday" /></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" name="nickName" /></td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="realName" /></td>
			</tr>
			<tr>
				<td>QQ号</td>
				<td><input type="text" name="QQ" /></td>
			</tr>
			<tr>
				<td>所在城市</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>家庭住址</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>邮编</td>
				<td><input type="text" name="postcode" /></td>
			</tr>

		</table>
		<input type="submit" value="注册" />
	</form>
</body>
</html>