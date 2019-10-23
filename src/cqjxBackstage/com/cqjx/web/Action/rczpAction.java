package cqjxBackstage.com.cqjx.web.Action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.rczp;
import cqjxBackstage.com.cqjx.service.rczpService;
import cqjxBackstage.com.cqjx.service.rczpServiceImp;

public class rczpAction extends ActionSupport implements ModelDriven<rczp>{
	rczp rczp=new rczp();
	public String addrczp() {//添加新闻
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.addrczp(rczp);
		return "addRczp";
	}
	public String addRczpIndex() {//默认进入界面
		return "addRczpIndex";
	}
	
	public String deleteRczpIndex() {//默认进入界面
		return "deleteRczpIndex";
	}
	
	public String findRczp() {//查找人才招聘
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> rczpList = rczpservice.findRczp();
		System.out.println(rczpList);
		ServletActionContext.getRequest().setAttribute("rczpList", rczpList);
		return "findRczp";
		
	}
	
	
	public String findRczpDelete() {//查找人才招聘
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> findRczpDelete = rczpservice.findRczp();
		System.out.println(findRczpDelete);
		ServletActionContext.getRequest().setAttribute("findRczpDelete", findRczpDelete);
		return "deleteRczp";
		
	}
	
	public String updateRczp() {//更新人才招聘
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.updateRczp(rczp);
		return "updateRczp";
		
	}
	
	
	public String deleteRczp() {//删除人才招聘
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.deleteRczp(rczp);
		return "deleteRczpIndex";
		
	}

	@Override
	public rczp getModel() {
		// TODO Auto-generated method stub
		return rczp;
	}
}
