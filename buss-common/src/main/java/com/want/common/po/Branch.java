package com.want.common.po;

import java.io.Serializable;
import java.util.Date;

public class Branch implements Serializable {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 营业所编码
	 */
	private String id;
	/**
	 * 营业所名称
	 */
	private String name;
	/**
	 * 区块编码
	 */
	private String areaId;
	/**
	 * 公司编码
	 */
	private String companyId;
	/**
	 * 人力营业所编码
	 */
	private String hrBranchId;
	/**
	 * 更新日期
	 */
	private Date updateDate;
    /**
     * 
    * <p>默认构造器</p> 
     */
    public Branch() {
    }
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	
	public String getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public String getHrBranchId() {
		return hrBranchId;
	}
	
	public void setHrBranchId(String hrBranchId) {
		this.hrBranchId = hrBranchId;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
	
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}