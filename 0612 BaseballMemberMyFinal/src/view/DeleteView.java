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

import single.Singleton;

public class DeleteView extends Frame implements ActionListener, WindowListener {

		Button goMenuBtn, appendBtn;
		Label nameLabel;
		TextField nameTextField;
		
	public DeleteView() {
		
		setLayout(null);
		
		nameLabel = new Label("   이 름: ");
		
		nameLabel.setBounds(60,80,100,20);
		nameLabel.setBackground(Color.CYAN);
		add(nameLabel);
		
		nameTextField = new TextField("");
		nameTextField.setBounds(220,80,360,20);
		add(nameTextField);
		
		
		
		goMenuBtn = new Button("메 뉴");
		goMenuBtn.setBounds(50,400,250,50);
		goMenuBtn.addActionListener(this);
		add(goMenuBtn);
		
		appendBtn = new Button("삭 제");
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
	public void actionPerformed(ActionEvent arg0) {
		Button btn = (Button)arg0.getSource();
		String btnLabel = btn.getLabel();

		if(btnLabel.equals("삭 제")) {
			//	JOptionPane.showMessageDialog(null, "클릭");

			if(nameTextField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "빈칸을 채워주십시오.");
			}
			
			Singleton single = Singleton.getInstance();
			boolean tf = single.dao.delete(nameTextField.getText());
				if(tf) {
				JOptionPane.showMessageDialog(null, "성공적으로 삭제되었습니다.");
				}
				JOptionPane.showMessageDialog(null, "잘못된 정보를 입력받았습니다.");
		}
		else if(btnLabel.equals("메 뉴")) {
			new MenuView();
			this.dispose();
		}
	}

}
