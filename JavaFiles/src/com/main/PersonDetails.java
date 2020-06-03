package com.main;
import com.main.pojo.*;
import java.util.Scanner;
import java.util.Arrays;

public class PersonDetails
{
	public static void main (String[] args)
	{
		String name;
		int age;
		String gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of persons count:");
       		int percount = sc.nextInt();
		Person[] myArray = new Person[percount];
		for (int i = 0; i < percount; i++)
		{
			System.out.println("Enter the Person details:");
			do
			{
				System.out.println("Enter the name: ");
				name = sc.next();
				if((name.length() < 1 ||  name.length() > 15 || name.contains("@")))
				{
					System.out.println("Invalid Name. Name lenght should be greater than one or less than 15\n Re-Enter:\n");
				}
			}while((name.length() < 1 ||  name.length() > 15 || name.contains("@")));
		      
		       	do
	         	{
		
			System.out.println("Enter the gender(Male/Female):");
			gender = sc.next();
			   if ((!(gender.equals("Male"))||(gender.equals("Female"))))
	         	{
                                System.out.println("Enter the proper gender details..\n Re-Enter:\n");
                        }
			}while((!(gender.equals("Male"))||(gender.equals("Female"))));

			do
			{
			       System.out.println("Enter the age:");
                               age = sc.nextInt();
			       if((age<=0) || (age>=100))
			       {
				System.out.println("Invalid age.. Enter the age between 1 to 99\n Re-enter:\n");
			        }
			}while((age<=0)||(age>=100));
			
		        myArray[i]  = new Person(name, age, gender);
		}
		System.out.println("List of Persons are:");
		for(int i = 0; i < percount; i++)
		{
			myArray[i].printPerson();
		}
	}
}



