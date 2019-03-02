package com.capgemini.dev.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Test1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		Cat c = (Cat)req.getAttribute("cat");
		out.println("<h1>"+c.getName()+"</h1>");
		out.println("<h1>"+c.getColor()+"</h1>");
		out.println("<h1>"+c.getAge()+"</h1>");
		
		
	}
}
