package com.want.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.want.common.po.CustomerInfo;

/**
 * @description CustomerMapper获取客户相關接口
 * @author 00114260
 * @version V1.0.0
 */
public interface CustomerMapper {
	/**
     * <根据客户编码获取客户信息>
     * @author 00114260
	 * @date 2017年10月24日 下午14:45:00
	 * @param customerId
     * @return 客户
     */
	List<CustomerInfo> selectCustomerWithId(@Param("customerId")String customerId);

}