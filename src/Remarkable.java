import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String answer;
		answer = JOptionPane.showInputDialog("What is your name?");
	if(answer.equalsIgnoreCase("Pranav")){
	JOptionPane.showMessageDialog(null, "You have black hair.");
	}
	else if(answer.equalsIgnoreCase("Ryan")){
		JOptionPane.showMessageDialog(null, "You have brown hair.");
	}
	else if(answer.equalsIgnoreCase("Phillip")){
		JOptionPane.showMessageDialog(null, "You have black hair.");
	}
	else if(answer.equalsIgnoreCase("Max")){
		JOptionPane.showMessageDialog(null, "You have black hair.");
	}
	else if(answer.equalsIgnoreCase("Kyle")){
		JOptionPane.showMessageDialog(null, "You have black hair.");
	}
	else if(answer.equalsIgnoreCase("Jackie")){
		JOptionPane.showMessageDialog(null, "You have blonde hair.");
	}	
	else {
	JOptionPane.showMessageDialog(null, "I don't know who you are :( !");
	}
	}
	}
	
