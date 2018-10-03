import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	int microTime = 0;
	Microwave jazz = new Microwave();
	String popcornFlavor = JOptionPane.showInputDialog("What flavor do you want you popcorn to be?");
	String microwaveTime = JOptionPane.showInputDialog("How long do you want the microwave to go for?");
	Popcorn pop = new Popcorn(popcornFlavor);
	microTime = Integer.parseInt(microwaveTime);
	
	
	jazz.setTime(microTime);
	jazz.putInMicrowave(pop);
	jazz.startMicrowave();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
