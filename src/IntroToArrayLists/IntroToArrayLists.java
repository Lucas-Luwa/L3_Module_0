package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		ArrayList<String> trolls = new ArrayList<String>();
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		trolls.add("Gerald");
		trolls.add("Billy");
		trolls.add("Bob");
		trolls.add("Joe");
		trolls.add("Doofus");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < trolls.size(); i++) {
			String s = trolls.get(i);
			System.out.println(s);
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : trolls) {
			System.out.println(s);
		}
		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.
		for (int y = 0; y < trolls.size(); y++) {

			if (y % 2 == 0) {
				String s = trolls.get(y);
				System.out.println(s);

			} else {

			}
		}
		// 6. Print all the Strings in reverse order.
		for (int x = 5; x > trolls.size(); x--) {
			String s = trolls.get(x);
			System.out.println("String at element " + x + " " + s);
		}

		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println("   ");
		for (int i = 0; i < trolls.size(); i++) {
			String s = trolls.get(i);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}

	}
}
