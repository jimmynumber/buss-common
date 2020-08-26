package com.want.common.po;

public class PosType {
	/**
	 * 岗位类型编码
	 */
	private String posTypeId;
	/**
	 * 岗位类型名称
	 */
	private String posTypeName;

	/**
	* <p>默认构造器</p>
	 */
	public PosType() {
		super();
	}
	/**
	* <p>岗位类型编码和岗位类型名称构成构造器</p> 
	* @param posTypeId	岗位类型编码
	* @param posTypeName	岗位类型名称
	 */
	public PosType(String posTypeId, String posTypeName) {
		super();
		this.posTypeId = posTypeId;
		this.posTypeName = posTypeName;
	}

	public String getPosTypeId() {
		return posTypeId;
	}

	public void setPosTypeId(String posTypeId) {
		this.posTypeId = posTypeId;
	}

	public String getPosTypeName() {
		return posTypeName;
	}

	public void setPosTypeName(String posTypeName) {
		this.posTypeName = posTypeName;
	}

}
