package com.want.common.po;

import java.io.Serializable;
import java.util.Date;

public class Area implements Serializable {
	/**
	 * 序列ID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 区块编码
	 */
	private String id;
	/**
	 * 区块名称
	 */
	private String name;
	/**
	 * 分公司编码
	 */
	private String companyId;
	/**
	 * 更新时间
	 */
	private Date updateDate;
    /**
    * <p>默认构造区块</p> 
     */
    public Area() {
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

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}