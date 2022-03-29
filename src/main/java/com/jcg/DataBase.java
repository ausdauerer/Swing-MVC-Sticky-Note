package com.jcg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {
    Connection c;
    public DataBase(){
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase","user1", "abcd");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
    public long saveNote(Model note){
        String SQLinsert = "insert into note(text) "+ "VALUES(?);";
        long id = 0;
        try{
            PreparedStatement pstmt = c.prepareStatement(SQLinsert, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, note.getText());
            int rowsAffected = pstmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        System.out.print("Successfully inserted data into table"+String.valueOf(id));
        return id;
    }
    public String getLatestNote(){
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select text from note where id=(select max(id) from note);");	      
            while(rs.next()){
                return(rs.getString("text"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } 
        return("");
    }
}
