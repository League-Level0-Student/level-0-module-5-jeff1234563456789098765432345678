package _01_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_Or_Not {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Give me a number");
		int number = Integer.parseInt(a);
		for (int i = 3; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println("number " + i + " is not Prime");

			} else {
				System.out.println("number " + i + " is Prime");

			}
		}
	}

}
