package com.ziqi.gift.pojos;

/**
 * 款式与礼品是多对一关系
 * 
 * @author ZIQI
 * @date 2018年4月26日
 */
public class GiftStyle {

	private Integer id;// 主键Id

	private Integer giftId;// 对应Gift的Id
	private Gift gift;// 所属Gift

	private String name;// 款式名称
	private Float price;// 款式价格
	private Float discount;// 折扣价格

	private String pic1;// 款式对应图片1
	private String pic2;// 款式对应图片2
	private String pic3;// 款式对应图片3
	private String pic4;// 款式对应图片4
	private String pic5;// 款式对应图片5

	private Integer orderNum;// 款式顺序
	private String remark;// 款式描述
	/**
	 * 临时字段，记录某用户的购买量，不记录到数据库
	 */
	private Integer orderCount;//
	private String orderRemark;//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGiftId() {
		return giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public Gift getGift() {
		return gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String getPic1() {
		return pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic2() {
		return pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic3() {
		return pic3;
	}

	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public String getPic4() {
		return pic4;
	}

	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public String getPic5() {
		return pic5;
	}

	public void setPic5(String pic5) {
		this.pic5 = pic5;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

}
