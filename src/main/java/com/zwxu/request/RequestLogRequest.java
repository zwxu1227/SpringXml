package com.zwxu.request;

public class RequestLogRequest extends RequestBase {
    private String orderNo;
    private String dateTime;
    private String dateTimeEnd;
    private String key;
    private String classify;
    private int db;//数据库字段
    

    public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public String getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(String dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }
}
