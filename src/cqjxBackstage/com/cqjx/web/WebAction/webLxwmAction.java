package cqjxBackstage.com.cqjx.web.WebAction;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.lxwm;
import cqjxBackstage.com.cqjx.service.lxwmService;
import cqjxBackstage.com.cqjx.service.lxwmServiceImp;

public class webLxwmAction extends ActionSupport implements ModelDriven<lxwm>{
	lxwm lxwm = new lxwm();
	@Override
	public lxwm getModel() {
		// TODO Auto-generated method stub
		return lxwm;
	}
	
	public String findLxwm() {//查找联系我们相关信息
		lxwmService lxwmservice=new lxwmServiceImp();
		lxwm lxwm=lxwmservice.findlxwm();
		
		String[] lxwmList = lxwm.getLxwm().split("\\s+");
		ServletActionContext.getRequest().setAttribute("lxwmList",lxwmList);
		
		return "WebLxwmFind";
	}

}
