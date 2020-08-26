package com.want.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.want.common.po.Branch;

/**
 * @description BranchMapper获取营业所相關接口
 * @author 00114260
 * @version V1.0.0
 */
public interface BranchMapper {
	
	/**
     * <获取EMP_POSITION_ORG_VIEW对应营业所列表>
     * @author 00114260
	 * @date 2017年10月16日 下午3:57:00
	 * @param empId,companyId
     * @return 营业所列表
     */
	List<Branch> selectBranchWithEmpPosOrgView(@Param("empId")String empId, @Param("companyId")String companyId, @Param("areaId")String areaId);
	
	/**
     * <获取EMP_COMPANY对应营业所列表>
     * @author 00114260
	 * @date 2017年10月16日 下午3:57:00
	 * @param empId,companyId
     * @return 营业所列表
     */
	List<Branch> selectBranchWithEmpCompany(@Param("empId")String empId, @Param("companyId")String companyId);
	
	/**
     * <获取对应分公司全部营业所列表>
     * @author 00114260
	 * @date 2017年10月16日 下午3:57:00
	 * @param empId,companyId
     * @return 营业所列表
     */
	List<Branch> selectBranch(@Param("companyId")String companyId, @Param("areaId")String areaId);
	
	/**
     * <根据营业所编码获取营业所信息>
     * @author 00114260
	 * @date 2017年10月17日 上午10:38:00
	 * @param id
     * @return 营业所
     */
	Branch selectBranchWithId(@Param("id")String id);
	
	
}
