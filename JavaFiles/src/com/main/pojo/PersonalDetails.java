//Program to print the Name, Gender and Age of a person

    
    import java.util.Scanner; //Scanner class is used to get the input from the user
    public class PersonalDetails
    {
        public static void main(String args[]) throws Exception
        {
            String Name, Gender;
            int Age;
            float Weight;
            
            Scanner SC = new Scanner(System.in); //Input via keyboard

            System.out.print("Enter name: ");
            Name=SC.nextLine();

            System.out.print("Enter gender(Male/Female): ");
            Gender=SC.next();

            System.out.print("Enter age: ");
            Age=SC.nextInt();

            System.out.print("Enter weight: ");
            Weight=SC.nextFloat();

            System.out.println("Name: " + Name);
            System.out.println("Gender: " + Gender);
           System.out.println("Age: " + Age);
           System.out.println("Weight:" + Weight);



        }
    }