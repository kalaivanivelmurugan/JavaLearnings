import java.io.*;
public class Persons
{
	static boolean isHavingBody = true;
	String name;
	int age;
	String gender;

	//Constructor
	Persons(String p1, int p2, String p3)
	{
		this.name = p1;
		this.age = p2;
		this.gender = p3;
	}

	static void print()
	{
		System.out.println(Persons.isHavingBody);
	}

	void printPerson()
	{
		System.out.println(this.name + " " + this.age + " " + this.gender + " " + Persons.isHavingBody);

	}

	public static void main(String[] args)
	{
		Persons jega = new Persons("Jegathees",23,"Male");
		Persons kalai = new Persons("Kalaivani",26,"Female");

		jega.printPerson();
		kalai.printPerson();
		System.out.println(Persons.isHavingBody);
	}
}

