package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		super("layout");
		//정적인 영역으로 만들어진 레이아웃 화면상의 크기상으로 맞춰주는 레이아웃 
		
		
		//Layout
		//setLayout(new FlowLayout());
		//sample01.02에 따로 레이아웃을 안한건, 기본으로 레이아웃이 설정되기 때문이다
		// setLayout(new GridLayout(3,1)); //row cols  --> 행과 열로 되어 있는 것 
		//web의 레이아웃과 제일 비슷한 레이아웃 크기에 따라서 줄어들고 커지고 하기 때문에 웹에 제일 적합하다 
		setLayout(null); // 레이아웃을 안쓰고자 할 경우, 레이블, 버튼, 텍스트필드 등 모두 위치와 크기를 정해줘야 한다 
		// 우리는 공부하는 동안 널값으로 쓰자 
		
		
		// Label
		Label label = new Label("label");
		label.setBounds(100, 100, 150, 30); // 정적인 상태, 창의 크기를 바꿔도 크기가 바뀌지 않음 해상도에 따라 바뀌어야하는데 바뀌지 않는 것이 문제
		label.setBackground(new Color(255, 0, 0)); // 안드로이드에서는 이 레이아웃을 씀 
		add(label);
		//add는 frame에 추가되는 것
		
		
		// Button
		Button button = new Button();
		button.setBounds(100, 200, 200, 100);
		button.setLabel("button");
		add(button);
		
		
		// TextField
		TextField textField = new TextField();
		textField.setBounds(100, 350, 150, 50);
		add(textField);
		
		
		
		setSize(640,480);
		setLocation(0,0);
		setVisible(true);  //윈도우를 하나는 보여주고 하나를 안보여줄 때 사용하는 것 윈도우를 계속 생성하는 경우와 하나씩 켜주는 스타일, 경우에 따라 다르게 설정할 수 있다.
		addWindowListener(this);
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}
