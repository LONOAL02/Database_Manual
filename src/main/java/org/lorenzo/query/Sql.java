package org.lorenzo.query;

import org.lorenzo.conection.Conection;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Sql {

    String user="";
    String password="";

    Conection c;

    public Sql(Conection c){
        this.c=c;
    }

    public void test(){
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select max(sofifaid) from player");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean login(String user, String password){
        boolean found= false;
        boolean logged = false;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select * from users");
            ResultSet rs = st.getResultSet();
            String dbPassword= "";
            while (rs.next() && !found) {
                if (rs.getString("username").equals(user)){
                    found=true;
                    dbPassword=rs.getString("password");
                }
            }
            if (found==true&&dbPassword.equals(password)){
                    logged=true;
                    this.user=user;
                    this.password=password;
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return logged;
    }

    public void signIn(String user, String password){
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("insert into users (username, password) values ('"+user+"','"+password+"')");
            JOptionPane.showMessageDialog(null, "USER CREATED SUCCESSFULLY");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "INVALID CREDENTIALS");
        }
    }

    public boolean superUser(){
      boolean supersu=false;
        try {
            Statement st= c.getConnection().createStatement();
            st.execute("select admin from users where username = '"+user+"'");
            ResultSet rs = st.getResultSet();
            rs.next();
            boolean result= rs.getBoolean(1);
            if (result){
                supersu=true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return supersu;
    }

    public int getTeamId(String name){
        int id=0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select club_team_id from team where club_name='"+name+"'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                id= rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }
    public int getNationId(String name){
        int id=0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select nation_id from nation where nation_name='"+name+"'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                id= rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }
    public int getLeagueId(String name){
        int id=0;
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select league_id from league where league_name='"+name+"'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                id= rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }
    public String getTeamName(int id){
        String name="";
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select club_name from team where club_team_id='"+id+"'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                name= rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return name;
    }
    public String getNationName(int id){
        String name="";
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select nation_name from nation where nation_id='"+id+"'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                name= rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return name;
    }
    public String getLeagueName(int id){
        String name="";
        try {
            Statement st = c.getConnection().createStatement();
            st.execute("select league_name from league where league_id='"+id+"'");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                name= rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return name;
    }

}
