package com.want.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.want.common.po.DistrictCompany;

public interface DistrictCompanyMapper {
	 /**
		 * 
		 * <p>Description:根据大区Id获取分公司信息</p>
		 * <p>Company:旺旺集团 </p>
		 * @author 00320558
		 * @date 2019年06月20日 下午10:05:00
		 * @param districtId,districtName
		 * @return
		 */
		public List<DistrictCompany> queryCompanyByDistrictId(@Param("districtId")String districtId,@Param("districtName")String districtName);
}
