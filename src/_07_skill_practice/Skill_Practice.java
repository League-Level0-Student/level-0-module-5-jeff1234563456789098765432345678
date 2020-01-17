package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_Practice {
	public static void main(String[] args) {

		Skill_Practice skills = new Skill_Practice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String a = JOptionPane.showInputDialog("How many dimes to you have?");




// Tell them how many cents they have (hint multiply by 10)
int b = Integer.parseInt(a);
if (b <100) {
	 b =  b * 10;
	 JOptionPane.showMessageDialog(null,"You have " + b + " cents");
}


// Ask the user how tall they are (inches)

String c = JOptionPane.showInputDialog("How tall are you in inches?");

int d = Integer.parseInt(c);

// If they are shorter than 36 inches, tell them to eat their Wheaties
if (d < 36) {
	JOptionPane.showMessageDialog(null, "eat your wheaties");
}



}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 31; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
Random Random=nextInt();
nextInt();
// Get another random number that is less than 10 and print it to the console

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction

	}

	private Random nextInt() {
		// TODO Auto-generated method stub
		return null;
	}

	void skill4() { // In a pop-up, ask the user for the city they live in

// If they answered "San Diego", tell them they live in America's Finest City

// Otherwise, tell them to move to San Diego

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."

// If there is 1 car, use a pop-up to display the make/model of the car

// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.

	}
}
