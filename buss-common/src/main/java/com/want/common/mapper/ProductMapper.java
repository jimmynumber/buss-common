package com.want.common.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.want.common.po.ProductLevel;
import com.want.common.pojo.Pagination;

public interface ProductMapper {
	/**
	* <p>根据层级Level和层级编码，获取下级产品层级列表；层级编码采用模糊查询<p>
	* @param prodLevel	层级Level
	* @param prodId	层级编码
	* @return List<ProductLevel>
	* @author 00114260
	* @date 2017年10月26日 下午2:09:00
	 */
	List<ProductLevel> getProdGroupByType(@Param("prodLevel")String prodLevel, @Param("prodId")String prodId);


	/**
	* <p>获得产品信息集合数量，查询条件有产品等级编码模糊查询、产品编码用“,”分割的多值查询、产品名称为模糊查询<p>
	* @param map 包含可选参数id、prodId、prodName
	* @return List<Product>
	* @author 00114260
	* @date 2017年11月02日 上午11:50:00
	 */
	long queryProductCount(Pagination<Map<String, Object>> pagination) ;
	
	/**
	* <p>获得产品信息集合，查询条件有产品等级编码模糊查询、产品编码用“,”分割的多值查询、产品名称为模糊查询<p>
	* @param map 包含可选参数id、prodId、prodName
	* @return List<Product>
	* @author 00114260
	* @date 2017年10月30日 下午5:12:00
	 */
	List<Map<String, Object>> queryProductList(Pagination<Map<String, Object>> pagination) ;
}