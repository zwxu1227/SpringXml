package com.zwxu.request;

/**
 * 代付请求model
 */
public class QueryRequestModel extends BaseRequest{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8639332527541402403L;
	
	private String order_no;

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
  

}
