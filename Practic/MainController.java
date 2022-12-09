package com.contactcontroller;

import java.util.Scanner;

import com.contactmodel.Main;

public class MainController {
          public static Main main=new Main();
          public static void main(String[] args) {
			
		
          boolean flag=true;
          while(flag) {
        	  System.out.println("Welcome to Contact App");
        	  System.out.println("For View Contact Enter V");
        	  System.out.println("For Save Contact Enter S");
        	  System.out.println("For Delet Contact Enter D");
        	  System.out.println("For Edit Contact Enter E ");
        	  System.out.println("For Close The Application Enter C");
        	  
        	  Scanner sc=new Scanner(System.in);
        	  char input =sc.next().charAt(0);
        	  
        	  switch (input) {
			case 'V': 
				System.out.println("\t All Saved Contact Are Here \n");
				main.viewContact(main.list);
				break;
			
			case 'S':
				System.out.println("\t To Saved Contact Enter Details given bellow \n");
				main.saveContact();
				break;
				
			case 'D':
				System.out.println("\t To Delet Contact Enter Details Given Bellow \n");
				main.deletContact(main.list);
				break;
				
			case 'E':
				System.out.println("\t To Edit Contact Enter Details Given Bellow \n");
				main.editContact(main.list);
				break;
				
			case 'C':
				System.out.println(" Your Application is Close");
				sc.close();
				flag=false;
				break;
					
			default:
				System.out.println("Wrong Input");
				break;
			}
        	  
        	  
        	  
        	  
        	  
        	  
        	  
          }
}
}