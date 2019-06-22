package dao;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;

import javax.swing.JTextArea;

import dto.Human;
import menu.MenuUI;
import single.SingletonClass;

public class daoAllPrint extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	TextArea textArea;
	Button goMenu;
	public daoAllPrint() {
		super("ALLPRINT");
		
		setLayout(null);
		
		textArea = new TextArea();
		
		textArea.setBounds(120, 120, 400, 200);
		
		Iterator<Human> it = s.list.iterator();
		String str = "";
		while(it.hasNext()) {
			Human h = it.next();
			str = str + h.toString()+"\n";
			textArea.setText(str);
		}
		add(textArea);
			
		goMenu = new Button("메 뉴");
		goMenu.setBounds(120,400,400,50);
		goMenu.addActionListener(this);
		add(goMenu);
		
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
		
		// TODO Auto-generated method stub

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
		
			new MenuUI();
			this.dispose();

	}



}
