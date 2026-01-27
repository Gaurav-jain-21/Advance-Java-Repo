package com.Example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqarServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int k = (int)req.getAttribute("sum");
		int k = Integer.parseInt(req.getParameter("sum"));
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		System.out.println("sq called");
	}
}
