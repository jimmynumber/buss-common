package com.want.common.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import com.want.common.service.IGetOrgInfoService;

@RestController
@RequestMapping(value = "organization")
public class OrganizationController {
	// 定义一个LOGGER常量，用来打印log
	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	private  IGetOrgInfoService getOrgInfoService;
	
	@Value(value = "${staticUrl}")
	private String test;
	
	/**
	 * 
	 * <p>Description:根据员工工号获取员工所在分公司，如果员工没有分公司就全部分公司</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月17日 下午3:12:00
	 * @param empId
	 * @return List<Company>
	 */
	@RequestMapping(value = "queryCompanyByEmp" , method = RequestMethod.POST)
	public List<Company> queryCompanyByEmp(@RequestParam(value = "empId", required = false) String empId) {
		System.out.println(test);
		return getOrgInfoService.queryCompanyByEmp(empId);
	}
	
	/**
	 * 
	 * <p>Description:根据分公司Id获取分公司内容</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月24日 下午2:19:00
	 * @param companyId
	 * @return
	 */
	@RequestMapping(value = "queryCompanyById" , method = RequestMethod.POST)
	public Company queryCompanyById(@RequestParam(value = "companyId", required = false) String companyId) {
		return getOrgInfoService.queryCompanyById(companyId);
	}
	
	/**
	 * 
	 * <p>Description:根据员工工号和公司编码获取员工所在营业所，如果员工没有营业所就取分公司下全部营业所</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月23日 下午5:57:00
	 * @param empId,companyId
	 * @return List<Branch>
	 */
	@RequestMapping(value = "queryBranchByEmp" , method = RequestMethod.POST)
	public List<Branch> queryBranchByEmp(@RequestParam(value = "empId", required = false) String empId
			, @RequestParam(value = "companyId", required = false) String companyId
			, @RequestParam(value = "areaId", required = false) String areaId) {
		return getOrgInfoService.queryBranchByEmp(empId, companyId, areaId);
	}
	
	/**
	 * <p>Description:根据分公司获取营业所信息<p>
	 * @author 00114260
	 * @date 2017年10月24日 下午01:12:00
	 * @param empId、companyId
	 * @return List<Branch>	营业所集合
	 */
	@RequestMapping(value = "queryBranchByCompany" , method = RequestMethod.POST)
	public List<Branch> queryBranchByCompany(@RequestParam(value = "companyId", required = false) String companyId) {
		return getOrgInfoService.queryBranchByCompany(companyId);
	}
	
	/**
	 * <p>Description:根据营业所编码获取营业所信息<p>
	 * @author 00114260
	 * @date 2017年10月17日 上午10:16:00
	 * @param branchId 营业所编码
	 * @return Branch	营业所集合
	 */
	@RequestMapping(value = "queryBranchById" , method = RequestMethod.POST)
	public Branch queryBranchById(@RequestParam(value = "branchId", required = false) String branchId) {
		return getOrgInfoService.queryBranchById(branchId);
	}
	
	/**
	 * <p>Description:根据员工工号获取渠道信息，如果员工没有渠道就取全部渠道<p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月24日 上午10:27:00
	 * @param empId	业代编码
	 * @return List<Channel> 渠道集合
	 */
	@RequestMapping(value = "queryChannelByEmp" , method = RequestMethod.POST)
	public List<Channel> queryChannelByEmp(@RequestParam(value = "empId", required = false) String empId) {
		return getOrgInfoService.queryChannelByEmp(empId);
	}
	
	/**
	 * <p>Description:根据客户编码获取客户详细信息<p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00114260
	 * @date 2017年10月24日 下午14:49:00
	 * @param empId	业代编码
	 * @return List<Channel> 渠道集合
	 */
	@RequestMapping(value = "getCustomerInfoById" , method = RequestMethod.POST)
	public CustomerInfo getCustomerInfoById(@RequestParam(value = "customerId", required = false) String customerId) {
		return getOrgInfoService.getCustomerInfoById(customerId);
	}
	
