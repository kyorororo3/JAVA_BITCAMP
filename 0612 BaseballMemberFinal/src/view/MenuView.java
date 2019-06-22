package view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuView extends Frame implements WindowListener, ActionListener {

	//insert
	//delete
	//select
	//update
	//allprint
	
	Button insertBtn;
	
	public MenuView() {
		super("메뉴");
		
		setLayout(null);
		
		insertBtn = new Button("insert");
		insertBtn.setBounds(50, 50, 200, 30);
		insertBtn.addActionListener(this);
		add(insertBtn);
		
		
		setBounds(0, 0, 500, 700);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == insertBtn) {
			new InsertView();
			this.dispose();
		}
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

}
