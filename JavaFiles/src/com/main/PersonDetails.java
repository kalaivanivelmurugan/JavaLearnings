package com.main;
import com.main.pojo.*;
import java.util.Scanner;

public class PersonDetails
{
	public static void main (String[] args) 
	{
		String name;
		int age;
		String gender;
		Scanner sc = new Scanner(System.in);
		int a=1;
		while(a<3)
		{
			System.out.println("Enter the Person details:");
			System.out.println("Enter name: ");
			name = sc.next();
			System.out.println("Enter gender(Male/Female): ");
			gender = sc.next();
			System.out.println("Enter age: ");
			age = sc.nextInt();
			Person unknown = new Person(name, age, gender);
			unknown.printPerson();
			a++;
		}
	}
}
