package cqjxBackstage.com.cqjx.web.WebAction;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.gsjj;
import cqjxBackstage.com.cqjx.service.gsjjService;
import cqjxBackstage.com.cqjx.service.gsjjServiceImp;

public class webGsjjAction extends ActionSupport implements ModelDriven<gsjj>{
	gsjj gsjj=new gsjj();
	@Override
	public gsjj getModel() {
		// TODO Auto-generated method stub
		return gsjj;
	}

	
	public String findGsjj() {
		gsjjService gsjjservice=new gsjjServiceImp();
		gsjj gsjj=gsjjservice.findGsjj();
		System.out.println(gsjj);
		String[] gsjjList = gsjj.getGsjj().split("\\s+");
		ServletActionContext.getRequest().setAttribute("gsjjList",gsjjList);
		return "WebFindGsjj";
	}

}
