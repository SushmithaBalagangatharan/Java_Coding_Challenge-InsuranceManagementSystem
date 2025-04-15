package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
     static Connection connection = null;
     public static Connection getConnection() {
    	 try {
    		 String filePath = "src/resources/database.properties";
    		 String conString = PropertyUtil.getPropertyString(filePath);
    		 
    		 if(conString == null) {
    			 System.out.println("Connection String is null");
    			 return null;
    		 }
    		 
    		 if(connection == null) {
    			 connection = DriverManager.getConnection(conString);
    		 }
    		 
    		 return connection;
    	 }
    	 catch(Exception e) {
    		 System.out.println("ERROR: Connection failed");
    		 return null;
    	 }
		
     }
}
