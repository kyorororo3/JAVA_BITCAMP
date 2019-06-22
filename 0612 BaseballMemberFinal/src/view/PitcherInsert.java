package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import dto.Pitcher;
import single.Singleton;

public class PitcherInsert extends Frame implements ActionListener, WindowListener {

	//투수 입력 
	//메뉴 
	
	
	Label label[] = new Label[6];
	TextField textField[] = new TextField[6];
	//초기화가 안될경우 JTextField로 할 것 
	Button appendBtn;
	
	//nameField
	public PitcherInsert() {
	
		setLayout(null);
		
		String columns[] = {"name", "age", "height","win","lose","defense"};
	
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(columns[i]);
			label[i].setBounds(50, 100 +(30*i), 80, 30);
			add(label[i]);
		}
		
		
		for (int i = 0; i < textField.length; i++) {
			textField[i] = new TextField();
			textField[i].setBounds(130, 100 +(30*i), 150, 30);
			add(textField[i]);
		}
		
		appendBtn = new Button("Member Append");
		appendBtn.setBounds(50, 400, 100, 40);
		appendBtn.addActionListener(this);
		add(appendBtn);
		
		setBounds(0, 0, 500, 700);
		setVisible(true);
		setBackground(Color.yellow);
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
		Button b = (Button)e.getSource();
		String btnLabel = b.getLabel();
		
		if(btnLabel.equals("Member Append")) {
		//	JOptionPane.showMessageDialog(null, "클릭");

			if(textField[0].getText().equals("")
					||textField[1].getText().equals("")
					||textField[2].getText().equals("")
					||textField[3].getText().equals("")
					||textField[4].getText().equals("")
					||textField[5].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "빈칸을 채워주십시오.");
			}
			
		String name = textField[0].getText();
		int age = Integer.parseInt(textField[1].getText());
		double height = Double.parseDouble(textField[2].getText());
		int win = Integer.parseInt(textField[3].getText());
		int lose = Integer.parseInt(textField[4].getText());
		double defense = Double.parseDouble(textField[5].getText());
		
		Pitcher p = new Pitcher(0, name, age, height, win, lose, defense);
		
		Singleton single = Singleton.getInstance();
		single.dao.insert(p);
		JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
		
		
		//textField 초기화
		for (int i = 0; i < textField.length; i++) {
			textField[i].setText("");
		}
		
		
		single.dao.allprint();
		
		}

	}

}
