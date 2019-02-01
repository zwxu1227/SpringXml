package com.zwxu.request;


/**
 * 代付请求model
 */
public class AgentPayRequestModel extends BaseRequest{

/**
	 * 
	 */
	private static final long serialVersionUID = -816911000787044879L;
	//     代付单号
    private String order_no;
//     收款行行号 varchar(12) ICBC：代表中国工商银行，CCB：代表中国建设银行，
    private String rec_bank_no;
    /// 收款账号，varchar(19)
    private String rec_account_no;
    /// 收款账户名称 varchar(60)
    private String rec_account_name;
    /**
     * 支行信息（有的渠道的对公付款需要传）
     */
    private String rec_bank_branch;
    /// 收款账户是否为对公户-1-是/0-否，默认值是0
    private int is_business_acc;
    /// 金额，以分为单位 int
    private int amount;
    /// 摘要，可空 varchar(22)
    private String abstract_desc;
    /// *接收支付中心通知的URL，需给绝对路径，255字符内格式如:http://wap.tenpay.com/tenpay.asp， 确保支付中心能通过互联网访问该地址
    private String notify_url;
    /// 支付渠道 酷宝支付, 6-青岛中信
    private int third_pay_platform;


    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getRec_bank_no() {
        return rec_bank_no;
    }

    public void setRec_bank_no(String rec_bank_no) {
        this.rec_bank_no = rec_bank_no;
    }

    public String getRec_account_no() {
        return rec_account_no;
    }

    public void setRec_account_no(String rec_account_no) {
        this.rec_account_no = rec_account_no;
    }

    public String getRec_account_name() {
        return rec_account_name;
    }

    public void setRec_account_name(String rec_account_name) {
        this.rec_account_name = rec_account_name;
    }

    public int getIs_business_acc() {
        return is_business_acc;
    }

    public void setIs_business_acc(int is_business_acc) {
        this.is_business_acc = is_business_acc;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAbstract_desc() {
        return abstract_desc;
    }

    public void setAbstract_desc(String abstract_desc) {
        this.abstract_desc = abstract_desc;
    }

    public int getThird_pay_platform() {
        return third_pay_platform;
    }

    public void setThird_pay_platform(int third_pay_platform) {
        this.third_pay_platform = third_pay_platform;
    }

    public String getRec_bank_branch() {
        return rec_bank_branch;
    }

    public void setRec_bank_branch(String rec_bank_branch) {
        this.rec_bank_branch = rec_bank_branch;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }
}