	/**
	* <p>Description:根据人员信息和公司编码获得片区<p>
	* @author 00114260
	* @date 2017年10月30日 上午09:45:00
	* @param empId	业代编码,companyId	公司编码
	* @return List<Area>	区块集合
	 */
	@RequestMapping(value = "queryAreaByEmpAndCompanyId" , method = RequestMethod.POST)
	public List<Area> queryAreaByEmpAndCompanyId(@RequestParam(value = "empId", required = true) String empId, @RequestParam(value = "companyId", required = true) String companyId) {
		return getOrgInfoService.queryAreaByEmpAndCompanyId(empId, companyId);
	}
	
	/**
	* <p>Description:根据营业所编码查询标准市场<p>
	* @author 00114260
	* @date 2017年12月07日 上午09:48:00
	* @param branchId	营业所编码
	* @return List<StandardMarket>	标准市场集合
	 */
	@RequestMapping(value = "queryMarketByBranch" , method = RequestMethod.POST)
	public List<StandardMarket> queryMarketByBranch(@RequestParam(value = "branchId", required = true)String branchId) {
		return getOrgInfoService.queryMarketByBranch(branchId);
	}
	
	/**
	* <p>Description:根据标准市场编码查询小标市场<p>
	* @author 00114260
	* @date 2017年12月07日 上午09:48:00
	* @param standardMarketId   标准市场编码
	* @return List<SmallMarket>	小标市场集合
	 */
	@RequestMapping(value = "querySmallMarketBysmId" , method = RequestMethod.POST)
	public List<SmallMarket> querySmallMarketBysmId(@RequestParam(value = "standardMarketId", required = true)String standardMarketId) {
		return getOrgInfoService.querySmallMarketBysmId(standardMarketId);
	}
	
	/**
	* <p>Description:根据标准市场编码查询三级地<p>
	* @param marketId	标准市场编码
	* @return List<ThirdCity>	三级地集合
	* @author 00114260
	* @date 2018年01月29日 上午09:48:00
	 */
	@RequestMapping(value = "queryThirdByMarket" , method = RequestMethod.POST)
	public List<ThirdCity> queryThirdByMarket(@RequestParam(value = "marketId", required = true)String marketId){
		return getOrgInfoService.queryThirdByMarket(marketId);
	}

	/**
	* <p>Description:根据三级地编码查询状态为1的四级地<p>
	* @param thirdId	三级地编码
	* @return List<ForthCity>	四级地集合
	* @author 00114260
	* @date 2018年01月29日 上午09:48:00
	 */
	@RequestMapping(value = "queryForthByThird" , method = RequestMethod.POST)
	public List<ForthCity> queryForthByThird(@RequestParam(value = "thirdId", required = true)String thirdId){
		return getOrgInfoService.queryForthByThird(thirdId);
	}
    /****************/
    /**
	 * 
	 * <p>Description:根据业代Id获取大区信息</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00320558
	 * @date 2019年06月20日 下午10:05:00
	 * @param empId
	 * @return
	 */
	@RequestMapping(value = "queryDistrictById" , method = RequestMethod.POST)
	public List<EmpDistrict> queryDistrictById(@RequestParam(value = "empId", required = false) String empId) {
		return getOrgInfoService.queryDistrictById(empId);
	}
    /**
	 * 
	 * <p>Description:根据大区Id获取分公司信息</p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00320558
	 * @date 2019年06月20日 下午10:05:00
	 * @param districtId，districtName 
	 * @return
	 */
	@RequestMapping(value = "queryCompanyByDistrictId", method = RequestMethod.POST )
	public List<DistrictCompany> queryCompanyByDistrictId(@RequestParam(value = "districtId", required = false) String districtId,@RequestParam(value = "districtName", required = false) String districtName) {
		return getOrgInfoService.queryCompanyByDistrictId(districtId,districtName);
	}
	
}
