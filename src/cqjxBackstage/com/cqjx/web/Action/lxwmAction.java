package cqjxBackstage.com.cqjx.web.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.lxwm;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.lxwmService;
import cqjxBackstage.com.cqjx.service.lxwmServiceImp;

public class lxwmAction extends ActionSupport implements ModelDriven<lxwm>{
	lxwm lxwm=new lxwm();
	@Override
	public lxwm getModel() {
		// TODO Auto-generated method stub
		return lxwm;
	}
	
	public String updateLxwm() {//更新联系我们相关信息
		lxwmService lxwmservice=new lxwmServiceImp();
		lxwmservice.updatelxwm(lxwm);
		return "updateLxwm";
	}
	
	
	public String findLxwm() {//查找联系我们相关信息
		lxwmService lxwmservice=new lxwmServiceImp();
		lxwm lxwm=lxwmservice.findlxwm();
//		System.out.println(lxwm);
		
//		String[] lxwmList = lxwm.getLxwm().split("\\s+");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("lxwm",lxwm);
		
		return "lxwmFind";
	}

}
