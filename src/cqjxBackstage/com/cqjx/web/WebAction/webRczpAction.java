package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.rczp;
import cqjxBackstage.com.cqjx.service.rczpService;
import cqjxBackstage.com.cqjx.service.rczpServiceImp;

public class webRczpAction extends ActionSupport implements ModelDriven<rczp>{
	rczp rczp=new rczp();
	@Override
	public rczp getModel() {
		// TODO Auto-generated method stub
		return rczp;
	}
	
	
	public String findRczp() {//查找人才招聘
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> rczpList = rczpservice.findRczp();
		System.out.println(rczpList);
		ServletActionContext.getRequest().setAttribute("rczpList", rczpList);
		return "WebFindRczp";
		
	}
	
	public String findRczpMessage() {//查找人才招聘
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> rczpListMessage = rczpservice.findRczpMessage(rczp);
		ServletActionContext.getRequest().setAttribute("rczpListMessage", rczpListMessage);
		return "WebRczpMessageFind";
		
	}

}
