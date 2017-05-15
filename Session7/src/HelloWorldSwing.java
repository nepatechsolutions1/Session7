import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldSwing {

	public static void main(String[] args) {
		createAndShowGui();
	}
	
	private static void createAndShowGui() {
		JFrame mainFrame = new JFrame("Hello World");
	
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Welcom to Java Swing");
		mainFrame.getContentPane().add(label);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
		
	}

}
