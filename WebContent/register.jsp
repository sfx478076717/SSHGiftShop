<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="top.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
<script type="text/javascript" src="js/jquery-1.10.js"></script>
<script type="text/javascript">
$(function(){
	var username = false;
	var pass_boo = false;
	var check_boo = false;
	
	$(":text:eq(0)").keyup(function(){
		var name = $(this);
		if(name.val()==""){
			$("#f1").html("<font color=red>用户名不能为空</font>");
			username = false;
		}else{
			$("#f1").html("<font color=green>✔</font>");
			username = true;
		}
	});
	$(":text:eq(1)").keyup(function(){
		var pass = $(this);
		//var regexp = /^[a-zA-Z0-9_]+$/;//任意字符
		var regexp = /^(?=.*[a-zA-Z]+)(?=.*[0-9]+)[a-zA-Z0-9_]{3,16}$/;//必须为字母加数字
		
		if(pass.val()==""){
			$("#f2").html("<font color=red>密码不能为空</font>");
			pass_boo = false;
		}else{
			if(regexp.test(pass.val()) == true){
				$("#f2").html("<font color=green>✔</font>");
				pass_boo = true;
			}else{
				$("#f2").html("<font color=red>密码不符合格式要求</font>");
				pass_boo = false;
			}	
		}
	});
	$(":text:eq(2)").keyup(function(){
		var password = $(":text:eq(1)");
		var passcheck = $(":text:eq(2)");
		if(passcheck.val()==""){
			$("#f3").html("<font color=red>确认密码不能为空</font>");
			check_boo = false;
		}else{
			if(password.val()!=passcheck.val()){
				$("#f3").html("<font color=red>两次密码不一致</font>");
				check_boo = false;
			}else{
				$("#f3").html("<font color=green>✔</font>");
				check_boo = true;
			}
		}
		
	});
	$(":submit").click(function(){
		if(username == false || pass_boo == false || check_boo == false || $(":file").val()==""){
			alert("请根据要求填写完整数据！");
			return false;
		}
	});
});
</script>
</head>
<body>
	<h2>用户注册</h2>
	<form action="register.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="user.userName"/></td>
				<td><font id="f1" color="red">*</font></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="user.password"/></td>
				<td><font id="f2" color="red">*</font></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input type="text" name="passcheck"/></td>
				<td><font id="f3" color="red">*</font></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="user.email" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" name="user.sex" /></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="user.birthday" /></td>
			</tr>
			<tr>
				<td>昵称</td>
				<td><input type="text" name="user.nickName" /></td>
			</tr>
			<tr>
				<td>真实姓名</td>
				<td><input type="text" name="user.realName" /></td>
			</tr>
			<tr>
				<td>手机号</td>
				<td><input type="text" name="user.mobile"/></td>
			</tr>
			<tr>
				<td>QQ号</td>
				<td><input type="text" name="user.qq" /></td>
			</tr>
			<tr>
				<td>所在城市</td>
				<td><input type="text" name="user.city" /></td>
			</tr>
			<tr>
				<td>家庭住址</td>
				<td><input type="text" name="user.address" /></td>
			</tr>
			<tr>
				<td>邮编</td>
				<td><input type="text" name="user.postcode" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="注册"/></td>
			</tr>
		</table>
		
	</form>
</body>
</html>