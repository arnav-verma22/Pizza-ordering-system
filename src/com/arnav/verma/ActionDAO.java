package com.arnav.verma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

class ActionDAO
{
	private Connection con;

	public ActionDAO(Connection con)
	{
		this.con = con;
	}
	
	
	public ArrayList<Pizza> Search(String type) throws SQLException 
	{
		ArrayList<Pizza> list = new ArrayList<Pizza>();
		ResultSet rs = null;
		String query = "select * from pizza where piztype = '" + type + "'";;
		
		if(this.con != null)
		{
			Statement st = con.createStatement();
			rs = st.executeQuery(query);
			//System.out.println(rs);
		}
		while(rs.next())
		{
			Pizza pz = new Pizza();
			pz.setName(rs.getString("pizname"));
			pz.setPrice(rs.getInt("price"));
			list.add(pz);
		}
		return list;
	}
	
}