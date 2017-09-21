package IntroToStacks;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	String x = "";
	JLabel L = new JLabel();
	Stack<Character> C = new Stack<Character>();

	public static void main(String[] args) {

		TextUndoRedo Text = new TextUndoRedo();
		Text.create();

	}

	void create() {
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.addKeyListener(this);
		p.add(L);
		f.setSize(200, 200);
	}
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last
	 * character is erased from the JLabel. Save that deleted charsfdfsfacter
	 * onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is
	 * pressed, the top Character is popped off the Stack and added back to the
	 * JLabel.
	 * 
	 */

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String s2 = L.getText();
			char h = s2.charAt(s2.length() - 1);
			String s3 = s2.substring(0, s2.length() - 1);
			C.push(h);
			L.setText(s3);
			System.out.println(L.getText());
			x = s3;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			char pop = C.pop();
			L.setText("" +L.getText() + pop);
		} else {
			x += (e.getKeyChar());
			L.setText(x);
		}

		f.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
