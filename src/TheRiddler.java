import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		String answer;
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		answer = JOptionPane.showInputDialog(null, "Mary's father has 5 daughters – Nana, Nene, Nini, Nono. What is the fifth daughters name?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("Mary")) {
 score = 1;
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong.");
	JOptionPane.showMessageDialog(null, "The answer was Mary.");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You have a score of " + score);
	}
	
}

