package com.ltts.main;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Scanner;

import com.ltts.Dao.*;

import com.ltts.model.*;


public class Main {
	public static void main(String args[]) throws Exception
	{
		
	    System.out.println("1.Show the Table");
		System.out.println("2.Insert into Table");
		System.out.println("3.Update into Table");
		System.out.println("4.search the table");
		Scanner sc=new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(r);
		int ch1=sc.nextInt();
		
		Teamdao td=new Teamdao();
		Playerdao pd=new Playerdao();
		
		if(ch1==1)
		{
			System.out.println("-- Select the Table --");
			System.out.println("1.Show Team Table");
			System.out.println("2.Show Player Table");
			int ch2=sc.nextInt();
						if(ch2==1)
						{
							
							td.showTeam();
							
						}
						if(ch2==2)
						{
							
							pd.showPlayer();
						}
		}
		if(ch1==2) //insert
		{
			System.out.println(" Which Table you want to Insert");
			System.out.println("1.Insert into Team");
			System.out.println("2.Insert into Player");
			int ch3=sc.nextInt();
					if(ch3==1) 
					{
						
						System.out.println("Enter the Name of Your Team  ");
						String tname=br.readLine();
						System.out.println("Enter the TeamOwner  ");
						String towner=br.readLine();
						System.out.println("Enter the TeamID ");
						int tid=Integer.parseInt(br.readLine());
						System.out.println("Enter the TeamCaptain ");
						String tcap=br.readLine();
						Team t=new Team(tname,towner,tid,tcap);
						td.insertTeam(t);
						td.showTeam();
					}
					if(ch3==2)
					{
						
						System.out.println("Enter the Player Name ");
						String pname=sc.next();
						System.out.println("Enter the Player Date of Birth  ");
						String dob=br.readLine();
						Date d=Date.valueOf(dob);
						System.out.println("Enter the Player Skill  ");
						String pskill=br.readLine();
						
						System.out.println("Enter the Player Number of matches");
						int  nmatch=sc.nextInt();
						System.out.println("Enter the Player runs  ");
						int  run=sc.nextInt();
						System.out.println("Enter the Player wickets");
						int wicket=sc.nextInt();
						System.out.println("Enter the Player Nationality ");
						String pnat=br.readLine();
						System.out.println("Enter the Player id  ");
						int pid=sc.nextInt();
						System.out.println("Enter the team id  ");
						int tid=sc.nextInt();
						Boolean b=pd.insertPlayer(new Player(pname,d,pskill,nmatch,run,wicket,pnat,pid,tid));
						if(b==true)
						{
							System.out.println("no");
						}
						else
							System.out.println("yes");
					pd.showPlayer();
					}
		}
			if(ch1==3) //update
			{
				System.out.println("--Which Team you Want to Update");
				System.out.println("1. Player Table");
				System.out.println("2. Team Table");
				int ch4=Integer.parseInt(br.readLine());
				if(ch4==1) //update Team
				{
					System.out.println("Enter Player name");
			    		String name=br.readLine();
			    		
			    		System.out.println("Enter player ID");
			    		int id=Integer.parseInt(br.readLine());

			    		Playerdao pd1=new Playerdao();
					        pd1.updatePlayer(id,name);
			    	}
			    	else if(ch4==2)
			    	{
			    		System.out.println("Enter Team name");
			    		String name=br.readLine();
			    		
			    		System.out.println("Enter team ID");
			    		int id=Integer.parseInt(br.readLine());
			    		
			    		
			    		Teamdao td1=new Teamdao();
					        td1.updateTeam(id,name);
			    	}
			    	else
			    	{
			    		System.out.println("Invalid Entry");
				    	System.exit(0);
			    	}
			}
			
			
			else if(ch1==4)
	    	{
				 System.out.println("Enter the Player Id: "); 
			    	int pid=Integer.parseInt(br.readLine());
			    	
		
			    	 Playerdao pd1=new Playerdao();
				        pd1.searchPlayer(pid);
	    	}
			
						
	sc.close();
	}
	
	}



