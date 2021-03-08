package com.ltts.player;

import java.sql.Date;

public class Player {
	private String pName;
	
	private Date dateOfBirth;
	private String Skill;
	
	private int noOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private int pid;
	private int teamId;
	
	
	public Player() {
		super();
	}
	public Player(String pName, Date dateOfBirth, String skill, int noOfMatches, int runs, int wickets,
			String nationality, int pid, int teamId) {
		super();
		this.pName = pName;
		this.dateOfBirth = dateOfBirth;
		Skill = skill;
		this.noOfMatches = noOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.pid = pid;
		this.teamId = teamId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	@Override
	public String toString() {
		return "Player [pName=" + pName + ", dateOfBirth=" + dateOfBirth + ", Skill=" + Skill + ", noOfMatches="
				+ noOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality + ", pid="
				+ pid + ", teamId=" + teamId + "]";
	}
	
	

	
	
}
