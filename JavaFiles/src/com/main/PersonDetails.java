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
			System.out.println("Enter the name: ");
			name = sc.next();
			System.out.println("Enter the gender(Male/Female): ");
			gender = sc.next();
			System.out.println("Enter the age: ");
			age = sc.nextInt();
			myArray[i]  = new Person(name, age, gender);
		}

		System.out.println("List of Persons are: ");

		for(int i = 0; i < percount; i++)
		{
			myArray[i].printPerson();
		}
	}
}
