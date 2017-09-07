package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList<String> BOOKS = new ArrayList<String>();

	int y = 0;

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {

		GuestBook GB = new GuestBook();
		GB.create();

	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();

	void create() {
		f.add(p);
		f.setSize(300, 100);
		f.setVisible(true);
		p.add(b);
		p.add(b2);
		b.setText("Add Name");
		b2.setText("View NAMES");
		b.addActionListener(this);
		b2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == b) {

			String s = JOptionPane.showInputDialog("Please enter a name.");
			BOOKS.add(s);

		}

		if (e.getSource() == b2) {
			for (int i = 0; i < BOOKS.size(); i++) {
				String s = BOOKS.get(i);
				System.out.println("Guest #" + (i + 1) + ": " + s);
			}
		}
	}

}

// When the add name button is clicked, display an input dialog that asks the
// user to enter a name. Add
// that name to an ArrayList. When the "View Names" button is clicked, display a
// message dialog that displays
// all the names added to the list. Format the list as follows:
// Guest #1: Bob Banders
// Guest #2: Sandy Summers
// Guest #3: Greg Ganders
// Guest #4: Donny Doners
