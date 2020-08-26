package com.want.common.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.want.common.po.Area;

public interface AreaMapper {
	/**
	* <p>Description:根据人员信息和公司编码获得片区<p>
	* @author 00114260
	* @date 2017年10月30日 上午09:45:00
	* @param empId	业代编码,companyId	公司编码
	* @return List<Area>	区块集合
	 */
	List<Area> queryAreaByEmpAndCompanyId(@Param("empId")String empId, @Param("companyId")String companyId);
	
	/**
	* <p>Description:根据公司编码获得片区<p>
	* @author 00114260
	* @date 2017年11月03日 上午11:53:00
	* @param companyId	公司编码
	* @return List<Area>	区块集合
	 */
	List<Area> queryAreaByCompanyId(@Param("companyId")String companyId);
	
}