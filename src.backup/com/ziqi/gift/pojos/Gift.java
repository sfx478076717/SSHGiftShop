package com.ziqi.gift.pojos;

import java.util.*;

/**
 * gift��Ʒ��
 * 
 * @author ZIQI
 * @date 2018��4��13��
 */
public class Gift {
	private Integer id;// ��Ʒid
	private String name;// ��Ʒ����
	private String giftNo;// ��Ʒ���
	private Integer typeId;// ��Ʒ���ͱ��
	private GiftType type;// ��Ʒ����

	private String title;// ��ҳ��������SEO
	private String keywords;// ��ҳ�ؼ�������SEO
	private String description;// ��ҳ��������SEO

	private Integer likes;// �޵�����
	private Integer sales;// ��������

	private String produceTime;// ����ʱ��
	private String remark;// ����
	private boolean deleted;// ɾ����־ 0:���� 1:����վ

	private String createTime;// ����ʱ��
	private String creatorName;// ����������

	private String publishTime;// ����ʱ��
	private String publishName;// ����������

	private String downTime;// �¼�ʱ��
	private String downName;// �¼�������

	private Integer status;// ״̬ 0���༭ 1���ϼ� 2���¼�

	private List<GiftStyle> styles = new ArrayList<GiftStyle>();// ��ʽ����

	/* ���ڱ�ʾ���û���صı�־λ */
	private boolean liked;//
	private boolean collected;//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGiftNo() {
		return giftNo;
	}

	public void setGiftNo(String giftNo) {
		this.giftNo = giftNo;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public GiftType getType() {
		return type;
	}

	public void setType(GiftType type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getProduceTime() {
		return produceTime;
	}

	public void setProduceTime(String produceTime) {
		this.produceTime = produceTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getPublishName() {
		return publishName;
	}

	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}

	public String getDownTime() {
		return downTime;
	}

	public void setDownTime(String downTime) {
		this.downTime = downTime;
	}

	public String getDownName() {
		return downName;
	}

	public void setDownName(String downName) {
		this.downName = downName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<GiftStyle> getStyles() {
		return styles;
	}

	public void setStyles(List<GiftStyle> styles) {
		this.styles = styles;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public boolean isCollected() {
		return collected;
	}

	public void setCollected(boolean collected) {
		this.collected = collected;
	}

}
