import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConverter {
	
	private JLabel unitsLabel;
	private JButton convertButton;
	private JTextField userInput;

	public static void main(String[] args) {
		
		TemperatureConverter myConverter = new TemperatureConverter();
		myConverter.initComponents();

	}
	
	private void initComponents() {
		JFrame jFrame = new JFrame("Temperature Conveter");
		jFrame.setSize(500, 500);
		
		FlowLayout myLayout = new FlowLayout();
		jFrame.setLayout(myLayout);
		
		unitsLabel = new JLabel("C");
		convertButton = new JButton("Convert");
		convertButton.addActionListener(new ConvertButtonAction());
		
		userInput = new JTextField();
		userInput.setText("Enter text");
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jFrame.getContentPane().add(userInput);
		jFrame.getContentPane().add(unitsLabel);
		jFrame.getContentPane().add(convertButton);
		
		jFrame.pack();
		jFrame.setVisible(true);
	}
	
	private class ConvertButtonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double temp = Double.parseDouble(userInput.getText());
			//multiply by 1.8 (or 9/5) and add 32.
			double farhenheit = ( temp * 1.8 ) + 32;
			userInput.setText(Double.toString(farhenheit));
			unitsLabel.setText("F");
		}
		
	}

}
