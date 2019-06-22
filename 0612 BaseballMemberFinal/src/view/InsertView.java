package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InsertView extends Frame implements ActionListener, WindowListener {

	//Pitcher
	
	//Batter
	
	Button pitcherBtn, batterBtn;
	public InsertView() {
	
		setLayout(null);
		
		
		pitcherBtn = new Button("Pitcher append");
		pitcherBtn.setBounds(50, 100, 100, 30);
		pitcherBtn.addActionListener(this);
		add(pitcherBtn);
		
		
		setBounds(0, 0, 500, 700);
		setVisible(true);
		setBackground(Color.black);
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
		Object obj = e.getSource();
		if(obj == pitcherBtn) {
			new PitcherInsert();
			this.dispose();
		}

	}

}
