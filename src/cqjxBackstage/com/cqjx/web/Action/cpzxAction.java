package cqjxBackstage.com.cqjx.web.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class cpzxAction extends ActionSupport implements ModelDriven<cpzx>{
	cpzx cpzx=new cpzx();
	public String addCpzxIndex() {//默认进入界面
		return "addCpzxIndex";
	}
	
	public String deleteCpzxIndex() {//默认进入界面
		return "deleteCpzxIndex";
	}
	
	public String addCpzx() {//添加产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.addcpzx(cpzx);
		return "addCpzx";
	}
	
	public String findCpzx() {//查找产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("cpzxList", cpzxList);
		System.out.println(cpzxList);
		return "findCpzx";
	}
	
	
	public String updateCpzx() {//更新产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.updateCpzx(cpzx);
		return "updateCpzx";
	}
	
	
	
	public String findCpzxDelete() {//查找产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> findCpzxDelete = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("findCpzxDelete", findCpzxDelete);
		System.out.println(findCpzxDelete);
		return "deleteCpzx";
	}
	
	public String deleteCpzx() {//更新产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.deleteCpzx(cpzx);
		return "deleteCpzxIndex";
	}
	
	@Override
	public cpzx getModel() {
		// TODO Auto-generated method stub
		return cpzx;
	}

}
