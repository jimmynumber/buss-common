package com.want.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.want.common.po.Emp;
import com.want.common.po.PosType;
import com.want.common.service.IGetUserManagerService;

@RestController
@RequestMapping(value = "userManager")
public class UserManagerController {
	@Autowired
	public IGetUserManagerService getUserManagerService;
	
	/**
	* <p>获得系统当前登入者信息<p>
	* @param 
	* @return emp	人员信息
	* @author 00114260
	* @date 2017年11月09日 上午11:14:00
	 */
	@RequestMapping(value = "getLoginInfo" , method = RequestMethod.POST)
	public List<Emp> getLoginInfo() {
		return getUserManagerService.getLoginInfo();
	}
	
	/**
	* <p>获得所有状态为1的岗位类型信息<p>
	* @param 
	* @return List<PosType>	岗位类型集
	* @author 00114260
	* @date 2017年10月30日 上午09:22:00
	 */
	@RequestMapping(value = "queryPosType" , method = RequestMethod.POST)
	public List<PosType> queryPosType() {
		return getUserManagerService.queryPosType();
	}
	
	/**
	* <p>判断用户是否是总部人员<p>
	* @param empId
	* @return boolean
	* @author 00114260
	* @date 2017年12月07日 下午14:33:00
	 */
	@RequestMapping(value = "isHQ" , method = RequestMethod.POST)
	public boolean isHQ(@RequestParam(value = "empId", required = true) String empId){
		return getUserManagerService.isHQ(empId);
	}
}
