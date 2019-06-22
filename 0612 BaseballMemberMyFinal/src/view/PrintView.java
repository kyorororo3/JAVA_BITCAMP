package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;
import java.util.List;

import dto.Human;
import single.Singleton;


public class PrintView extends Frame implements ActionListener, WindowListener {
	Singleton single = Singleton.getInstance();
	TextArea textArea;
	Button goMenu;
	List<Human> list;
	public PrintView() {
		setLayout(null);

		String str ="";
		textArea = new TextArea();
		textArea.setBounds(120, 120, 400, 200);
		list = single.dao.allDatas();
		for (int i = 0; i < list.size(); i++) {
			str = str+ "\n" +  list.get(i)+"";
		}
		textArea.setText(str);			
		add(textArea);
			
		goMenu = new Button("메 뉴");
		goMenu.setBounds(120,400,400,50);
		goMenu.addActionListener(this);
		add(goMenu);
		
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
		new MenuView();
		this.dispose();

	}

}
