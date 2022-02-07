package assignmentproject;

import java.util.Scanner;

public class ArrayofstringEmail {

	public static void main(String[] args) {
		Boolean flag = false;
		String emails[] = new String[5];
		emails[0] = "Nitishtiwari10@gmail.com";
		emails[1] = "Nitish56@gmail.com";
		emails[2] = "Vivekkumar67@gmail.com";
		emails[3] = "vishalsingh77@gmail.com";
		emails[4] = "anupyadav@gmail.com";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email: ");
		String userEmail = sc.next();
		
		for(String email:emails)
		{
			if(userEmail.matches(email))
			{
				System.out.println("This is correct Id Welcome "+userEmail);
				flag=true;
				break;
			}
		}
		if (flag==false);
		{
			System.out.println("Invalid User");
		}

	}



    }


