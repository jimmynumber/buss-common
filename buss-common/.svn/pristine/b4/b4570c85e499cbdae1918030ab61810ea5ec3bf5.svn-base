package com.want.common.mapper;

import java.util.List;

import com.want.common.po.Emp;
import com.want.common.po.PosType;

public interface PositionMapper {

	/**
	* <p>获得系统当前登入者信息<p>
	* @param 
	* @return emp	人员信息
	* @author 00114260
	* @date 2017年11月08日 下午04:44:00
	 */
	List<Emp> getLoginInfo(String loginUserId);
	
	/**
	* <p>获得所有状态为1的岗位类型信息<p>
	* @param 
	* @return List<PosType>	岗位类型集
	* @author 00114260
	* @date 2017年10月30日 上午09:22:00
	 */
	List<PosType> queryPosType();
	
	/**
	* <p>判断用户是否是总部人员<p>
	* @param 
	* @return List<Emp>	返回用户
	* @author 00114260
	* @date 2017年12月07日 下午14:33:00
	 */
	List<Emp> isHQ(String empId); 

}