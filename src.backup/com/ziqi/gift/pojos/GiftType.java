package com.ziqi.gift.pojos;

import java.util.Set;

/**
 * @author ZIQI
 * @date 2018年4月13日
 */
public class GiftType {

	private Integer id;// 主键Id

	private String name;// 类型名称

	private Integer parentId;// 父类型id

	private String pic;// 该类型对应的图片

	private Integer orderNum;// 用于排序

	private String picUuid;// 图片对应的uuid名称

	private Set<GiftType> subTypes;// 子类型

	private Gift first;// 第一个对象

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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public String getPicUuid() {
		return picUuid;
	}

	public void setPicUuid(String picUuid) {
		this.picUuid = picUuid;
	}

	public Set<GiftType> getSubTypes() {
		return subTypes;
	}

	public void setSubTypes(Set<GiftType> subTypes) {
		this.subTypes = subTypes;
	}

	public Gift getFirst() {
		return first;
	}

	public void setFirst(Gift first) {
		this.first = first;
	}
}
