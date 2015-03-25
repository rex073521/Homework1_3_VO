package com.example.rex.homework1_3;

/**
 * Created by REX on 2015/3/25.
 */
public class Team {
    private int teamID;
    private String teamName;
    private int logo;

    Team(){

    }

    Team(int teamID,int logo,String teamName){
        this.setTeamID(teamID);
        this.setLogo(logo);
        this.setTeamName(teamName);
    }


    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
