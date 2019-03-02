package com.capgemini.dev.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCooki extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Cookie [] ck = req.getCookies();
		
		for(Cookie c:ck)
		{
			if(c.getName().equals("sharmji"))
			{
				c.setMaxAge(0);
				resp.addCookie(c);
				out.println("<h1>"+"Cookie Deleted"+"</h1>");
			}
		}
		
	}
}
