package com.capgemini.dev.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cat")
public class Test extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cat c = new Cat();
		c.setName("Billa");
		c.setAge(2);
		c.setColor("Black");
		RequestDispatcher dis = req.getRequestDispatcher("/test");
		req.setAttribute("cat", c);
		dis.forward(req, resp);
	}
}
