package _03_Hangman;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Hangman {
public static void main(String[] args) {
	String randNum = JOptionPane.showInputDialog("Type any random number between 1 and 100");
	
	int random = Integer.parseInt(randNum);
	
	Stack <String> words = new Stack<>();
	
	for (int i = 0; i < random; i++) {
	
	words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		
		
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
