package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	HashMap<Integer, String> searcher = new HashMap<Integer, String>();

	public static void main(String[] args) {
		LogSearch Search = new LogSearch();
		Search.Create();
	}

	void Create() {
		f.setVisible(true);
		f.setSize(160, 160);
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		b1.setText("Add Entry");
		b2.setText("Find Entry");
		b3.setText("Show All Entries");
		b4.setText("Remove Entry");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. XX
	 * Create a GUI with three buttons.DONE
	 * 
	 * Button 1: Add Entry When this button is clicked, use an input dialog to ask
	 * the user to enter an ID number. After an ID is entered, use another input
	 * dialog to ask the user to enter a name. Add this information as a new entry
	 * to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(b1)) {
			String Number = JOptionPane.showInputDialog("Add ID Number!");
			int num = Integer.parseInt(Number);
			String Name = JOptionPane.showInputDialog("Add Name!");
			searcher.put(num, Name);
		}
		if (e.getSource().equals(b2)) {
			String FindNumber = JOptionPane.showInputDialog("Find an ID!");
			int num2 = Integer.parseInt(FindNumber);
			if (searcher.keySet().contains(num2)) {
				JOptionPane.showMessageDialog(null, searcher.get(num2));
			} else {
				JOptionPane.showMessageDialog(null, "That ID doesn't exist!");
			}
		}
		if (e.getSource().equals(b3)) {
			String printer = "";
			for (Integer i : searcher.keySet()) {
				printer+=("ID: " + i + " Name: " + searcher.get(i)+ "\n");
			}
			JOptionPane.showMessageDialog(null, printer);

		}
		if (e.getSource().equals(b4)) {
			String KillNumber = JOptionPane.showInputDialog("Remove an ID!");
			int numkilla = Integer.parseInt(KillNumber);
			if (searcher.keySet().contains(numkilla)) {
				searcher.remove(numkilla);
			} else {
				JOptionPane.showMessageDialog(null, "This ID doesn't exist!");
			}
		}

	}
}
