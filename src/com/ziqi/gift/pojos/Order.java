package com.ziqi.gift.pojos;

/**
 * @author ZIQI
 * @date 2018年4月26日
 */
public class Order {
	/**
	 * 状态:交易成功 
	 * 前台：确认收货后,状态改变
	 */
	public static final int PAY_SUCCESS = 1;
	/**
	 * 状态:交易关闭 
	 * 后台:退货后，交易关闭 或 前台订单超时后，交易关闭 或 前台申请退货，后台操作“退货”按钮
	 * 订单待支付时,用户也可以选择管理该订单进行关闭
	 */
	public static final int PAY_CLOSED = 2;
	/**
	 * 状态：买家待支付 
	 * 前台：用户提交订单后，修改至买家待支付状态
	 */
	public static final int PAY_DAIZHIFU = 3;
	/**
	 * 状态：买家已支付 
	 * 前台：支付成功后，显示买家已支付 
	 * 后台：根据买家已支付的状态,修改卖家代发货状态
	 */
	public static final int PAY_YIZHIFU = 4;
	/**
	 * 状态：等待代付 
	 * 前台：用户操作：代付"
	 */
	public static final int PAY_DENGDAIDAIFU = 5;
	/**
	 * 状态：代付完成 
	 * 前台：代付成功后,显示代付完成 
	 * 后台：根据买家支付情况,修改卖家代发货状态
	 */
	public static final int PAY_DAIFUWANCHENG = 6;
	/**
	 * 状态：卖家待发货 
	 * 后台：卖家发货后,点击"发货"按钮后状态变为已发货
	 */
	public static final int PAY_DAIFAHUO = 7;
	/**
	 * 状态：卖家已发货
	 * 前台：用户点击"确认收货"按钮后,修改PAY_SUCCESS状态
	 */
	public static final int PAY_YIFAHUO = 8;
	/**
	 * 状态 ：退货中
	 * 前台：点击 退款按钮，并修改订单状态为 PAY_TUIHUO状态 
	 * 后台:受理退货,查询待退款状态的订单，修改状态为交易关闭
	 */
	public static final int PAY_TUIHUO = 9;

	// 用户已删除订单(用户回收站中的)
	public static final int USER_DELETED = 1;
	// 用户彻底删除的订单
	public static final int USER_COMPLETE_DELETED = 2;
	// 对用户隐藏的订单
	public static final int USER_COMPLETE_HIDDEN = 3;

	private Integer id;// 订单ID
	/**
	 * 订单编号(订单编号(yyyyMMddHHmmssSSS+1000内随机数) 随机数默认为3位，不够的话前面补0，这样确定为20位)
	 */
	private String orderNo;//

	private String deliveryNo;// 快递单号:后台操作发货时填写的快递单号

	private String deliveryName;// 快递公司名称

	private String transNo;// 支付交易号

	private Integer userId;// 付款人ID（user）

	private String userName;// 付款人用户名(user)

	private String receiverName;// 收礼人姓名

	private String receiverPhone;// 收礼人电话

	private String receiverAddress;// 收礼人地址

	private String arriveDate;// 指定送达日期

	private String payType;// 付款类型 网银在线 支付宝

	private Float price;// 订单金额

	private String payTime;// 付款时间

	private String createTime;// 订单生成时间

	private String expiredTime;// 订单过期时间(订单生成之后7天为缓冲付款时间，过期不可在付款)

	private Integer status;// 订单状态(前边定义的各种常量)

	private String statusName;// 订单状态名称

	private String orderInfo;// 订单状态信息（对应订单状态，为何未付款，付款失败的原因等）

	private String attachInfo;// 订单附加信息
	/**
	 * 订单删除 0:正常 1:已删除(用户回收站) 2:彻底删除(用户看不到) 3:永久隐藏(除非数据库恢复)
	 * 对于订单的删除是用户行为,后台对用户彻底删除的订单进行清理(建议不删除)
	 */
	private String sendTime;// 发货时间

	private String confirmTime;// 确认收货时间

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
