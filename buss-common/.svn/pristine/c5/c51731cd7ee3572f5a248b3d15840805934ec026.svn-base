package com.want.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.want.common.mapper.PositionMapper;
import com.want.common.po.Emp;
import com.want.common.po.PosType;
import com.want.common.service.IGetUserManagerService;
import com.want.sso.client.thread.UserThreadLocal;

/**
 * 
 * <p>Title: 实现类</p>
 * <p>Description:群组业务层实现类</p>
 * <p>Company:旺旺集团</p>
 * @author 00114260
 * @date 2017年10月30日 上午9:02:36
 */
@Service
public class GetUserManagerServiceImpl implements IGetUserManagerService {

	@Autowired
	private PositionMapper positionMapper;

	@Override
	public List<PosType> queryPosType() {
	    List<PosType> list = positionMapper.queryPosType();
	    return list;
	}

	@Override
	public List<Emp> getLoginInfo() {
		String loginUserId = UserThreadLocal.get().getAccount();
		return positionMapper.getLoginInfo(loginUserId);
	}

	@Override
	public boolean isHQ(String empId) {
		List<Emp> list = positionMapper.isHQ(empId);
	    if (list!=null && list.size()>0) {
	    	return true;
	    }
	    return false;
	}

}
