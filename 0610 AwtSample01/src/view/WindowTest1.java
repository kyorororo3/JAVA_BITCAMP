package view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest1 implements WindowListener {

	public WindowTest1() {
		Frame frame = new Frame();
		
		frame.setTitle("제목");
		frame.setSize(800,600);
		frame.setLocation(100,100);
		frame.setBackground(Color.GREEN);
		
		
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		//프레임에 적용한 것 
	}
	
	
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		//실제 내용과는 관련 없지만, 껐다가 켰을 때 사용되는 것 
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
	//윈도우 처리들에 필요한 것들이 오버라이드 된 것 
}
