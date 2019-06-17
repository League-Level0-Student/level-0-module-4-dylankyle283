import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("what was your test score?");
double grade = Double.parseDouble(score);

if(grade >= 90) JOptionPane.showMessageDialog(null, "you did great");;








}
}
