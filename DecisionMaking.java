package mycaptain;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age;
        System.out.println("Enter your age: ");
        Scanner sc =new Scanner(System.in);
        age = sc.nextInt();
        if(age>18)
        	System.out.println("You are eligible for vote.");
        else
        	System.out.println("You arenot eligible for vote.");
	}

}
