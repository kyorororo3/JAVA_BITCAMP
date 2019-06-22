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

import dto.Human;
import single.Singleton;

public class UpdateView extends Frame implements ActionListener, WindowListener {

		Button goMenuBtn, appendBtn;
		Label nameLabel;
		TextField nameTextField;
		
		
	public UpdateView() {
		
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
		
		appendBtn = new Button("수 정");
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
		Singleton single = Singleton.getInstance();
		System.out.println(nameTextField.getText());
		single.updateName = nameTextField.getText();
		if(btnLabel.equals("수 정")) {
			new UpdateView2();
			this.dispose();
		}
		else if(btnLabel.equals("메 뉴")) {
			new MenuView();
			this.dispose();
		}
	}

}
