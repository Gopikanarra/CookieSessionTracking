package com.CookieSessionTrackingApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CFirstServlet")
public class CFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id=request.getParameter("id");
String name=request.getParameter("name");

Cookie c1=new Cookie("id",id);
Cookie c2=new Cookie("name",name);

response.addCookie(c1);
response.addCookie(c2);

request.getRequestDispatcher("/cform2.html").forward(request, response);



}

}
