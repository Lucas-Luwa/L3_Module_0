package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		Stack<Double> x = new Stack<Double>();
		// Don't forget to import the Stack class
		// done
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			Double z = new Random().nextDouble() * 100;
			x.push(z);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String i = JOptionPane.showInputDialog("Please Input a # higher than 0 but less than 100.");
		int a = Integer.parseInt(i);
		String i2 = JOptionPane.showInputDialog("Please Input another # higher than 0 but less than 100.");
		int b = Integer.parseInt(i2);

		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		for (int e = 0; e < 100; e++) {
			Double p = x.pop();
			if (p >= a && p <= b) {
				System.out.println(p);
			}
		}
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
