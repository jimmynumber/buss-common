package com.want.common.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.want.common.po.ProductLevel;
import com.want.common.pojo.Pagination;

/**
 * 
 * <p>Title: 接口</p>
 * <p>Description:获取产品信息</p>
 * <p>Company:旺旺集团</p>
 * @author 00114260
 * @date 2017年10月24日 下午6:54:36
 */
@Service
public interface IGetProdInfoService {
	
	/**
	* <p>根据层级Level和层级编码，获取下级产品层级列表；层级编码采用模糊查询<p>
	* @param prodLevel	层级Level
	* @param prodId	层级编码
	* @return List<ProductLevel>
	* @author 00114260
	* @date 2017年10月13日 下午3:12:00
	 */
	public List<ProductLevel> getProdGroupByType(String prodLevel, String prodId);
	
	/**
	* <p>获得产品信息集合，查询条件有产品等级编码模糊查询、产品编码用“,”分割的多值查询、产品名称为模糊查询<p>
	* @param map 包含可选参数id、prodId、prodName
	* @return List<Product>
	* @author 00114260
	* @date 2017年10月30日 下午5:12:00
	 */
	public Pagination<Map<String, Object>> queryProductList(HashMap<String, String> map, Long pageNum, Long pageSize) ;
}
