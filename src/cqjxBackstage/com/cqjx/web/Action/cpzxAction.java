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
	public String addCpzxIndex() {//Ĭ�Ͻ������
		return "addCpzxIndex";
	}
	
	public String deleteCpzxIndex() {//Ĭ�Ͻ������
		return "deleteCpzxIndex";
	}
	
	public String addCpzx() {//��Ӳ�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.addcpzx(cpzx);
		return "addCpzx";
	}
	
	public String findCpzx() {//���Ҳ�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("cpzxList", cpzxList);
		System.out.println(cpzxList);
		return "findCpzx";
	}
	
	
	public String updateCpzx() {//���²�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.updateCpzx(cpzx);
		return "updateCpzx";
	}
	
	
	
	public String findCpzxDelete() {//���Ҳ�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> findCpzxDelete = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("findCpzxDelete", findCpzxDelete);
		System.out.println(findCpzxDelete);
		return "deleteCpzx";
	}
	
	public String deleteCpzx() {//���²�Ʒ��Ѷ�����Ϣ
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
