package com.ltts.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

import com.ltts.connection.*;
import com.ltts.model.Team;
import com.ltts.Dao.*;

public class Teamdao {
	
	
	public void showTeam() throws Exception
	{
		
		Connection con= MyConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from team");
		System.out.println("TeamName\tTeamOwner\tTeamID\tTeamCaptain");

		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
con.close();
		
	}
	
	public void insertTeam(Team t) throws Exception
	{
		Connection con= MyConnection.getConnection();
		Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into team values(?,?,?,?)");
		ps.setString(1,t.getTeamName());
		ps.setString(2,t.getTeamOwner());
		ps.setInt(3,t.getTeamId());
		ps.setString(4,t.getTeamCaption());
		int i=ps.executeUpdate();
		System.out.println("No of rows effected - "+i);
	}
	public boolean updateTeam(int id,String name) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("UPDATE team SET teamName=? WHERE teamId=?");
		ps.setString(1, name);
		ps.setInt(2, id);
		return ps.execute();
	}
	public void viewPlayersTeamSkill() throws Exception
	{
		Connection con=MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("Select * from player order by nationality,skills");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
		int id=rs.getInt(1);
		String name=rs.getString(2);
		String dob=rs.getString(3);
		String skills=rs.getString(4);
		int teamid=rs.getInt(5);
		int noofmatches=rs.getInt(6);
		int wickets=rs.getInt(7);
		String nationality=rs.getString(8);
		int runs=rs.getInt(9);
		System.out.println(id+" "+name+" "+dob +" "+skills+" "+teamid+" "+noofmatches +" "+wickets+" "+nationality+" "+runs +" ");
		}
	
	}
	
	
	

}