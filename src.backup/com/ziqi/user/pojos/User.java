package com.ziqi.user.pojos;

import java.util.Date;

/**
 * �û���
 * 
 * @author ZIQI
 * @date 2018��4��13��
 */
public class User {
	public void setUserName(String userName) {
		this.userName = userName;
	}

	private int id;
	private String userName;// �û���
	private String password;// ����
	private String email;// ����
	private String sex;// �Ա�
	private Date birthday;;// ����
	private String nickName;;// �ǳ�
	private String realName;;// ��ʵ����
	private String mobile;// �ֻ���
	private String qq;// QQ��
	private String city;// ���ڳ���
	private String address;// ��ͥסַ�������棬��Ҫ������ʼ�
	private String postcode;// �ʱ�
	
	/*private String headImg;// ͷ��ͼƬ��url
	private float money;// �˻����
	private int point;// ����
	private Date createTime;// ����ʱ��
	private Date updateTime;// ����ʱ��
	private int status;// �û�״̬��0����������1������
	private int deleted;// 0����������1������
	private String ticket;// ���뼤��ʱ��Ҫ��Ʊ��
	private Date lastLoginTime;// ����¼ʱ��
	private String lastLoginIp;// ����½IP
	private String mobileToken;// �ֻ�token
	private String work;// ְҵ
	private int bindStatus;// ��״̬��0����������1������
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
