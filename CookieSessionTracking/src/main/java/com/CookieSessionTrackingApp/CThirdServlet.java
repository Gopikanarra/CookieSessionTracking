package com.CookieSessionTrackingApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CThirdServlet")
public class CThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String mdate=request.getParameter("mdate");
	String edate=request.getParameter("edate");
	
	Cookie [] cookies=request.getCookies();
	
	String pid=cookies[0].getValue();
	String pname=cookies[0].getValue();
	String pcost=cookies[0].getValue();
	String pquan=cookies[0].getValue();
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	pw.print("<center><table border=1>");
	pw.print("<tr><td>product id</td><td>"+pid+"</td></tr>");
	pw.print("<tr><td>product name</td><td>"+pname+"</td></tr>");
	pw.print("<tr><td>product cost</td><td>"+pcost+"</td></tr>");
	pw.print("<tr><td>Product quantity</td><td>"+pquan+"</td></tr>");
	pw.print("<tr><td>manufacturing date</td><td>"+mdate+"</td></tr>");
	pw.print("<tr><td>expiry date</td><td>"+edate+"</td></tr>");
	pw.print("</table></center>");
	
	
	
	}

}
