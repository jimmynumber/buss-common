package com.want.common.po;

import java.io.Serializable;
import java.util.Date;

public class SmallMarket implements Serializable {
	/**
	 * serialize number
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 小标市场编码
	 */
	private String smallMarketId;
	/**
	 * 小标市场名称
	 */
	private String smallMarketName;
	/**
	 * 标准市场Id
	 */
	private String marketId;
	/**
	 * 标准市场名称
	 */
	private String marketName;
	
	/**
	 * 更新世间
	 */
	private Date updateDate;

    public SmallMarket() {
    }

	

	public String getSmallMarketId() {
		return smallMarketId;
	}



	public void setSmallMarketId(String smallMarketId) {
		this.smallMarketId = smallMarketId;
	}



	public String getSmallMarketName() {
		return smallMarketName;
	}



	public void setSmallMarketName(String smallMarketName) {
		this.smallMarketName = smallMarketName;
	}



	public String getMarketId() {
		return marketId;
	}



	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}



	public String getMarketName() {
		return marketName;
	}



	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}



	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}