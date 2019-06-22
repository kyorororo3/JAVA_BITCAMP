package dao;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import dto.Human;
import menu.MenuUI;
import single.SingletonClass;

public class daoUpdate01 extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	Button goMenu, button;
	
	Label lName;
	TextField tName;
	
	public daoUpdate01() {
		super("UPDATE01");
		
		setLayout(null);
		
		lName = new Label("   이 름: ");
		
		lName.setBounds(60,80,100,20);
		lName.setBackground(Color.CYAN);
		add(lName);
		
		tName = new TextField("");
		tName.setBounds(220,80,360,20);
		add(tName);
		
		goMenu = new Button("메 뉴");
		goMenu.setBounds(50,400,250,50);
		goMenu.addActionListener(this);
		add(goMenu);
		
		button = new Button("수 정");
		button.setBounds(338,400,250,50);
		button.addActionListener(this);
		add(button);
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.WHITE);
		setVisible(true);
		
		addWindowListener(this);
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
		Button btn = (Button)e.getSource();
		String btnName = btn.getLabel();
		s.updateName = tName.getText();
		if(btnName.equals("수 정")) {
			new daoUpdate02();
			this.dispose();
		}
		
		else if(btnName.equals("메 뉴")) {
			new MenuUI();
			this.dispose();

		}

	}

}
