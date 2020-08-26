package com.want.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.want.common.po.Area;
import com.want.common.po.Branch;
import com.want.common.po.Channel;
import com.want.common.po.Company;
import com.want.common.po.CustomerInfo;
import com.want.common.po.DistrictCompany;
import com.want.common.po.EmpDistrict;
import com.want.common.po.ForthCity;
import com.want.common.po.SmallMarket;
import com.want.common.po.StandardMarket;
import com.want.common.po.ThirdCity;

/**
 * 
 * <p>Title: 接口</p>
 * <p>Description:获取组织信息</p>
 * <p>Company:旺旺集团</p>
 * @author 00114260
 * @date 2017年10月13日 下午2:06:36
 */
@Service
public interface IGetOrgInfoService {
	
	/**
	 * 
	 * <p>Description:根据员工工号获取员工所在分公司，如果员工没有分公司就全部分公司</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月13日 下午3:12:00
	 * @param empId
	 * @return
	 */
	public List<Company> queryCompanyByEmp(String empId);
	
	/**
	 * 
	 * <p>Description:根据分公司Id获取分公司内容</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月20日 下午1:58:00
	 * @param companyId
	 * @return
	 */
	public Company queryCompanyById(String companyId);

	/**
	 * 
	 * <p>Description:根据员工工号和公司编码获取员工所在营业所，如果员工没有营业所就取分公司下全部营业所 </p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月16日 下午3:01:00
	 * @param empId、companyId
	 * @return
	 */
	public List<Branch> queryBranchByEmp(String empId, String companyId, String areaId);
	
	/**
	 * <p>Description:根据分公司获取营业所信息<p>
	 * @author 00114260
	 * @date 2017年10月17日 上午10:16:00
	 * @param empId、companyId
	 * @return List<Branch>	营业所集合
	 */
	public List<Branch> queryBranchByCompany(String companyId);
	
	/**
	 * <p>Description:根据营业所编码获取营业所信息<p>
	 * @author 00114260
	 * @date 2017年10月17日 上午10:16:00
	 * @param branchId 营业所编码
	 * @return Branch	营业所集合
	 */
	public Branch queryBranchById(String branchId);
	
	/**
	 * <p>Description:根据员工工号获取渠道信息，如果员工没有渠道就取全部渠道<p>
	 * @author 00114260
	 * @date 2017年10月17日 上午10:16:00
	 * @param empId	业代编码
	 * @return List<Channel> 渠道集合
	 */
	public List<Channel> queryChannelByEmp(String empId);
	
	/**
	* <p>Description:根据客户编码获取客户详细信息<p>
	* @author 00114260
	* @date 2017年10月24日 下午02:23:00
	* @param customerId	经销商编码
	* @return CustomerInfo	经销商信息
	 */
	public CustomerInfo getCustomerInfoById(String customerId);

	/**
	* <p>Description:根据人员信息和公司编码获得片区<p>
	* @author 00114260
	* @date 2017年10月30日 上午09:45:00
	* @param empId	业代编码,companyId	公司编码
	* @return List<Area>	区块集合
	 */
	public List<Area> queryAreaByEmpAndCompanyId(String empId, String companyId);
	
	/**
	* <p>Description:根据营业所编码查询标准市场<p>
	* @author 00114260
	* @date 2017年12月07日 上午09:48:00
	* @param branchId	营业所编码
	* @return List<StandardMarket>	标准市场集合
	 */
	public List<StandardMarket> queryMarketByBranch(String branchId);
	

	/**
	* <p>Description:根据标准市场编码查询小标市场<p>
	* @author 00114260
	* @date 2017年12月07日 上午09:48:00
	* @param standardMarketId   标准市场编码
	* @return List<SmallMarket>	小标市场集合
	 */
	public List<SmallMarket> querySmallMarketBysmId(String standardMarketId);
	
	/**
	* <p>Description:根据标准市场编码查询三级地<p>
	* @param marketId	标准市场编码
	* @return List<ThirdCity>	三级地集合
	* @author 00114260
	* @date 2018年01月29日 上午09:48:00
	 */
	public List<ThirdCity> queryThirdByMarket(String marketId);
	
	/**
	* <p>Description:根据三级地编码查询状态为1的四级地<p>
	* @param thirdId	三级地编码
	* @return List<ForthCity>	四级地集合
	* @author 00114260
	* @date 2018年01月29日 上午09:48:00
	 */
	public List<ForthCity> queryForthByThird(String thirdId);
	 /**
	 * 
	 * <p>Description:根据业代Id获取大区信息</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00320558
	 * @date 2019年06月20日 下午10:05:00
	 * @param empId
	 * @return
	 */
	public List<EmpDistrict> queryDistrictById(String empId);
    /**
	 * 
	 * <p>Description:根据大区Id获取分公司信息</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00320558
	 * @date 2019年06月20日 下午10:05:00
	 * @param districtId,districtName
	 * @return
	 */
	public List<DistrictCompany> queryCompanyByDistrictId(String districtId,String districtName);

	
	
}
