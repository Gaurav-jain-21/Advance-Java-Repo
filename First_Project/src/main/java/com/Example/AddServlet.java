package com.Example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("add")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int sum= i+j;
		Cookie cookie= new Cookie("sum", sum + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
//		HttpSession session = req.getSession();
//		session.setAttribute("sum", sum);
//		res.sendRedirect("sq");
//		res.sendRedirect("sq?sum="+sum); //URL Rewriting
//		PrintWriter out = res.getWriter();
//		out.println("the sum of two number is "+ sum);
//		req.setAttribute("sum", sum);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
	}

}
