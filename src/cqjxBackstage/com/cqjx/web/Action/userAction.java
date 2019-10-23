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
	public String singIn() {//用户登录
		System.out.println("查找用户");
		userService userService=new userServiceImp();
		user exitUser=userService.singIn(user);
		
		if(exitUser == null){
			// 登录失败
			// ActionError、FieldError、ActionMessage
			System.out.println("登录失败");
			this.addActionError("用户名或密码错误！");
			return "singFaild";
		}else{
			// 登录成功
			// ActionContext.getContext().getSession().put("existUser", "existUser");
			System.out.println("登录成功");
			ServletActionContext.getRequest().getSession().setAttribute("exitUser",user);
			return "singSuccess";
		}
	}
	
	public String regist() {//用户注册
		System.out.println("用户注册");
		System.out.println(user);
		userService userService=new userServiceImp();
		userService.regist(user);
		return "regist";
	}

	public String registIndex() {//用户注册
		return "registIndex";
	}
}
