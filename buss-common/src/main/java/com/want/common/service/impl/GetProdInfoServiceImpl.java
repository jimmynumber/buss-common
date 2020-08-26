package com.want.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.want.common.mapper.ProductMapper;
import com.want.common.po.ProductLevel;
import com.want.common.service.IGetProdInfoService;
import com.want.common.pojo.Pagination;

/**
 * 
 * <p>Title: 实现类</p>
 * <p>Description:群组业务层实现类</p>
 * <p>Company:旺旺集团</p>
 * @author 00114260
 * @date 2017年10月24日 下午6:55:36
 */
@Service
public class GetProdInfoServiceImpl implements IGetProdInfoService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<ProductLevel> getProdGroupByType(String prodLevel, String prodId) {
		List<ProductLevel> productLevels = new ArrayList<ProductLevel>();
		productLevels = productMapper.getProdGroupByType(prodLevel, prodId);

		return productLevels;
	}

	@Override
	public Pagination<Map<String, Object>> queryProductList(HashMap<String, String> map, Long pageNum, Long pageSize) {
		Pagination<Map<String, Object>> pagination = new Pagination<>();

        pagination.setPageNum(pageNum);
        pagination.setPageSize(pageSize);

        // Oracle的分页条件
        pagination.setBeginRow((pageNum - 1) * pageSize + 1);
        pagination.setEndRow(pageNum * pageSize + 1);
        pagination.setParameter(map);

        // 查询总条数
        pagination.setTotalCount(productMapper.queryProductCount(pagination), (long) 5);
        
        List<Map<String, Object>> resultList = productMapper.queryProductList(pagination);
        pagination.setResultList(resultList);
        
        return pagination;
    	
	}

}
