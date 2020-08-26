package com.want.common.po;

import java.io.Serializable;

import java.math.BigDecimal;

public class ProductLevel implements Serializable {
	/**
	 * serial Number
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 产线编码
	 */
	private String id;
	/**
	 * 产线名称
	 */
	private String name;
	/**
	 * 产线层级
	 */
	private BigDecimal prodLevel;
	/**
	 * 更新日期
	 */
	private String updateDate;

    public ProductLevel() {
    }
    
    public ProductLevel(String id,String name,BigDecimal prodLevel) {
    	this.id = id;
    	this.name = name;
    	this.prodLevel = prodLevel;
    }
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getProdLevel() {
		return this.prodLevel;
	}

	public void setProdLevel(BigDecimal prodLevel) {
		this.prodLevel = prodLevel;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}