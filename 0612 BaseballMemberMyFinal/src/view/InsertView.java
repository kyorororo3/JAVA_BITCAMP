package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class InsertView extends Frame implements ActionListener, WindowListener {

	//pitcherBtn
	
	//batterBtn
	
	Button pitcherBtn, batterBtn;
	public InsertView() {
		super("INSERT01");
		
		setLayout(null);
		
		pitcherBtn = new Button("투 수");
		pitcherBtn.setBounds(120,180,400,50);
		pitcherBtn.addActionListener(this);
		add(pitcherBtn);
		
		batterBtn = new Button("타 자");
		batterBtn.setBounds(120,240,400,50);
		batterBtn.addActionListener(this);
		add(batterBtn);
		
		
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
		String clsName = btn.getLabel();
		
		
		if(clsName.equals("투 수")) {
			new PitcherInsert();
			this.dispose();
		}
		else if (clsName.equals("타 자")) {
			new BatterInsert();
			this.dispose();
			
		}

	}

}
