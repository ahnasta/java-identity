import java.util.Scanner;

public class Identity{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Identity Program ====");
        System.out.print("Enter Full Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter School Name: ");
        String school = input.nextLine();

        System.out.print("Enter Hobby: ");
        String hobby = input.nextLine();
    
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        System.out.println("==== Identity Result ====");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + "y.o");
        System.out.println("School : " + school );
        System.out.println("Hobby : " + hobby);
        System.out.println("Height : " + height +"cm" );

        input.close();
    }
}