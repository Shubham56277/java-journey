package basics;

import java.util.*;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nYour name is " + name);
        System.out.println("Your age is " + age);

        sc.close();
    }
}
