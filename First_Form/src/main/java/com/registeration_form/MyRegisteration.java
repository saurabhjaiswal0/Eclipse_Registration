package com.registeration_form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyRegisteration extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		//using of the printWriter for print the output in a browser
		PrintWriter pw=resp.getWriter();
		pw.println("<h1>Welecome to ragistration page</h1>");
		
		String name=req.getParameter("user_name");//using of the input field value of name="user_name";
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		
		String cond=req.getParameter("condition");
		pw.println("condition :"+cond);
		if(cond !=null) 
		{
		if(cond.equals("checked"))
		{
		    pw.println("<h2>Name : "+name+" </h2>");
		    pw.println("<h2>Email : "+email+" </h2>");
		    pw.println("<h2>Password : "+password+" </h2>");
		    pw.println("<h2>Gender : "+gender+" </h2>");
		    pw.println("<h2>Course : "+course+" </h2>");
		    
	    }
		
		else
		{
			pw.println("<h1>You have not accepted term and condition</h1>");
		}
		}
		else
		{
			pw.println("<h1>You have not accepted term and condition</h1>");
		}

	

	}  

}
