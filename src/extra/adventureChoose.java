package extra;

import javax.swing.JOptionPane;

public class adventureChoose {
public static void main(String[] args) {
	
	int choice1 = JOptionPane.showOptionDialog(null, "A gang is chasing you down an alley, what are you going to do", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Fight back", "Hide in a dumpster", "go in the building at the end" }, null);

if(choice1 == 2) {
	int choice1Path2 = JOptionPane.showOptionDialog(null, "The building is a dark and abandoned library and the gang is still after you", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "hide behind a bookshelf and call the police", "Give the gang your money like they asked", "Run out of the building" }, null);
	if(choice1Path2 == 0) {
		JOptionPane.showMessageDialog(null, "You made the dumb choice of calling the police, the gang heard you ringtone and you were instantly found and beaten up.");
	}
	if(choice1Path2 == 1) {
		JOptionPane.showMessageDialog(null, "You gave the gang your money and they let you free.");
	}
	if(choice1Path2 == 2) {
		JOptionPane.showMessageDialog(null, "You safely ran away fromn the gang because they eventually lost you. good job.");
	}
}
if(choice1 == 1) {
	JOptionPane.showMessageDialog(null, "3 days later : A corpse was found in dumpster by a local garbage man yesterday the victim recieved 14 stab wounds and 3 broken bones. " );
}

if(choice1 ==0) {
	int choice1Path0 = JOptionPane.showOptionDialog(null, "You attempeted to fight the gang, you would have lost but luckily a policeman on patrol walks by and sees the fight what will you say to convince the police that you are innocent", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "These attackers are obviouslly in a gang and started chasing me into this alley for my money.", "tell the police that they should leave you alone because you have a mental disorder",  }, null);

if(choice1Path0 == 0) {
	JOptionPane.showMessageDialog(null, "The violent gang has been jailed thanks to you " );
}
if(choice1Path0 == 1) {
	JOptionPane.showMessageDialog(null, "Enjoy your life in the assylum  " );
}
	
}


}
}

