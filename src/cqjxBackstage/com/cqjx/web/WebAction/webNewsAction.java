package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class webNewsAction extends ActionSupport implements ModelDriven<news>{
	news news=new news();

	@Override
	public news getModel() {
		// TODO Auto-generated method stub
		return news;
	}
	
	public String findNews() {//��������
		newsService newsservice=new newsServiceImp();
		List<news> newsList = newsservice.findNews();
		System.out.println(newsList);
		ServletActionContext.getRequest().setAttribute("newsList", newsList);
		System.out.println("请求成功为"+ServletActionContext.getRequest().getAttribute("newsList"));
		return "WebFindNews";
		
	}
	
//	public void webFindNewsNav() {//���Ҳ�Ʒ��Ѷ�����Ϣ
//		newsService newsservice=new newsServiceImp();
//		List<news> newsList = newsservice.findNews();
//		List<news> webFindNewsIndex = newsservice.findNews();
//		ServletActionContext.getRequest().getSession().setAttribute("newsnav",webFindNewsIndex);
//	}
	
	
	public String webFindNewsIndex() {//���Ҳ�Ʒ��Ѷ�����Ϣ
		newsService newsservice=new newsServiceImp();
		List<news> webFindNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().setAttribute("webFindNewsIndex", webFindNewsIndex);
		return "webFindNewsIndex";
	}
	
	public String findNewsMessage() {//��������
		
		newsService newsservice=new newsServiceImp();
		List<news> newsMessageList = newsservice.findNewsMessag(news);
		ServletActionContext.getRequest().setAttribute("newsMessageList", newsMessageList);
		
		List<news> webFindNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().setAttribute("webFindNewsIndex", webFindNewsIndex);
		return "WebNewsMessageFind";
		
	}

}
