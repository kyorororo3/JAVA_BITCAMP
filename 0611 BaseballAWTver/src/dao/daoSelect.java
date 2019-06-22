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
import java.util.Iterator;

import javax.swing.JOptionPane;

import dto.Human;
import menu.MenuUI;
import single.SingletonClass;

public class daoSelect extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	Button goMenu, button;
	
	Label lName;
	TextField tName;
	
	public daoSelect() {
		super("SELECT");
		
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
		
		button = new Button("검 색");
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
	
		if(btnName.equals("검 색")) {
			String name = tName.getText();
			
			int findIndex = -1;
			for(int i = 0; i<s.list.size(); i++) {
				Human h = s.list.get(i);
				if(h.getName().equals(name)) {
					findIndex = i;
					break;
				}
			}
			Human h = s.list.get(findIndex);
			
			JOptionPane.showMessageDialog(null, h.toString());
			new MenuUI();
			this.dispose();
			
		}
		
		else if(btnName.equals("메 뉴")) {
			new MenuUI();
			this.dispose();

		}
	}

}
