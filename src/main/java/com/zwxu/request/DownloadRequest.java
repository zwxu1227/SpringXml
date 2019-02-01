package com.zwxu.request;


/**
 * @author zhangxinpeng
 *
 * 2018年1月31日上午9:53:52
 */
public class DownloadRequest {

	private String account_no;

	//@NotBlank(message = "bill_date不可为空")
	private String bill_date;
	
	//开始时间
	private String start_date;
	
	//结束时间
	private String end_date;
	
	//订单类型（1：交易；2：退款；3：出款）
	private int bill_type;
	
	//是否持牌（1：持牌；2：非持牌）
	private int iscard;
	
	private int third_pay_platform;
	
	

	public int getThird_pay_platform() {
		return third_pay_platform;
	}

	public void setThird_pay_platform(int third_pay_platform) {
		this.third_pay_platform = third_pay_platform;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getBill_date() {
		return bill_date;
	}

	public void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public int getBill_type() {
		return bill_type;
	}

	public void setBill_type(int bill_type) {
		this.bill_type = bill_type;
	}

	public int getIscard() {
		return iscard;
	}

	public void setIscard(int iscard) {
		this.iscard = iscard;
	}
	

}
