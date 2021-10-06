/*
Mahfuzul Islam Chowdhury
ID:2012020111
Section:C
E-mail:cse_2012020111@lus.ac.bd
Date of submission:16 July 2021
 */
package mahfuz;
 import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter your section: ");
	 section = input.nextLine();
        System.out.println("Section: "+ section);

	 Info info = new Info();
        System.out.println("Name: "+info.name);
        System.out.println("ID: "+info.id);
	 Hobby hobby = new Hobby();
        System.out.println("Hobby: "+hobby.hobbyName);



    }
}
