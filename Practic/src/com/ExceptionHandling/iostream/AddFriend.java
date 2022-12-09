package com.ExceptionHandling.iostream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

public class AddFriend {

	public static void main(String[] data) {
		try {
			
			
			// Get the name of the contact to be updated 
			// form the Command line argument 
			String newName = data[0];
			
			// get the number to be updated from the command line argument 
			long newNumber = Long.parseLong(data[1]);
			
			String nameNumberString ; 
			String name;
			long number; 
			int index;
			
			// Using file pointer creating the file. 
			File file  = new File("FriendsContact.txt");
			if(!file.exists()) {
				// Creat a new file if not exists. 
				file.createNewFile();
			}
			
			// Opening file in reading and write mode.
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			boolean found = false;
			
			// Checking Wheter the name of contact already exists.
			// getFilePointer() give the current offset value
			// file start of the file. 
			while (raf.getFilePointer() < raf.length()) {
				
				// reading line from the file.
				nameNumberString = raf.readLine();
				
				// splitting the string t get name and number 
				String [] lineSplit = nameNumberString.split("!");
				
				// separating name and number 
				name = lineSplit[0]; 
				number = Long.parseLong(lineSplit[1]);
				
				// if conditionto find existence of record. 
				if(name == newName || number == newNumber) {
					found = true;
					break;
				}
			}
			
			if(found == false) {
				
				// Enter the if block when record is not already present in the file. 
				
				nameNumberString  = newName + "!" + String.valueOf(newNumber);
				
				// writeBytes functin to write a string as a sequence of bytes
				raf.writeBytes(nameNumberString);
				
				// To inser the next record in new line. 
				raf.writeBytes(System.lineSeparator());
				
				// Print the message
				System.out.println("Friend added . >> ");
				
				// Closing teh resources 
				raf.close();
			}
			// The contact to be updated could not be foudn 
			else {
				
				// clsing teh resources. 
				raf.close();
				
				// Print the message
				System.out.println(" Input name " + " Does not exists.");
			}
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
		catch(NumberFormatException nef) {
			System.out.println(nef);
		}
	}
}
