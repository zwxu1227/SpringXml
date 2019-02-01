package com.zwxu.entity.yiplus;

import java.sql.Timestamp;

public class Trecord_payinfo {
    /**
     * 主键
     */
    private String Id;
    private String mercode;
    private String ipaddress;
    private Timestamp createtime;
    private String orderId;
    private String payprice;
    private String paytime;
    private Timestamp ModifyDate;
    private String OfficialOrPrivate;
    private String Remark;
    private String Status;
    private String Message;
    private String Source;
    private String bankCode;
    private String callbackUrl;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMercode() {
        return mercode;
    }

    public void setMercode(String mercode) {
        this.mercode = mercode;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayprice() {
        return payprice;
    }

    public void setPayprice(String payprice) {
        this.payprice = payprice;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public Timestamp getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        ModifyDate = modifyDate;
    }

    public String getOfficialOrPrivate() {
        return OfficialOrPrivate;
    }

    public void setOfficialOrPrivate(String officialOrPrivate) {
        OfficialOrPrivate = officialOrPrivate;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}
