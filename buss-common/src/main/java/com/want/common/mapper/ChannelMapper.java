package com.want.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.want.common.po.Channel;

/**
 * @description ChannelMapper获取渠道相關接口
 * @author 00114260
 * @version V1.0.0
 */
public interface ChannelMapper {
	
	/**
     * <获取EMP_CHANNEL对应渠道列表>
     * @author 00114260
	 * @date 2017年10月16日 下午2:30:00
	 * @param empId
     * @return 渠道列表
     */
	List<Channel> selectChannelWithEmpChannel(@Param("empId")String empId);
	
	/**
     * <获取全渠道列表>
     * @author 00114260
	 * @date 2017年10月16日 下午2:57:00
	 * @param empId
     * @return 渠道列表
     */
	List<Channel> selectChannel();
}
