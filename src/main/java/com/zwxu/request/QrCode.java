package com.zwxu.request;

/**
 * 支付二维码
 */
public class QrCode {
    private String order_no;
    private String pay_money;
    private String notify_url;
    private String return_url;
    private String order_time;
    private String goods_name;
    private String valid_minutes;
    private String third_pay_platform;
    private String pay_channel;
    private String merchant_id;
    private String biz_system;
    private String remark;
    private String sign;

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getPay_money() {
        return pay_money;
    }

    public void setPay_money(String pay_money) {
        this.pay_money = pay_money;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getValid_minutes() {
        return valid_minutes;
    }

    public void setValid_minutes(String valid_minutes) {
        this.valid_minutes = valid_minutes;
    }

    public String getThird_pay_platform() {
        return third_pay_platform;
    }

    public void setThird_pay_platform(String third_pay_platform) {
        this.third_pay_platform = third_pay_platform;
    }

    public String getPay_channel() {
        return pay_channel;
    }

    public void setPay_channel(String pay_channel) {
        this.pay_channel = pay_channel;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getBiz_system() {
        return biz_system;
    }

    public void setBiz_system(String biz_system) {
        this.biz_system = biz_system;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
