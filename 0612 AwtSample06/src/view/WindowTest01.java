package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class WindowTest01 extends JFrame implements ActionListener{

	
	//JRadioButton rb1, rb2, rb3;
	JRadioButton[] radioB = new JRadioButton[4];
	ButtonGroup group;
	
	
	public WindowTest01() {
		super("JRADIOBUTTON");
		
		setLayout(null);

		group = new ButtonGroup();
		
		/*
		rb1 = new JRadioButton("Java");
		rb1.setSelected(true);
		rb1.addActionListener(this);
		rb1.setBounds(100, 100, 100, 30);
		add(rb1);
		*/
		
		
		String title[] = {"Java", "C language", "Python"};
		for (int i = 0; i < radioB.length; i++) {
			radioB[i] = new JRadioButton(title[i]);
			radioB[i].setSelected(true);
			radioB[i].addActionListener(this);
			radioB[i].setBounds(100, 100 + (50*i), 100, 30);
			add(radioB[i]);	// view 윈도우에다가 띄워주기 위한 것
			
			group.add(radioB[i]); // process 판단용

		}
		//더 간단히 사용하기 위해선 함수 매개변수와 리턴값을  -- 잘하기 위해선 함수를 잘 짜야함
		
		
		
		
		setBounds(0,0,640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	/*	
		if(radioB[0].isSelected()) {
			JOptionPane.showMessageDialog(null, "java");
		}
		
		else if(radioB[1].isSelected()) {
			JOptionPane.showMessageDialog(null, "C language");
		}
		*/
		//추가할 때 같이 추가해줘야하지
		
		
		Enumeration<AbstractButton> enums = group.getElements();
		
		while (enums.hasMoreElements()) {
			AbstractButton abn = (AbstractButton) enums.nextElement();
			JRadioButton rb = (JRadioButton)abn;
			if(rb.isSelected()) {
				JOptionPane.showMessageDialog(null, rb.getText());
			}
			//버튼 그룹이 묶어진 것
			//위의 배열의 번지수를 정하는 부분만 수정 가능 
			//MAP하고 비슷한 느낌
			// 추가할 때 없어서 못쓰거나 그러지 못함
		}
	}
}
