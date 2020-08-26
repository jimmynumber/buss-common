package com.want.common.po;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
* The persistent class for the FORTH_CITY database table.
* @ClassName: ForthCity 
* @author 00279601
* @date Apr 25, 2017 4:38:18 PM
 */
@Entity
@Table(name="FORTH_CITY")
public class ForthCity implements Serializable {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 四级地编码
	 */
	@Id
	private long sid;
	/**
	 * 四级地名称
	 */
	@Column(name="NAME")
	private String name;
	/**
	 * 三级地编码
	 */
	@Column(name="THIRD_ID")
	private String thirdId;
	/**
	 * 状态
	 */
	@Column(name="STATUS")
	private String status;
	/**
	 * 创建用户
	 */
	@Column(name="CREATE_USER")
	private String createUser;
	/**
	 * 创建日期
	 */
    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private Date createDate;
    /**
	 * 更新人
	 */
	@Column(name="UPDATE_USER")
	private String updateUser;
	/**
	 * 更新日期
	 */
    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

    public ForthCity() {
    }

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThirdId() {
		return thirdId;
	}

	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}