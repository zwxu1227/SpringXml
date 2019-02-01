package com.zwxu.request;

public class Notification {
    private  String order_no;
    private  String amount;
    private  String pay_status;
    private  String pay_status_desc;
    private  String third_order_no;
    private  String pay_time;
    private  String request_time;
    private  String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPay_status() {
        return pay_status;
    }

    public void setPay_status(String pay_status) {
        this.pay_status = pay_status;
    }

    public String getPay_status_desc() {
        return pay_status_desc;
    }

    public void setPay_status_desc(String pay_status_desc) {
        this.pay_status_desc = pay_status_desc;
    }

    public String getThird_order_no() {
        return third_order_no;
    }

    public void setThird_order_no(String third_order_no) {
        this.third_order_no = third_order_no;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getRequest_time() {
        return request_time;
    }

    public void setRequest_time(String request_time) {
        this.request_time = request_time;
    }
}
