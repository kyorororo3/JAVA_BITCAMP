package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.EventHandler;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener {

	Scanner scan = new Scanner(System.in);
	
	Button button, restart;
	Label label;
	TextField textField;
	int r_num, result; 
	
	
	public WindowTest() {
		super("random number game");
		setLayout(null);
		setSize(640,480);
		setLocation(0,0);
		setVisible(true);
		addWindowListener(this);
		
		//random number
		r_num = (int)((Math.random())*80)+20;
		System.out.println(r_num);
		//textField
		textField = new TextField("");
		textField.setBounds(20, 40, 600, 70);
		add(textField);
		
		//label
		label = new Label("Please input the number(1~10)");
		label.setBounds(20, 120, 600, 70);
		label.setBackground(Color.YELLOW);
		add(label);
		
		//Button
		button = new Button("button");
		button.setBounds(20, 240, 600, 70);
		button.addActionListener(this);
		add(button);
		
		//restart
		
		restart = new Button("restart");
		restart.setBounds(20, 350, 600, 70);
		restart.addActionListener(this);
		add(restart);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

	
		
		Button btn = (Button) e.getSource();
		String btnName = btn.getLabel();
		if(btnName.equals("button")) {
			String userInput = textField.getText();
			int u_num = Integer.parseInt(userInput);
			if(u_num>10) {
				JOptionPane.showMessageDialog(null, "You input wrongly. pls input properly!!(1~10)");
				return;
			}
			r_num = r_num - u_num;
			System.out.println(r_num);
			if(r_num>0) {
				label.setText("You still can challenge! pls input");
			}
			else {
				JOptionPane.showMessageDialog(null, "Game over gg");
			}
		}
		
		else if(btnName.equals("restart")) {
			r_num = (int)((Math.random())*80)+20;
		}
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



}
