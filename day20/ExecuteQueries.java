package com.cts.training;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueries {
public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException {
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/ctspune";
	Connection conn = DriverManager.getConnection(url, "root", "root");
	Statement stmt = conn.createStatement();
//String querry = "insert into Test values(2,'Abhay','CEO',49)";
//String querry = "insert into Test values(3,'Arao','programmer',46)";
//String querry="update test set age = 70 where id=2";
//String querry="delete from test where id=2";
	String querry="alter table test drop column age ";

ResultSet result = stmt.executeQuery(querry);
/*if(result>0) {
	System.out.println("Data Insertes Successfully");
}else {
	System.out.println("TRy Again");
}*/
}
}
