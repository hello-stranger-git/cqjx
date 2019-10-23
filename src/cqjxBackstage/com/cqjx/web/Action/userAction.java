package cqjxBackstage.com.cqjx.web.Action;



import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.user;
import cqjxBackstage.com.cqjx.service.userService;
import cqjxBackstage.com.cqjx.service.userServiceImp;

public class userAction extends ActionSupport implements ModelDriven<user>{
//	HttpServletRequest request;
	user user=new user();
	@Override
	public user getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
//	public void setServletRequest(HttpServletRequest request) {
//		// TODO Auto-generated method stub
//		this.request=request;
//	}
	public String singIn() {//�û���¼
		System.out.println("�����û�");
		userService userService=new userServiceImp();
		user exitUser=userService.singIn(user);
		
		if(exitUser == null){
			// ��¼ʧ��
			// ActionError��FieldError��ActionMessage
			System.out.println("��¼ʧ��");
			this.addActionError("�û������������");
			return "singFaild";
		}else{
			// ��¼�ɹ�
			// ActionContext.getContext().getSession().put("existUser", "existUser");
			System.out.println("��¼�ɹ�");
			ServletActionContext.getRequest().getSession().setAttribute("exitUser",user);
			return "singSuccess";
		}
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
