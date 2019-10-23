package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class webNewsAction extends ActionSupport implements ModelDriven<news>{
	news news=new news();

	@Override
	public news getModel() {
		// TODO Auto-generated method stub
		return news;
	}
	
	public String findNews() {//查找新闻
		newsService newsservice=new newsServiceImp();
		List<news> newsList = newsservice.findNews();
		System.out.println(newsList);
		ServletActionContext.getRequest().setAttribute("newsList", newsList);
		return "WebFindNews";
		
	}
	
	public String findNewsMessage() {//查找新闻
		newsService newsservice=new newsServiceImp();
		List<news> newsMessageList = newsservice.findNewsMessag(news);
		ServletActionContext.getRequest().setAttribute("newsMessageList", newsMessageList);
		return "WebNewsMessageFind";
		
	}

}
