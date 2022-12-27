package com.ExceptionHandlingSerializatin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class SetProperties {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\Set.properties");
			
			Properties properties = new Properties();
			
			properties.setProperty("url", "www.facebook.com");
			
			properties.save(fos,  "URL IS >> ");
			
			System.out.println("Saved...");
			
			
		}catch(FileNotFoundException e) {
			// TODO Auto-generatd cath block
			e.printStackTrace();
		}
	}
}
