package cqjxBackstage.com.cqjx.web.Action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.user;
import cqjxBackstage.com.cqjx.service.userService;
import cqjxBackstage.com.cqjx.service.userServiceImp;

public class userRegist extends ActionSupport implements ModelDriven<user>{
//	HttpServletRequest request;
	user user=new user();
	@Override
	public user getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	public String regist() {//�û�ע��
		System.out.println("�û�ע��");
		System.out.println(user);
		userService userService=new userServiceImp();
		userService.regist(user);
		return "regist";
	}

	public String registIndex() {//�û�ע��
		return "registIndex";
	}
}
