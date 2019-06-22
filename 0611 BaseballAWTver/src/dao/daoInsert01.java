package dao;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import dto.Batter;
import dto.Pitcher;
import file.FileClass;
import single.SingletonClass;

public class daoInsert01 extends Frame implements WindowListener, ActionListener {

	
	Button Pitcher, Batter;
	
	
	public daoInsert01() {
		super("INSERT01");
		
		setLayout(null);
		
		Pitcher = new Button("투 수");
		Pitcher.setBounds(120,180,400,50);
		Pitcher.addActionListener(this);
		add(Pitcher);
		
		Batter = new Button("타 자");
		Batter.setBounds(120,240,400,50);
		Batter.addActionListener(this);
		add(Batter);
		
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.WHITE);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Button btn = (Button)arg0.getSource();
		String clsName = btn.getLabel();
		
		
		if(clsName.equals("투 수")) {
			new daoInsert02();
			this.dispose();
		}
		else if (clsName.equals("타 자")) {
			new daoInsert03();
			this.dispose();
			
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
