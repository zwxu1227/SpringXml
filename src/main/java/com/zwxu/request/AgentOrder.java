package com.zwxu.request;


/*
* 代付订单查询实体
* */
public class AgentOrder extends RequestBase{
    private String createTimeStart;
    private String createTimeEnd;
    private String updatedTimeStart;
    private String updatedTimeEnd;
    private String acctName;
    private String bankAccount;
    private Integer status;
    private Integer platform;
    private String thirdOrderNo;

    public String getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getUpdatedTimeStart() {
        return updatedTimeStart;
    }

    public void setUpdatedTimeStart(String updatedTimeStart) {
        this.updatedTimeStart = updatedTimeStart;
    }

    public String getUpdatedTimeEnd() {
        return updatedTimeEnd;
    }

    public void setUpdatedTimeEnd(String updatedTimeEnd) {
        this.updatedTimeEnd = updatedTimeEnd;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
    }
}
