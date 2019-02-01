package com.zwxu.request;
/*
* 溢+代付请求日志
* */
public class YiPlusAgentRequest extends RequestBase {
    /*
    * 商户编号
    * */
    private String mercode;
    /*
    *支付订单号
    * */
    private String orderno;
    /*
    *交易时间
    * */
    private String createtime;
    private String createtimeEnd;
    /*
    * 商户订单号
    * */
    private String cardid;

    public String getMercode() {
        return mercode;
    }

    public void setMercode(String mercode) {
        this.mercode = mercode;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCreatetimeEnd() {
        return createtimeEnd;
    }

    public void setCreatetimeEnd(String createtimeEnd) {
        this.createtimeEnd = createtimeEnd;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
}
