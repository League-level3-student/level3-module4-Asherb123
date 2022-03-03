package _00_IntroToStacks;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     
     JFrame 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
String s = new String(); 
void setup() {
	panel.add(label);
	frame.add(panel);
	panel.setPreferredSize(new Dimension(500, 50));
	frame.pack();
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	

}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	char keycode = e.getKeyChar();
	
	if (e.getKeyCode()==8) {
		
		String backspace = s.substring(s.length()-1);
		 String shorty = s.substring(0, s.length()-1 );
		Stack<String> deleted = new Stack<String>();
		 deleted.push(backspace);
		 s= shorty;
		 label.setText(s);
	}
	else {
		s+=keycode;
		label.setText(s);
		
	}
frame.pack();
}	
	



//frame.pack();
private void Array() {
	// TODO Auto-generated method stub
	
}






@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
	
	_02_TextUndoRedo c = new _02_TextUndoRedo();
	
	c.setup();
	
}
}
