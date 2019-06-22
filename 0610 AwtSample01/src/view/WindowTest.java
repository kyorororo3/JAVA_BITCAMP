package view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {
//listener 계속해서 켜져 있도록 대기하는 존재 들어왔니 들어왔니  끄겠다는 버튼눌렀어도 안되었던게 리스너가 없어서 그랬던것이었다.
	public WindowTest() {
		super("간단한 예제");
	
		setTitle("여기는 제목"); // super에 있는 것 무시됨 super는 비워둬도 상관 없음
		setSize(640, 480);	//화면의 폭과 높이
		setLocation(0,0);	//화면의 위치
		//x는 +일수록 오른쪽으로 늘어나고 y는 +일수록 아래로 내려감
		setBackground(new Color(255,0,0));
		setVisible(true);	//시각화 
		
		addWindowListener(this); //윈도우리스너를 넣은 클래스를 넣어달라 그래서 여기라 
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 프로그램 끄는 애
		System.exit(0); //강제종료 자바 코드 
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
