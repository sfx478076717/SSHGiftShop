package com.ziqi.gift.pojos;

/**
 * ��ʽ����Ʒ�Ƕ��һ��ϵ
 * 
 * @author ZIQI
 * @date 2018��4��26��
 */
public class GiftStyle {

	private Integer id;// ����Id

	private Integer giftId;// ��ӦGift��Id
	private Gift gift;// ����Gift

	private String name;// ��ʽ����
	private Float price;// ��ʽ�۸�
	private Float discount;// �ۿۼ۸�

	private String pic1;// ��ʽ��ӦͼƬ1
	private String pic2;// ��ʽ��ӦͼƬ2
	private String pic3;// ��ʽ��ӦͼƬ3
	private String pic4;// ��ʽ��ӦͼƬ4
	private String pic5;// ��ʽ��ӦͼƬ5

	private Integer orderNum;// ��ʽ˳��
	private String remark;// ��ʽ����
	/**
	 * ��ʱ�ֶΣ���¼ĳ�û��Ĺ�����������¼�����ݿ�
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
