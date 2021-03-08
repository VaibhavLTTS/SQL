package com.ltts.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ltts.Dao.*;
import com.ltts.connection.*;
import com.ltts.model.Player;

public class Playerdao {

	
	
	
	public void showPlayer() throws Exception
	{
		Connection con= MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from player");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6)+"\t"+rs.getString(7)+rs.getInt(8)+rs.getInt(9));
			}

			con.close();
	}
	
	
	public Boolean insertPlayer(Player p) throws Exception
	{		
			Connection con= MyConnection.getConnection();
		
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,p.getpName());
			ps.setDate(2,p.getDateOfBirth());
			ps.setString(3,p.getSkill());
			ps.setInt(4,p.getNoOfMatches());
			ps.setInt(5,p.getRuns());
			ps.setInt(6,p.getWickets());
			ps.setString(7,p.getNationality());
			ps.setInt(8,p.getPid());
			ps.setInt(9,p.getTeamId());
			boolean i=ps.execute();
			return i;
			
		
	}
	public  boolean updatePlayer(int id,String name) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("UPDATE player SET playerName=? WHERE playerId=?");
		ps.setString(1, name);
		ps.setInt(2, id);
	
		
		return ps.execute();
	}
	public void searchPlayer(int id) throws Exception
	{
		
		Connection con=MyConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("Select p.playerName,t.teamName,t.coachName,TIMESTAMPDIFF(YEAR, dateOfBirth, CURDATE()) AS age from player as p inner join team as t on p.playerId=t.playerId where p.playerId=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			String name=rs.getString(1);
			String n=rs.getString(2);
			String cn=rs.getString(3);
			String age=rs.getString(4);
			System.out.println(name+" "+n+" "+cn+" "+age);
			
		}
		
		

}}