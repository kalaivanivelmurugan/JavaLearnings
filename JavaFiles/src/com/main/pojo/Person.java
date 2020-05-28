package com.main.pojo;

public class Person
{
	static boolean isHavingBody = true;

	String name;
	int age;
	String gender;

	//Constructor doesn't contain a return type
	public Person(String p1, int p2, String p3)
	{
		this.name = p1;
		this.age = p2;
		this.gender = p3;
	}


	public void printPerson()
	{
		System.out.println(this.name + " " + this.age + " " + this.gender + " " + Person.isHavingBody);
	}
}
