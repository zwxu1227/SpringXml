package com.zwxu.entity.yiplus;

import java.sql.Timestamp;

public class T_info_payinfo {
    private long Id;
    private String mercode;
    private String entcode;
    private String orderno;
    private String ipaddress;
    private String NumberID;
    private Timestamp createtime;
    private int paytype;
    private String payaccno;
    private String payaccname;
    private double payprice;
    private String companyname;
    private String cardid;
    private int cardtype;
    private String cardno;
    private String tel;
    private int paystatus;
    private String paytime;
    private int ServiceCount;
    private String ModifyDate;
    private String RequestId;
    private int OfficialOrPrivate;
    private String OrgCode;
    private String MerName;
    private double CounterFee;
    private String isPrePay;
    private String callbackUrl;
    private String prePayOrderId;
    private String PassageWayCode;
    private String ReturnMessage;
    private String AccountType;
    private int ClickSwitch;
    private String bankCode;
    private int isThirdPay;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getMercode() {
        return mercode;
    }

    public void setMercode(String mercode) {
        this.mercode = mercode;
    }

    public String getEntcode() {
        return entcode;
    }

    public void setEntcode(String entcode) {
        this.entcode = entcode;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getNumberID() {
        return NumberID;
    }

    public void setNumberID(String numberID) {
        NumberID = numberID;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public int getPaytype() {
        return paytype;
    }

    public void setPaytype(int paytype) {
        this.paytype = paytype;
    }

    public String getPayaccno() {
        return payaccno;
    }

    public void setPayaccno(String payaccno) {
        this.payaccno = payaccno;
    }

    public String getPayaccname() {
        return payaccname;
    }

    public void setPayaccname(String payaccname) {
        this.payaccname = payaccname;
    }

    public double getPayprice() {
        return payprice;
    }

    public void setPayprice(double payprice) {
        this.payprice = payprice;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public int getCardtype() {
        return cardtype;
    }

    public void setCardtype(int cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(int paystatus) {
        this.paystatus = paystatus;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public int getServiceCount() {
        return ServiceCount;
    }

    public void setServiceCount(int serviceCount) {
        ServiceCount = serviceCount;
    }

    public String getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(String modifyDate) {
        ModifyDate = modifyDate;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public int getOfficialOrPrivate() {
        return OfficialOrPrivate;
    }

    public void setOfficialOrPrivate(int officialOrPrivate) {
        OfficialOrPrivate = officialOrPrivate;
    }

    public String getOrgCode() {
        return OrgCode;
    }

    public void setOrgCode(String orgCode) {
        OrgCode = orgCode;
    }

    public String getMerName() {
        return MerName;
    }

    public void setMerName(String merName) {
        MerName = merName;
    }

    public double getCounterFee() {
        return CounterFee;
    }

    public void setCounterFee(double counterFee) {
        CounterFee = counterFee;
    }

    public String getIsPrePay() {
        return isPrePay;
    }

    public void setIsPrePay(String isPrePay) {
        this.isPrePay = isPrePay;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getPrePayOrderId() {
        return prePayOrderId;
    }

    public void setPrePayOrderId(String prePayOrderId) {
        this.prePayOrderId = prePayOrderId;
    }

    public String getPassageWayCode() {
        return PassageWayCode;
    }

    public void setPassageWayCode(String passageWayCode) {
        PassageWayCode = passageWayCode;
    }

    public String getReturnMessage() {
        return ReturnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        ReturnMessage = returnMessage;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getClickSwitch() {
        return ClickSwitch;
    }

    public void setClickSwitch(int clickSwitch) {
        ClickSwitch = clickSwitch;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public int getIsThirdPay() {
        return isThirdPay;
    }

    public void setIsThirdPay(int isThirdPay) {
        this.isThirdPay = isThirdPay;
    }
}
