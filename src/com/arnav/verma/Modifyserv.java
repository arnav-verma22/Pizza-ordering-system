package com.arnav.verma;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * Servlet implementation class Modifyserv
 */
@WebServlet("/Modifyserv")
public class Modifyserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Modifyserv() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		if(request.getParameter("modify") != null)
			response.sendRedirect("ModifyPage.jsp");
		ArrayList<Pizza> list = (ArrayList<Pizza>)session.getAttribute("list");
		ArrayList<Pizza> cart = new ArrayList<Pizza>();
	
		if(session.getAttribute("Cart") != null)
			cart  = (ArrayList<Pizza>)session.getAttribute("Cart");
			
		if(request.getParameter("modifythis") != null)
		{
			for (Pizza pz : list) 
			{
				if(pz.getName().equalsIgnoreCase(request.getParameter("name")))
				{
					
					System.out.println("found");
					cart.add(pz);
					break;
				}
			}
			session.setAttribute("Cart", cart);
			session.setAttribute("modifythis", request.getParameter("modifythis"));
			response.sendRedirect("AddCart.jsp");
			
		}
			
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
