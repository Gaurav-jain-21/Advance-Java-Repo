package com.Example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int sum= i+j;
		res.sendRedirect("sq?sum="+sum);
//		PrintWriter out = res.getWriter();
//		out.println("the sum of two number is "+ sum);
//		req.setAttribute("sum", sum);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
	}

}
