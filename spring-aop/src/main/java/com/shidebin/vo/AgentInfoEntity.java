package com.shidebin.vo;

import java.util.Objects;

public class AgentInfoEntity {

    private String uuid;
    private String caseCategoryCode;
    private String tradeCode;//交易编号
    private String businessCode;//业务编号
    private String agentType;
    private String name;
    private String sex;
    private String identityType;
    private String identityNo;
    private String mobile;
    private String litigantType;
    private String principal;
    private String power;
    private String powerDetail;
    private String company;
    private String email;
    private String address;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCaseCategoryCode() {
        return caseCategoryCode;
    }

    public void setCaseCategoryCode(String caseCategoryCode) {
        this.caseCategoryCode = caseCategoryCode;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLitigantType() {
        return litigantType;
    }

    public void setLitigantType(String litigantType) {
        this.litigantType = litigantType;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPowerDetail() {
        return powerDetail;
    }

    public void setPowerDetail(String powerDetail) {
        this.powerDetail = powerDetail;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
	public String getTradeCode() {
		return tradeCode;
	}

	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getBusinessCode() {
		return businessCode;
	}

	
	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */
	
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentInfoEntity that = (AgentInfoEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(caseCategoryCode, that.caseCategoryCode) &&
                Objects.equals(agentType, that.agentType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(identityType, that.identityType) &&
                Objects.equals(identityNo, that.identityNo) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(litigantType, that.litigantType) &&
                Objects.equals(principal, that.principal) &&
                Objects.equals(power, that.power) &&
                Objects.equals(powerDetail, that.powerDetail) &&
                Objects.equals(company, that.company) &&
                Objects.equals(company, that.tradeCode) &&
                Objects.equals(company, that.businessCode) &&
                Objects.equals(email, that.email) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid, caseCategoryCode, agentType, name, sex, identityType, identityNo, mobile, litigantType, principal, power, powerDetail, company, email, address,tradeCode,businessCode);
    }

}
