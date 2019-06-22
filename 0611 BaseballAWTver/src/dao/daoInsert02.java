package dao;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;

import javax.swing.JOptionPane;


import dto.Human;
import dto.Pitcher;
import menu.MenuUI;
import single.SingletonClass;


public class daoInsert02 extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	
	Button goMenu, insert;
	Label lName, lAge, lHeight, lWin, lLose, lDefense;
	TextField tName, tAge, tHeight, tWin, tLose, tDefense;
	
	public daoInsert02() {
		super("INSERT02");
		
		setLayout(null);
		
		lName = new Label("   이 름: ");
		
		lName.setBounds(60,80,100,20);
		lName.setBackground(Color.CYAN);
		add(lName);
		
		tName = new TextField("");
		tName.setBounds(220,80,360,20);
		add(tName);
		
		
		lAge = new Label("   나 이: ");
		
		lAge.setBounds(60,110,100,20);
		lAge.setBackground(Color.CYAN);
		add(lAge);
		
		tAge = new TextField("");
		tAge.setBounds(220,110,360,20);
		add(tAge);
		
		
		lHeight = new Label("   신 장: ");
		
		lHeight.setBounds(60,140,100,20);
		lHeight.setBackground(Color.CYAN);
		add(lHeight);
		
		tHeight = new TextField("");
		tHeight.setBounds(220,140,360,20);
		add(tHeight);
		
		
		lWin = new Label("        승: ");
		
		lWin.setBounds(60,170,100,20);
		lWin.setBackground(Color.CYAN);
		add(lWin);
		
		tWin = new TextField("");
		tWin.setBounds(220,170,360,20);
		add(tWin);
		
		
		lLose = new Label("        패: ");
		
		lLose.setBounds(60,200,100,20);
		lLose.setBackground(Color.CYAN);
		add(lLose);
		
		tLose = new TextField("");
		tLose.setBounds(220,200,360,20);
		add(tLose);
		
		
		lDefense = new Label("방어율: ");
		
		lDefense.setBounds(60,230,100,20);
		lDefense.setBackground(Color.CYAN);
		add(lDefense);
		
		tDefense = new TextField("");
		tDefense.setBounds(220,230,360,20);
		add(tDefense);
		
		
		
		
		
		
		
		goMenu = new Button("메 뉴");
		goMenu.setBounds(50,400,250,50);
		goMenu.addActionListener(this);
		add(goMenu);
		
		insert = new Button("추 가");
		insert.setBounds(338,400,250,50);
		insert.addActionListener(this);
		add(insert);
		
		
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
		String btnName = btn.getLabel();
		
		if(btnName.equals("추 가")) {
			String name = tName.getText();
			int age = Integer.parseInt(tAge.getText());
			double height = Double.parseDouble(tHeight.getText());
			int win =  Integer.parseInt(tWin.getText());
			int lose =  Integer.parseInt(tLose.getText());
			double defense = Double.parseDouble(tDefense.getText());
			
	
			Human p = new Pitcher(s.sequence, name, age, height, win, lose, defense);
			s.list.add(p);
			s.sequence++;
			
			JOptionPane.showMessageDialog(null, "선수 정보가 정상적으로 추가되었습니다.");
			new MenuUI();
			this.dispose();
			
			Iterator<Human> it = s.list.iterator();
			while(it.hasNext()) {
				Human h = it.next();
				System.out.println(h.toString());
			}
		}
		else if(btnName.equals("메 뉴")) {
			new MenuUI();
			this.dispose();
		}

	}

}
