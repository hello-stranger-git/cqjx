package cqjxBackstage.com.cqjx.web.filter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import cqjxBackstage.com.cqjx.domain.user;

public class userFilter extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		//�ж�session���Ƿ�����û�����
		user exitUser = (user) ServletActionContext.getRequest().getSession().getAttribute("exitUser");
		if(exitUser==null) {
			ActionSupport actionSupport = (ActionSupport)invocation.getAction();
			actionSupport.addActionError("���ȵ�¼");
			return "singFaild";
		}else {
			return invocation.invoke();
		}
	}

}
