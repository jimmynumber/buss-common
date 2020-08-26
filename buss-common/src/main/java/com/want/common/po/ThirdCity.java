package com.want.common.po;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
* The persistent class for the THIRD_CITY database table.
* @ClassName: ThirdCity 
* @author 00279601
* @date Apr 25, 2017 7:07:15 PM
 */
@Entity
@Table(name="THIRD_CITY")
public class ThirdCity implements Serializable {
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 三级地编码
	 */
	@Id
	private String id;
	/**
	 * 三级地名称
	 */
	private String name;
	/**
	 * 标准市场编码
	 */
	@Column(name="MARKET_ID")
	private String marketId;
	/**
	 * 营业所编码
	 */
	@Column(name="BRANCH_ID")
	private String branchId;
	/**
	 * 更新日期
	 */
    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

    public ThirdCity() {
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

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}