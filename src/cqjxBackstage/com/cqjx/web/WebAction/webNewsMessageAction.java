package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.domain.newsMessage;
import cqjxBackstage.com.cqjx.service.cpzxMessageService;
import cqjxBackstage.com.cqjx.service.cpzxMessageServiceImp;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.newsMessageService;
import cqjxBackstage.com.cqjx.service.newsMessageServiceImp;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class webNewsMessageAction extends ActionSupport implements ModelDriven<newsMessage>{
	newsMessage newsmessage = new newsMessage();
	@Override
	public newsMessage getModel() {
		// TODO Auto-generated method stub
		return newsmessage;
	}
	
	
	public String findNewsMessageUuid() {
		// TODO Auto-generated method stub
		newsService newsservice=new newsServiceImp();
		List<news> webFindNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().setAttribute("webFindNewsIndex", webFindNewsIndex);
			
		newsMessageService newsmessageService=new newsMessageServiceImp();
		List<newsMessage> newsMessageList=newsmessageService.findNewsUuid(newsmessage);
		ServletActionContext.getRequest().setAttribute("newsMessageList", newsMessageList);
		return "findNewsMessageUuid";
	}
	
	
	public String findNews() {
		// TODO Auto-generated method stub
		newsMessageService newsmessageService=new newsMessageServiceImp();
		List<newsMessage> newsList=newsmessageService.findNews(newsmessage);
		ServletActionContext.getRequest().setAttribute("newsList", newsList);
		
		newsService newsservice=new newsServiceImp();
		List<news> webFindNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().setAttribute("webFindNewsIndex", webFindNewsIndex);
		return "findNews";
	}
}
