ackage com.main;
import com.main.pojo.*;
import java.util.Scanner;

public class PersonDetails
{
	public static void main(String[] args)
	
	{	String name;
		int age;
		String gender;
		Scanner sc= new Scanner(System.in); 
		// Person jega = new Person("Jegathees",23,"Male");
		// Person kalai = new Person("Kalaivani",26,"Female");
		// jega.printPerson()
		// kalai.printPerson();
		//Person.print();

		System.out.println("Enter the Person details:");
		System.out.print("Enter name: ");
		name= sc.nextLine();
		System.out.print("Enter gender(Male/Female): ");
		gender=sc.next();
		System.out.print("Enter age: ");
		age= sc.nextInt();
		Person unknown = new Person(name,age,gender);
		unknown.printPerson();
	}
}