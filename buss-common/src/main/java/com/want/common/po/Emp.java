package com.want.common.po;

public class Emp {
	private String empId;
	
	private String empName;
	
	private String empAreaId;
	
	private String posPropertyId;
	
	private String orgName;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAreaId() {
		return empAreaId;
	}
	public void setEmpAreaId(String empAreaId) {
		this.empAreaId = empAreaId;
	}
	public String getPosPropertyId() {
		return posPropertyId;
	}
	public void setPosPropertyId(String posPropertyId) {
		this.posPropertyId = posPropertyId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Emp(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
}
