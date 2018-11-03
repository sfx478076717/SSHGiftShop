package com.ziqi.gift.pojos;

import java.util.*;

/**
 * gift礼品类
 * 
 * @author ZIQI
 * @date 2018年4月13日
 */
public class Gift {
	private Integer id;// 礼品id
	private String name;// 礼品名称
	private String giftNo;// 礼品编号
	private Integer typeId;// 礼品类型编号
	private GiftType type;// 礼品类型

	private String title;// 网页标题用于SEO
	private String keywords;// 网页关键字用于SEO
	private String description;// 网页描述用于SEO

	private Integer likes;// 赞的数量
	private Integer sales;// 销售数量

	private String produceTime;// 生产时间
	private String remark;// 介绍
	private boolean deleted;// 删除标志 0:正常 1:回收站

	private String createTime;// 创建时间
	private String creatorName;// 创建人姓名

	private String publishTime;// 发布时间
	private String publishName;// 发布者姓名

	private String downTime;// 下架时间
	private String downName;// 下架人姓名

	private Integer status;// 状态 0：编辑 1：上架 2：下架

	private List<GiftStyle> styles = new ArrayList<GiftStyle>();// 款式集合

	/* 用于标示与用户相关的标志位 */
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
