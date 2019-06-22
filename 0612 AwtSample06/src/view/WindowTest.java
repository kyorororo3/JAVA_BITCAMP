package view;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener, ItemListener {

	
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	Label label1, label2;
	public WindowTest() {
		super("radio");
		/*
		  AWT : Radio가 없어서 -> CheckBox 사용
		  swing : JRadioButton 
		  사용법은 같으나, 객체가 완전히 다르다.
		  
		  AWT의 경우 이미지를 깔면 뒤에 하얗게 된다.
		  swing의 경우 투명하여 깔끔하게 사용하는 것이 가능
		  
		 */
		setLayout(null);
		
		CheckboxGroup cbg1 = new CheckboxGroup();	//1~3
		CheckboxGroup cbg2 = new CheckboxGroup();	//4,5
		
		//Group 1
						//자신이 하고 싶은 항목 	상태(선택되어있느냐없느냐)
		cb1 = new Checkbox("Java", true, cbg1);
		cb1.setBounds(100,100,100,20);
		cb2 = new Checkbox("C language", false, cbg1);
		cb2.setBounds(100,130,100,20);
		cb3 = new Checkbox("Python", false, cbg1);
		cb3.setBounds(100,160,100,20);
		
		
		//Group 2
		cb4 = new Checkbox("Oracle", true, cbg2);
		cb4.setBounds(250, 100, 100, 20);
		cb5 = new Checkbox("MYSQL", false, cbg2);
		cb5.setBounds(250, 130, 100, 20);
		
		//check box
		cb6 = new Checkbox("exit");
		cb6.setBounds(100, 250, 100, 20);
		
		label1 = new Label("label");
		label1.setBounds(100, 200, 150, 30);
		
		label2 = new Label("label");
		label2.setBounds(250, 200, 150, 30);
		
		add(cb1);

		add(cb2);

		add(cb3);

		add(cb4);

		add(cb5);
		
		add(cb6);
			
		add(label1);
		add(label2);
			
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		//이런건 객체의 배열로 처리하면 된다 
		setBounds(0,0,640,480);
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
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		Checkbox cb =(Checkbox)obj;
//		if(cb.getState()){
//			String labelName = cb.getLabel();	
//			if(labelName.equals("Java") || labelName.equals("C language") || labelName.equals("Python")){
//				label1.setText(cb.getLabel());
//			}
//			else if (labelName.equals("Oracle")||labelName.equals("MY-SQL")) {
//				label2.setText(cb.getLabel());
//			}
//		}
//		
		if(cb == cb1 || cb == cb2 || cb == cb3) {
			label1.setText(cb.getLabel());
		}
		else if(cb == cb4 || cb == cb5) {
			label2.setText(cb.getLabel());
		}
		else if (cb == cb6) {
			System.exit(0);
		}
	}

}
