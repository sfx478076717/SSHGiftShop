package com.ziqi.gift.pojos;

/**
 * @author ZIQI
 * @date 2018��4��26��
 */
public class Order {
	/**
	 * ״̬:���׳ɹ� 
	 * ǰ̨��ȷ���ջ���,״̬�ı�
	 */
	public static final int PAY_SUCCESS = 1;
	/**
	 * ״̬:���׹ر� 
	 * ��̨:�˻��󣬽��׹ر� �� ǰ̨������ʱ�󣬽��׹ر� �� ǰ̨�����˻�����̨�������˻�����ť
	 * ������֧��ʱ,�û�Ҳ����ѡ�����ö������йر�
	 */
	public static final int PAY_CLOSED = 2;
	/**
	 * ״̬����Ҵ�֧�� 
	 * ǰ̨���û��ύ�������޸�����Ҵ�֧��״̬
	 */
	public static final int PAY_DAIZHIFU = 3;
	/**
	 * ״̬�������֧�� 
	 * ǰ̨��֧���ɹ�����ʾ�����֧�� 
	 * ��̨�����������֧����״̬,�޸����Ҵ�����״̬
	 */
	public static final int PAY_YIZHIFU = 4;
	/**
	 * ״̬���ȴ����� 
	 * ǰ̨���û�����������"
	 */
	public static final int PAY_DENGDAIDAIFU = 5;
	/**
	 * ״̬��������� 
	 * ǰ̨�������ɹ���,��ʾ������� 
	 * ��̨���������֧�����,�޸����Ҵ�����״̬
	 */
	public static final int PAY_DAIFUWANCHENG = 6;
	/**
	 * ״̬�����Ҵ����� 
	 * ��̨�����ҷ�����,���"����"��ť��״̬��Ϊ�ѷ���
	 */
	public static final int PAY_DAIFAHUO = 7;
	/**
	 * ״̬�������ѷ���
	 * ǰ̨���û����"ȷ���ջ�"��ť��,�޸�PAY_SUCCESS״̬
	 */
	public static final int PAY_YIFAHUO = 8;
	/**
	 * ״̬ ���˻���
	 * ǰ̨����� �˿ť�����޸Ķ���״̬Ϊ PAY_TUIHUO״̬ 
	 * ��̨:�����˻�,��ѯ���˿�״̬�Ķ������޸�״̬Ϊ���׹ر�
	 */
	public static final int PAY_TUIHUO = 9;

	// �û���ɾ������(�û�����վ�е�)
	public static final int USER_DELETED = 1;
	// �û�����ɾ���Ķ���
	public static final int USER_COMPLETE_DELETED = 2;
	// ���û����صĶ���
	public static final int USER_COMPLETE_HIDDEN = 3;

	private Integer id;// ����ID
	/**
	 * �������(�������(yyyyMMddHHmmssSSS+1000�������) �����Ĭ��Ϊ3λ�������Ļ�ǰ�油0������ȷ��Ϊ20λ)
	 */
	private String orderNo;//

	private String deliveryNo;// ��ݵ���:��̨��������ʱ��д�Ŀ�ݵ���

	private String deliveryName;// ��ݹ�˾����

	private String transNo;// ֧�����׺�

	private Integer userId;// ������ID��user��

	private String userName;// �������û���(user)

	private String receiverName;// ����������

	private String receiverPhone;// �����˵绰

	private String receiverAddress;// �����˵�ַ

	private String arriveDate;// ָ���ʹ�����

	private String payType;// �������� �������� ֧����

	private Float price;// �������

	private String payTime;// ����ʱ��

	private String createTime;// ��������ʱ��

	private String expiredTime;// ��������ʱ��(��������֮��7��Ϊ���帶��ʱ�䣬���ڲ����ڸ���)

	private Integer status;// ����״̬(ǰ�߶���ĸ��ֳ���)

	private String statusName;// ����״̬����

	private String orderInfo;// ����״̬��Ϣ����Ӧ����״̬��Ϊ��δ�������ʧ�ܵ�ԭ��ȣ�

	private String attachInfo;// ����������Ϣ
	/**
	 * ����ɾ�� 0:���� 1:��ɾ��(�û�����վ) 2:����ɾ��(�û�������) 3:��������(�������ݿ�ָ�)
	 * ���ڶ�����ɾ�����û���Ϊ,��̨���û�����ɾ���Ķ�����������(���鲻ɾ��)
	 */
	private String sendTime;// ����ʱ��

	private String confirmTime;// ȷ���ջ�ʱ��

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getTransNo() {
		return transNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getAttachInfo() {
		return attachInfo;
	}

	public void setAttachInfo(String attachInfo) {
		this.attachInfo = attachInfo;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getConfirmTime() {
		return confirmTime;
	}

	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public static int getPaySuccess() {
		return PAY_SUCCESS;
	}

	public static int getPayClosed() {
		return PAY_CLOSED;
	}

	public static int getPayDaizhifu() {
		return PAY_DAIZHIFU;
	}

	public static int getPayDaifuwancheng() {
		return PAY_DAIFUWANCHENG;
	}

	public static int getPayYizhifu() {
		return PAY_YIZHIFU;
	}

	public static int getPayDengdaidaifu() {
		return PAY_DENGDAIDAIFU;
	}

	public static int getPayDaifahuo() {
		return PAY_DAIFAHUO;
	}

	public static int getPayYifahuo() {
		return PAY_YIFAHUO;
	}

	public static int getPayTuihuo() {
		return PAY_TUIHUO;
	}

	public static int getUserDeleted() {
		return USER_DELETED;
	}

	public static int getUserCompleteDeleted() {
		return USER_COMPLETE_DELETED;
	}

	public static int getUserCompleteHidden() {
		return USER_COMPLETE_HIDDEN;
	}

}
