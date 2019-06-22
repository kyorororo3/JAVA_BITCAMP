package view;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements ActionListener, WindowListener {

	Choice choice;
	Label label;
	
	
	public WindowTest() {
		super("choice");
		
		/*
		 
		 AWT - choice
		 swing - JComboBox
		 web -select option
		 
		 
		 Action이 붙는 건
		 특정 부분을 이벤트를 했을 때 사용하는 것
		 Action에 포함되는 존재 :button ios(mac), checkbox
		 버튼의 경우 굉장히 빠른시간에 눌러도 중간에 텀이 있다.
		
		 이벤트가 발생했을 때 value값을 취득해오는 것
		 
		 Value Change - slider(볼륨조절기)같은 느낌 실시간으로 변하는 것이 있음
		 --> 이 경우 실시간  list, slider, choice
		 
		 */
		
		setLayout(null);
		
		choice = new Choice();
		choice.setBounds(100, 100, 150, 30);
		choice.add("사과");
		choice.add("오렌지");
		choice.add("포도");
		choice.add("배");
		choice.add("귤");
		
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//JOptionPane.showMessageDialog(null, "choice 선택");
				String indexName = choice.getSelectedItem();
				label.setText(indexName);
			}
			
		});
		
		add(choice);
		
		label = new Label("---"); // 고르지 않았다.
		label.setBounds(100, 200, 150, 30);
		add(label);
		
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		addWindowListener(this);
		//Action - > ActionListener,  valueChange ->ItemListener
		
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
