package cqjxBackstage.com.cqjx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cqjxBackstage.com.cqjx.BaseServlet.BaseServlet;

public class UserServlet extends BaseServlet {
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "/jsp/User/SingIn.jsp";
	}
}
