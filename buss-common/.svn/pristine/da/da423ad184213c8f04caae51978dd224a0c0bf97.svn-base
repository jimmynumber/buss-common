package com.want.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.want.common.po.ProductLevel;
import com.want.common.pojo.Pagination;
import com.want.common.service.IGetProdInfoService;

@RestController
@RequestMapping(value = "product")
public class ProductController {
	@Autowired
	public IGetProdInfoService getProdInfoService;
	
	/**
	* <p>根据层级Level和层级编码，获取下级产品层级列表；层级编码采用模糊查询<p>
	* @param prodLevel	层级Level
	* @param prodId	层级编码
	* @return List<ProductLevel>
	* @author 00114260
	* @date 2017年10月13日 下午3:12:00
	 */
	@RequestMapping(value = "getProdGroupByType" , method = RequestMethod.POST)
	public List<ProductLevel> getProdGroupByType(@RequestParam(value = "prodLevel", required = false) String prodLevel, @RequestParam(value = "prodId", required = false) String prodId) {
		System.out.println("222222222222");
		return getProdInfoService.getProdGroupByType(prodLevel, prodId);
	}
	
	/**
	* <p>获得产品信息集合，查询条件有产品等级编码模糊查询、产品编码用“,”分割的多值查询、产品名称为模糊查询<p>
	* @param map 包含可选参数id、prodId、prodName
	* @return List<Product>
	* @author 00114260
	* @date 2017年10月30日 下午5:12:00
	 */
	@RequestMapping(value = "queryProductList" , method = RequestMethod.POST)
	public Map<String, Object> queryProductList(
			@RequestParam(value = "levelId", required = false) String levelId, 
			@RequestParam(value = "prodId", required = false) String prodId, 
			@RequestParam(value = "prodName", required = false) String prodName, 
	        @RequestParam(value = "pageNum", defaultValue = "1") Long pageNum,
	        @RequestParam(value = "pageSize", defaultValue = "15") Long pageSize) {
		Map<String, Object> resultMap = new HashMap<>();
		HashMap<String, String> map = new HashMap<>();
		map.put("levelId", levelId);
		map.put("prodId", prodId);
		map.put("prodName", prodName);
		Pagination<Map<String, Object>> pagination =  getProdInfoService.queryProductList(map, pageNum, pageSize);
		resultMap.put("data", pagination);
		
		return resultMap;
	}
}
