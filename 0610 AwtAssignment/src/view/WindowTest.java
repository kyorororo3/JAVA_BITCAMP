package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener, ActionListener {

	
	Button plusButton, minusButton, resetButton;
	Label label;
	int number = 0;
	
	
	public WindowTest() {
		super("number setting");
		
		setLayout(null);
		setSize(640,480);
		setLocation(0,0);
		setVisible(true);
		
		addWindowListener(this);
		
		label = new Label();
		label.setText("Please press the button");
		label.setBounds(10, 30, 620, 70);
		label.setBackground(new Color(200,0,100));
		add(label);
		
		plusButton = new Button("+");
		plusButton.setBounds(10,150,310,100);
		plusButton.addActionListener(this);
		add(plusButton);
		
		minusButton = new Button("-");
		minusButton.setBounds(320,150, 310, 100);
		minusButton.addActionListener(this);
		add(minusButton);
		
		resetButton = new Button("reset");
		resetButton.setBounds(10, 300, 620, 100);
		resetButton.addActionListener(this);
		add(resetButton);
		
	}
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Button btn = (Button) e.getSource();
		String btnName = btn.getLabel();
		
		
		label.setText(number + "");
		
	
		if(btnName.equals("+")) {
			number = number +1;
			System.out.println(number);
			String str = number + "";
			label.setText(str);
		}
		else if(btnName.equals("-")) {
			if(number == 0) {
				label.setText("0");
				return;
			}
			
			else{
				number = number -1;
				String str = number + "";
				label.setText(str);
		
			}
		}
		else if(btnName.equals("reset")) {
			number = 0;
			label.setText(number + "");
		
		
		}
		
		
	}

}
