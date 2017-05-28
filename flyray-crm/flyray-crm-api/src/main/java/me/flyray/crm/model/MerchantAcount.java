package me.flyray.crm.model;

/** 
* @author: bolei
* @date：2017年3月6日 下午10:07:26 
* @description：商户账户信息
*/

public class MerchantAcount {

	/**
	 *  商户号
	 */
	private String merchantNo;
	
	/**
	 * 商户账户
	 */
	private String merAcountNo;
	
	/**
	 * 账户类型
	 */
	private String acountType;
	
	/**
	 * 商户账户值
	 */
	private String value;
	
	/**
	 * 冻结值
	 */
	private String freezeValue;

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerAcountNo() {
		return merAcountNo;
	}

	public void setMerAcountNo(String merAcountNo) {
		this.merAcountNo = merAcountNo;
	}

	public String getAcountType() {
		return acountType;
	}

	public void setAcountType(String acountType) {
		this.acountType = acountType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getFreezeValue() {
		return freezeValue;
	}

	public void setFreezeValue(String freezeValue) {
		this.freezeValue = freezeValue;
	}
	
}
