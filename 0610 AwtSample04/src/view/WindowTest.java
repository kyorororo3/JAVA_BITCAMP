package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener {
																	//버튼에 대한 리스너
	Label label;
	Button button1, button2 ;
	
	
	public WindowTest() {
		super("버튼");
		
		setLayout(null);
		
		label = new Label();
		label.setText("button");
		label.setBounds(10, 60, 620, 30);
		label.setBackground(new Color(0, 255, 0));
		add(label);
		
		button1 = new Button("button1");
		button1.setBounds(50,120,100,50);
		button1.addActionListener(this);
		add(button1);// button을 사용할 때 리스너가 있어야 함
		
		
		
		
		button2 = new Button("button2");
		button2.setBounds(200,120,100,50);
		button2.addActionListener(this);
		add(button2);
		
		setSize(640,480);
		setLocation(0,0);
		setVisible(true);
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
		// TODO Auto-generated method stub
	//	JOptionPane.showMessageDialog(null, "버튼 클릭!");
		Button btn = (Button) e.getSource();
		String btnName = btn.getLabel();
		
		if(btnName.equals("button1")) {
		//	JOptionPane.showMessageDialog(null, "1번 버튼 클릭!");
			label.setText("1번 버튼 클릭!");
		}
		else if(btnName.equals("button2")){
		//	JOptionPane.showMessageDialog(null, "2번 버튼 클릭!");
			label.setText("2번 버튼 클릭!");
			
		}
	}

}
