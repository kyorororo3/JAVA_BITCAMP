package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SubWindow extends Frame implements WindowListener, ActionListener {

	
	public SubWindow() {
		super("SubWindow");
		
		setLayout(null);
		
		Button btn = new Button("back");
		btn.setBounds(100, 100, 100, 50);
		btn.addActionListener(this);
		add(btn);
		
		setBounds(100, 100, 800, 600);
		setBackground(Color.YELLOW);
		setVisible(false);
		
		addWindowListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Singleton s = Singleton.getInstance();
		s.fwin.setVisible(true);
		s.swin.setVisible(false);

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

}
