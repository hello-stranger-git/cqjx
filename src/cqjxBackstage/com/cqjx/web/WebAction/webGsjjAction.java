package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.domain.gsjj;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.domain.newsMessage;
import cqjxBackstage.com.cqjx.service.cpzxMessageService;
import cqjxBackstage.com.cqjx.service.cpzxMessageServiceImp;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.gsjjService;
import cqjxBackstage.com.cqjx.service.gsjjServiceImp;
import cqjxBackstage.com.cqjx.service.newsMessageService;
import cqjxBackstage.com.cqjx.service.newsMessageServiceImp;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class webGsjjAction extends ActionSupport implements ModelDriven<gsjj>{
	gsjj gsjj=new gsjj();
	@Override
	public gsjj getModel() {
		// TODO Auto-generated method stub
		return gsjj;
	}

	
	public String findGsjj() {
		//�������ŵ���
		newsService newsservice=new newsServiceImp();
//		List<news> newsList = newsservice.findNews();
		List<news> webFindNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().getSession().setAttribute("newsnav",webFindNewsIndex);
//		ServletActionContext.getRequest().setAttribute("newsListMessage", newsList);
		
		
		newsMessageService newsMessageservice=new newsMessageServiceImp();
		List<newsMessage> newsMessageListAll = newsMessageservice.findNewsMessage();
		ServletActionContext.getRequest().setAttribute("newsMessageListAll", newsMessageListAll);
		
		
		//���ز�Ʒ����
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().getSession().setAttribute("cpzxnav",webFindCpzxIndex);
		ServletActionContext.getRequest().setAttribute("cpzxListMessage", cpzxList);
		
		
		cpzxMessageService cpzxMessageservice=new cpzxMessageServiceImp();
		List<cpzxMessage> cpzxMessageListAll = cpzxMessageservice.findCpzxMessage();
		ServletActionContext.getRequest().setAttribute("cpzxMessageListAll", cpzxMessageListAll);
		
		
		gsjjService gsjjservice=new gsjjServiceImp();
		gsjj gsjj=gsjjservice.findGsjj();
		System.out.println(gsjj);
		ServletActionContext.getRequest().setAttribute("gsjjList",gsjj);
		return "WebFindGsjj";
	}

}
