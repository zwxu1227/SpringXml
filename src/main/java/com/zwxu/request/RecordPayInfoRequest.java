package com.zwxu.request;

/**
 * 代付日志请求实体
 */
public class RecordPayInfoRequest extends RequestBase {
    private  String mercode;
    private  String orderId;
    private  String Status;
    private String Message;
    private  String createtimeStart;
    private  String createtimeEnd;
    public String getMercode() {
        return mercode;
    }

    public void setMercode(String mercode) {
        this.mercode = mercode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getCreatetimeStart() {
        return createtimeStart;
    }

    public void setCreatetimeStart(String createtimeStart) {
        this.createtimeStart = createtimeStart;
    }

    public String getCreatetimeEnd() {
        return createtimeEnd;
    }

    public void setCreatetimeEnd(String createtimeEnd) {
        this.createtimeEnd = createtimeEnd;
    }
}
