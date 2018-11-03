package com.ziqi.user.pojos;

import java.util.Date;

/**
 * 用户类
 * 
 * @author ZIQI
 * @date 2018年4月13日
 */
public class User {
	public void setUserName(String userName) {
		this.userName = userName;
	}

	private int id;
	private String userName;// 用户名
	private String password;// 密码
	private String email;// 邮箱
	private String sex;// 性别
	private Date birthday;;// 生日
	private String nickName;;// 昵称
	private String realName;;// 真实姓名
	private String mobile;// 手机号
	private String qq;// QQ号
	private String city;// 所在城市
	private String address;// 家庭住址，完整版，需要发快递邮寄
	private String postcode;// 邮编
	
	/*private String headImg;// 头像图片的url
	private float money;// 账户余额
	private int point;// 积分
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间
	private int status;// 用户状态：0代表正常，1代表冻结
	private int deleted;// 0代表正常，1代表冻结
	private String ticket;// 密码激活时需要的票据
	private Date lastLoginTime;// 最后登录时间
	private String lastLoginIp;// 最后登陆IP
	private String mobileToken;// 手机token
	private String work;// 职业
	private int bindStatus;// 绑定状态：0代表正常，1代表冻结
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
