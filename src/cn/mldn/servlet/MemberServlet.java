package cn.mldn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.mldn.service.IMemberService;
import cn.mldn.util.factory.Factory;

@SuppressWarnings("serial")
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid") ;	// 接收用户发送的请求参数
		IMemberService memberService = Factory.getServiceInstance("member.service") ;
		try {
			response.getWriter().println(memberService.checkMid(mid)) ;
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
