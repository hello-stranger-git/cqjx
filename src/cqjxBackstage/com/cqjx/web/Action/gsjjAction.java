package cqjxBackstage.com.cqjx.web.Action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.service.gsjjService;
import cqjxBackstage.com.cqjx.service.gsjjServiceImp;

import cqjxBackstage.com.cqjx.domain.gsjj;
public class gsjjAction extends ActionSupport implements ModelDriven<gsjj>{
	gsjj gsjj=new gsjj();
	public String updateGsjj() {//更新联系我们相关信息
		gsjjService gsjjservice=new gsjjServiceImp();
		gsjjservice.updategsjj(gsjj);
		return "updateGsjj";
	}
	

	public String findGsjj() {//查找公司简介相关信息
		gsjjService gsjjservice=new gsjjServiceImp();
		gsjj gsjj=gsjjservice.findGsjj();
		
//		String[] gsjjList = gsjj.getGsjj().split("\\s+");
		System.out.println(gsjj);
		
		ServletActionContext.getRequest().setAttribute("gsjj",gsjj);
		return "findGsjj";
	}
	@Override
	public gsjj getModel() {
		// TODO Auto-generated method stub
		return gsjj;
	}
}
