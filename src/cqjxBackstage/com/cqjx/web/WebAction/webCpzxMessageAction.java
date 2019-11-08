package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.service.cpzxMessageService;
import cqjxBackstage.com.cqjx.service.cpzxMessageServiceImp;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;

public class webCpzxMessageAction extends ActionSupport implements ModelDriven<cpzxMessage>{
	cpzxMessage cpzxmessage = new cpzxMessage();
	@Override
	public cpzxMessage getModel() {
		// TODO Auto-generated method stub
		return cpzxmessage;
	}
	
	public String findCplx() {
		// TODO Auto-generated method stub
		cpzxMessageService cpzxmessageService=new cpzxMessageServiceImp();
		List<cpzxMessage> cpzxList=cpzxmessageService.findCplx(cpzxmessage);
		ServletActionContext.getRequest().setAttribute("cpzxList", cpzxList);
		
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("webFindCpzxIndex", webFindCpzxIndex);
		return "findCplx";
	}
	
	public String findCpzxMessageUuid() {
		// TODO Auto-generated method stub
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("webFindCpzxIndex", webFindCpzxIndex);
			
		cpzxMessageService cpzxmessageService=new cpzxMessageServiceImp();
		List<cpzxMessage> cpzxMessageList=cpzxmessageService.findCplxUuid(cpzxmessage);
		ServletActionContext.getRequest().setAttribute("cpzxMessageList", cpzxMessageList);
		return "findCpzxMessageUuid";
	}
}
