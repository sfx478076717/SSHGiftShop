package com.ziqi.gift.pojos;

import java.util.Set;

/**
 * @author ZIQI
 * @date 2018��4��13��
 */
public class GiftType {

	private Integer id;// ����Id

	private String name;// ��������

	private Integer parentId;// ������id

	private String pic;// �����Ͷ�Ӧ��ͼƬ

	private Integer orderNum;// ��������

	private String picUuid;// ͼƬ��Ӧ��uuid����

	private Set<GiftType> subTypes;// ������

	private Gift first;// ��һ������

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
