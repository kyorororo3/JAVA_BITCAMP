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

import dto.Batter;
import dto.Pitcher;
import single.Singleton;

public class BatterInsert extends Frame implements ActionListener, WindowListener {

	

	Label label[] = new Label[6];
	TextField textField[] = new TextField[6];
	
	Button goMenuBtn, appendBtn;
	
	//nameField
	public BatterInsert() {
	
		setLayout(null);
		
		String columns[] = {"이름 :", "나이 :", "신장 :","볼 :","안타 :","안타율 :"};
	
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(columns[i]);
			label[i].setBounds(60,80+(30*i),100,20);;
			add(label[i]);
		}
		
		
		for (int i = 0; i < textField.length; i++) {
			textField[i] = new TextField();
			textField[i].setBounds(220,80+(30*i),360,20);
			add(textField[i]);
		}
		
		goMenuBtn = new Button("메 뉴");
		goMenuBtn.setBounds(50,400,250,50);
		goMenuBtn.addActionListener(this);
		add(goMenuBtn);
		
		appendBtn = new Button("추 가");
		appendBtn.setBounds(338,400,250,50);
		appendBtn.addActionListener(this);
		add(appendBtn);
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.WHITE);
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
		Button btn = (Button)e.getSource();
		String btnLabel = btn.getLabel();
		
		if(btnLabel.equals("추 가")) {
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
		int bat = Integer.parseInt(textField[3].getText());
		int hit = Integer.parseInt(textField[4].getText());
		double hitAvg = Double.parseDouble(textField[5].getText());
		
		Batter b = new Batter(0, name, age, height, bat, hit, hitAvg);
		
		Singleton single = Singleton.getInstance();
		single.dao.insert(b);
		JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
		
		
		//textField 초기화
		for (int i = 0; i < textField.length; i++) {
			textField[i].setText("");
		}
		
		
		single.dao.allprint();
		
		}
		else if(btnLabel.equals("메 뉴")) {
			new MenuView();
			this.dispose();
		}

	}

}
