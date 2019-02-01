package com.zwxu.request;

import java.io.Serializable;

public class BaseRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6994492670514528511L;

	/**
     * 接口名称
     */
    private String method;

    /**
     * 下游业务系统,默认值是：5-溢+
     */
    private int biz_system = 5;

    /**
     * 签名
     */
    private String sign;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getBiz_system() {
        return biz_system;
    }

    public void setBiz_system(int biz_system) {
        this.biz_system = biz_system;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "method='" + method + '\'' +
                ", biz_system='" + biz_system + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
