package com.arnav.verma;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FilterServ
 */
@WebServlet("/FilterServ")
public class FilterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FilterServ() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//PrintWriter out = response.getWriter();
		Connection con = null;
		ArrayList<Pg> thelist = null;
		HashMap<String, String> str = new HashMap<String, String>();
		HashMap<String, Integer> ints = new HashMap<String, Integer>();
		String room = request.getParameter("room");
		String address = request.getParameter("city");
		String gen = request.getParameter("gen");
		int seater = Integer.parseInt(request.getParameter("seater"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
