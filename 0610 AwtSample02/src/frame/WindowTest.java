package frame;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		super("제목");
		
	//	setSize(640,480);
	//	setLocation(0,0);
		
		this.setBounds(0, 0, 640, 480);
		//this가 생략되어 있는 것. this = frame
		setVisible(true); //시각화이기 때문에 반드시 집어넣어야한다.
		addWindowListener(this);
		
		//label(레이블)
		Label label = new Label("여기가 Label입니다.");
		String str = "AWT입니다.";
		label.setText(str);
		add(label); //윈도우에 추가된다는 것 한글은 깨질 예정 이거 세팅하는 것을  -Dfile.encoding=MS949
		
		System.out.println("WindowTest의 생성자 실행");
		//콘솔은 디버깅을해주는 역할에 쓰임
		
		JOptionPane.showMessageDialog(null, "메시지박스 실행");
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

}
