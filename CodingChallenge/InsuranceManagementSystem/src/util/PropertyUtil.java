package util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	public static String getPropertyString(String fileName) {
		try {
		   Properties property = new Properties();
		   FileInputStream input = new FileInputStream(fileName);
		   property.load(input);
		   
		   String hostname = property.getProperty("hostname");
		   String dbname = property.getProperty("dbname");
		   String portnumber = property.getProperty("port");
		   String username = property.getProperty("username");
		   String password = property.getProperty("password");
		   
		   String conString = "jdbc:mysql://"+ hostname + ":" + portnumber + "/" + dbname +
				   			  "?user=" + username + "&password=" + password;
		   
		   return conString;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}
