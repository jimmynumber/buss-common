package com.want.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.want.common.po.Emp;
import com.want.common.po.PosType;

/**
 * 
 * <p>Title: 接口</p>
 * <p>Description:获取人员及岗位等信息</p>
 * <p>Company:旺旺集团</p>
 * @author 00114260
 * @date 2017年10月30日 上午9:00:00
 */
@Service
public interface IGetUserManagerService {
	
	/**
	* <p>获得系统当前登入者信息<p>
	* @param 
	* @return emp	人员信息
	* @author 00114260
	* @date 2017年11月08日 下午04:44:00
	 */
	public List<Emp> getLoginInfo();

	/**
	* <p>获得所有状态为1的岗位类型信息<p>
	* @param 
	* @return List<PosType>	岗位类型集
	* @author 00114260
	* @date 2017年10月30日 上午09:22:00
	 */
	public List<PosType> queryPosType();
	
	/**
	* <p>判断用户是否是总部人员<p>
	* @param empId
	* @return boolean
	* @author 00114260
	* @date 2017年12月07日 下午14:33:00
	 */
	public boolean isHQ(String empId); 
}
