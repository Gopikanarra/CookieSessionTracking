package com.CookieSessionTrackingApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CSecondServlet")
public class CSecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pcost=request.getParameter("pcost");
		String pquant=request.getParameter("pquan");
		
		Cookie c3=new Cookie("pcost",pcost);
		Cookie c4=new Cookie("pquan",pquant);
		
		response.addCookie(c3);
		response.addCookie(c4);
		
		request.getRequestDispatcher("/cform3.html").forward(request, response);
		
		
	
	}

	
}
