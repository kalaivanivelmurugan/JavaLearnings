package com.main;
import com.main.pojo.*;

public class PersonDetails
{
	public static void main(String[] args)
	{
		Person jega = new Person("Jegathees",23,"Male");
		Person kalai = new Person("Kalaivani",26,"Female");

		jega.printPerson();
		kalai.printPerson();

		//Person.print();
	}
}


/*
TAsk 1:
Enter the persion 1 details:
Name:
Jegathees
Age:
23
Task 2:
Enter the no of persons
2
Enter the persion 1 details:
Name:
Jegathees
Age:
23
Gender:
Male
Enter the persion 2 details:
Name:
Kalai
Age:
26
Gender:
Female
Jegathess 23 Male
kalu 26 Female
 */