 package cqjxBackstage.com.cqjx.web.Action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.gsfl;
import cqjxBackstage.com.cqjx.service.gsflService;
import cqjxBackstage.com.cqjx.service.gsflServiceImp;

public class gsflAction extends ActionSupport implements ModelDriven<gsfl>{
	gsfl gsfl=new gsfl();
	@Override
	public gsfl getModel() {
		// TODO Auto-generated method stub
		return gsfl;
	}
	
	public String updateGsfl() {//更新公司福利相关信息
		gsflService gsflservice=new gsflServiceImp();
		gsflservice.updategsfl(gsfl);
		return "updateGsfl";
	}
	
	
	public String findGsfl() {//查找公司福利相关信息
		gsflService gsflservice=new gsflServiceImp();
		gsfl gsfl=gsflservice.findGsfl();
		
//		String[] gsflList = gsfl.getGsfl().split("\\s+");
		
//		ActionContext.getContext().getValueStack().set("gsflList", gsflList);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("gsfl",gsfl);
		return "gsflFind";
	}

}
