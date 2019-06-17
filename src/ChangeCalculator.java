//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
double numberN = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("how many dimes do you have");
		double numberD = Integer.parseInt(dimes);
// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("how many quarters do you have");
		double numberQ =  Integer.parseInt(quarters);
		
	
		// Calculate how much money the user has and save it in a double variable 
		double money=0.0;	
		money= numberN/20+ numberD/10 + numberQ/4;
		// Tell the user how much money they have
	JOptionPane.showMessageDialog(null, money);
	}
}

