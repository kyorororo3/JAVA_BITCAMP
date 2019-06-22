package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
//import java.awt.Frame;
//swing과 별반 차이 없는 awt의 frame
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowTest extends JFrame {

	
	public WindowTest() {
		super("swing");
		

		//Frame == 기본 도화지
		
		
		
		setLayout(new GridLayout(2,1));
		
		JLabel label = new JLabel("label");
		add(label); //Frame에 올림
		
		//Panel == 추가 도화지인건가 도화지 위에 다른 도화지 영역
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setLayout(new GridLayout(1,2));
		add(panel);
		
		JLabel label1 = new JLabel("label1");
		panel.add(label1);
		
		JButton button = new JButton("button");
		
		panel.add(button);
		
		
		setSize(640,480);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //javax extra version 이라는 x
		//스윙의 경우 이 걸로  창을 종료할 수 있다
		//Frame은 독자적으로 사용할 수 있지만, Panel의 경우 Frame과 함께 써야함
		
	}
	
	
}
