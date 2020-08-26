package com.want.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.want.common.po.Company;

/**
 * @description CompanyMapper获取分公司相關接口
 * @author 00114260
 * @version V1.0.0
 */
public interface CompanyMapper {
	/**
     * <获取EMP_POSITION_ORG_VIEW对应分公司列表>
     * @author 00114260
	 * @date 2017年10月16日 上午10:00:30
	 * @param empId
     * @return 分公司列表
     */
	List<Company> selectCompanyWithEmpPosOrgView(@Param("empId")String empId);
	
	/**
     * <获取EMP_COMPANY对应分公司列表>
     * @author 00114260
	 * @date 2017年10月16日 上午10:00:30
	 * @param empId
     * @return 分公司列表
     */
	List<Company> selectCompanyWithEmpCompany(@Param("empId")String empId);
	
	/**
     * <获取全国分公司列表>
     * @author 00114260
	 * @date 2017年10月16日 上午10:00:30
	 * @param empId
     * @return 分公司列表
     */
	List<Company> selectCompany();
	
	/**
     * <根据公司编码查询分公司>
     * @author 00114260
	 * @date 2017年10月20日 下午02:03:00
	 * @param empId
     * @return 分公司列表
     */
	Company selectCompanyById(@Param("companyId")String companyId);
	
}
