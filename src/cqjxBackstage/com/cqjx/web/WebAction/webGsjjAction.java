package cqjxBackstage.com.cqjx.web.WebAction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.gsjj;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.gsjjService;
import cqjxBackstage.com.cqjx.service.gsjjServiceImp;
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
		//加载新闻导航
		newsService newsservice=new newsServiceImp();
		List<news> newsList = newsservice.findNews();
		List<news> webFindNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().getSession().setAttribute("newsnav",webFindNewsIndex);
		
		//加载产品导航
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		List<cpzx> webFindCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().getSession().setAttribute("cpzxnav",webFindCpzxIndex);
		
		
		gsjjService gsjjservice=new gsjjServiceImp();
		gsjj gsjj=gsjjservice.findGsjj();
		System.out.println(gsjj);
		String[] gsjjList = gsjj.getGsjj().split("\\s+");
		ServletActionContext.getRequest().setAttribute("gsjjList",gsjjList);
		return "WebFindGsjj";
	}
	
	

}
