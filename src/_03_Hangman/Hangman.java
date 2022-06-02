package _03_Hangman;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel Dscore = new JLabel();
	Stack<String> words = new Stack<>();
	String popped = "";

	void setup() {
		panel.add(label);
		panel.add(Dscore);
		panel.setPreferredSize(new Dimension(500, 250));
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);

		Dscore.setText(""+score);
		
		String randNum = JOptionPane.showInputDialog("Type any random number between 1 and 100");

		int random = Integer.parseInt(randNum);

		for (int i = 0; i < random; i++) {

			String randword = Utilities.readRandomLineFromFile("dictionary.txt");

			if (words.contains(randword)) {
				random = random + 1;
			} else {
				words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			}

		}
		restart();
	}

	void restart() {
		
		popped=words.pop();
		int wordlength = popped.length();
		String underscore = "";
		for (int i = 0; i < wordlength; i++) {
			underscore = underscore + "_";
		}
		label.setText(underscore);
		score = 10;
		frame.pack();
	}
int score = 10;
	


void score(char input) {
		
		
		
		char[] letters = label.getText().toCharArray();
		
		boolean letter = false;

		for (int i = 0; i < popped.length(); i++) {
			if (popped.charAt(i) == input) {
				letters[i] = input;
				letter = true;
			}
		}
		
		if (!letter) {
			score=score-1;
		} 
		
		
		
		String newText = new String(letters);
		label.setText(newText);
		frame.pack();
	if (score <= 0) {
				JOptionPane.showMessageDialog(null, "you suck");
				restart();
			}
		Dscore.setText(""+score);
}


	public static void main(String[] args) {
		Hangman c = new Hangman();

		c.setup();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char input = e.getKeyChar();
		score(input);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
