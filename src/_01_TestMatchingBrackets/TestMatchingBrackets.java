package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	 
    	Stack<String> matches = new Stack<String>();
    	
    	 for (int i = 0; i < b.length(); i++) {
    	
    		if (b.charAt(i)=='{') {
				matches.push("{");
			}
    		if (matches.size() > 0 && b.charAt(i)== '}') {
				matches.pop();
			}
	 }
       if (matches.size()==0) {
		return true;
	}
       else {
		return false;
	}	 
    	 
    }
}