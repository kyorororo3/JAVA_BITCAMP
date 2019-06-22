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
		setBackground(Color.green);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new FrontWindow();
		
	//	System.exit(0); // 굉장히 강력한 함수 화끈하게 다 지워버리는 존재 그래서 새 창이 나오기도 전에 프로그램을 아예 다 꺼버
		this.dispose(); // 현재창을 닫아라 하는 것 
		

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
