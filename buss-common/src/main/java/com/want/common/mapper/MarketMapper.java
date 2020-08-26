package com.want.common.mapper;

import java.util.List;
import java.util.Map;

import com.want.common.po.ForthCity;
import com.want.common.po.SmallMarket;
import com.want.common.po.StandardMarket;
import com.want.common.po.ThirdCity;

public interface MarketMapper {
	
	/**
	* <p>Description:根据营业所编码查询标准市场<p>
	* @param branchId	营业所编码
	* @return List<StandardMarket>	标准市场集合
	* @author 00114260
	* @date 2017年12月07日 上午09:48:00
	 */
	List<StandardMarket> queryMarketByBranch(String branchId);
	
	/**
	* <p>Description:根据标准市场编码查询小标市场<p>
	* @param standardMarketId	标准市场编码
	* @return List<SmallMarket>	小标市场集合
	* @author 00114260
	* @date 2017年12月07日 上午09:48:00
	 */
	List<SmallMarket> querySmallMarketBysmId(String standardMarketId);
	
	/**
	* <p>Description:根据标准市场编码查询三级地<p>
	* @param marketId	标准市场编码
	* @return List<ThirdCity>	三级地集合
	* @author 00114260
	* @date 2018年01月29日 上午09:48:00
	 */
	List<ThirdCity> queryThirdByMarket(String marketId);
	
	/**
	* <p>Description:根据三级地编码查询状态为1的四级地<p>
	* @param thirdId	三级地编码
	* @return List<ForthCity>	四级地集合
	* @author 00114260
	* @date 2018年01月29日 上午09:48:00
	 */
	List<ForthCity> queryForthByThird(String thirdId);
	
}
