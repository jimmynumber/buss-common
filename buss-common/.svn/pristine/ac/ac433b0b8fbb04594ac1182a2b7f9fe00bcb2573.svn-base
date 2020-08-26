package com.want.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.want.common.controller.OrganizationController;
import com.want.common.po.Branch;
import com.want.common.po.Channel;
import com.want.common.po.Company;
import com.want.common.service.IGetOrgInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext*.xml")
public class test {

	@Autowired
	private  OrganizationController organizationController;

	@Autowired
	private  IGetOrgInfoService getOrgInfoService;
	
	@Test
	public  void getCompany() {
		 System.out.println("1111111111");
		 List<Company> list  = organizationController.queryCompanyByEmp("00114260");
//		 List<Branch> list  = getOrgInfoService.queryBranchByEmp("00114260","CX1");
//		 List<Branch> list = getOrgInfoService.queryBranchByCompany("CX1");
//		 Branch branch = getOrgInfoService.queryBranchById("3614");
//		 Company company = getOrgInfoService.queryCompanyById("CX1");
//		 List<Channel> list = getOrgInfoService.queryChannelByEmp("00114260");
		 
//		 System.out.println(company.getName());
		 System.out.println("list.size:" + list.size());
			//for (int i = 0; i < list.size(); i++) {
			//	System.out.println(list.get(i).getChannelName());;
			//	System.out.println(list.get(i).getName() +"-"+ list.get(i).getAreaId() +"-"+ list.get(i).getCompanyId());
			//}
		
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
//		context.start();
//		
//		List<Company> list  = IGetOrgInfoService.queryCompanyByEmp("00114260");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName());
//		}
//	}

}
