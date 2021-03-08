package com.ltts.model;

public class Team {

		private String teamName;
		private String teamOwner;
		private int teamId;
		private String teamCaption;
		
		
		
		public Team() {
			super();
		}
		public Team(String teamName, String teamOwner, int teamId, String teamCaption) {
			super();
			this.teamName = teamName;
			this.teamOwner = teamOwner;
			this.teamId = teamId;
			this.teamCaption = teamCaption;
		}
		public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		public String getTeamOwner() {
			return teamOwner;
		}
		public void setTeamOwner(String teamOwner) {
			this.teamOwner = teamOwner;
		}
		public int getTeamId() {
			return teamId;
		}
		public void setTeamId(int teamId) {
			this.teamId = teamId;
		}
		public String getTeamCaption() {
			return teamCaption;
		}
		public void setTeamCaption(String teamCaption) {
			this.teamCaption = teamCaption;
		}
		@Override
		public String toString() {
			return "Team [teamName=" + teamName + ", teamOwner=" + teamOwner + ", teamId=" + teamId + ", teamCaption="
					+ teamCaption + "]";
		}
	
	
}
