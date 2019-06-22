package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrontWindow extends Frame implements WindowListener, ActionListener {

	
	
	public FrontWindow() {
		super("front window");
		
		
		setLayout(null);
		
		Button btn = new Button("move");
		btn.setBounds(100, 100, 100, 50);
		btn.addActionListener(this);
		add(btn);
		
		setSize(640,480);
		setLocation(100,100);
		setBackground(Color.MAGENTA);
		setVisible(false);
		
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
		// TODO Auto-generated method stub
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
		Singleton s = Singleton.getInstance();
		s.fwin.setVisible(false);
		s.swin.setVisible(true);
		
		// 윈도우 위치를 바꿔서 끄면 그 실행위치로 저장되어버린다. 그래서 초기화를 해줘야함 

	}

}
