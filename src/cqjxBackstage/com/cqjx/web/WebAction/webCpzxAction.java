package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;

public class webCpzxAction extends ActionSupport implements ModelDriven<cpzx>{
	cpzx cpzx=new cpzx();
	
	public String webFindCpzx() {//查找产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("cpzxList", cpzxList);
		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("webFindCpzxIndex", webFindCpzxIndex);

		System.out.println(cpzxList);
		return "WebCpzxFind";
	}
	
//	public void webFindCpzxNav() {//查找产品资讯相关信息
//		cpzxService cpzxservice=new cpzxServiceImp();
//		List<cpzx> cpzxList = cpzxservice.findCpzx();
//		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
//		ServletActionContext.getRequest().getSession().setAttribute("cpzxnav",webFindCpzxIndex);
//
//	}
	
	
	public String webFindCpzxIndex() {//查找产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("webFindCpzxIndex", webFindCpzxIndex);
		System.out.println(webFindCpzxIndex);
		return "webFindCpzxIndex";
	}
	
	public String findCpzxMessage() {//查找产品资讯相关信息
		
		
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxMessageList = cpzxservice.findCpzxMessage(cpzx);
		ServletActionContext.getRequest().setAttribute("cpzxMessageList", cpzxMessageList);
		

		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("webFindCpzxIndex", webFindCpzxIndex);
		
		System.out.println(cpzxMessageList);
		return "WebCpzxMessageFind";
	}

	@Override
	public cpzx getModel() {
		// TODO Auto-generated method stub
		return cpzx;
	}
}
