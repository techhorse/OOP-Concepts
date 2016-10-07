import java.util.Scanner;
class Person {
     
    // Instance variables (data or "state")
    String name;
    int age;
     
     
    // Classes can contain
     
    // 1. Data
    // 2. Subroutines (methods)
}
 
 
public class Hello {
 
    public static void main(String[] args) {
         
         Scanner sc=new Scanner(System.in);
        // Create a Person object using the Person class
        Person person1 = new Person();  
        System.out.println("Enter the name of 1st person");
        person1.name = sc.nextLine();
        System.out.println("Enter the age of 1st person");
        person1.age = sc.nextInt();
         
        // Create a second Person object
        Person person2 = new Person();
        System.out.println("Enter the name of 2nd person");
        person2.name = sc.next();
        
        System.out.println("Enter the age of 2nd person");
        person2.age = sc.nextInt();
         
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
         
    }
 
}