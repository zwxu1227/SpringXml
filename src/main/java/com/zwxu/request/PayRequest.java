package com.zwxu.request;

public class PayRequest extends RequestBase {
    private String orderNo;
    private String thirdPayNo;
    private int db;

    public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getThirdPayNo() {
        return thirdPayNo;
    }

    public void setThirdPayNo(String thirdPayNo) {
        this.thirdPayNo = thirdPayNo;
    }
}
