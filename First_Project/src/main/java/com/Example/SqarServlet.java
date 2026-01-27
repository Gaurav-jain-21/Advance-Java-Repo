package com.Example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqarServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int k = (int)req.getAttribute("sum");
//		int k = Integer.parseInt(req.getParameter("sum"));
//		HttpSession session= req.getSession();
//		int k= (int)session.getAttribute("sum");
		int k=0;
		Cookie cookies[]= req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("sum")) {
				k =Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		System.out.println("sq called");
	}
}
