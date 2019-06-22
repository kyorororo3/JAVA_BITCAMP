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

import dto.Batter;
import dto.Human;
import menu.MenuUI;
import single.SingletonClass;

public class daoInsert03 extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	Button goMenu, insert;
	Label lName, lAge, lHeight, lBat, lHit, lHitAvg;
	TextField tName, tAge, tHeight, tBat, tHit, tHitAvg;
	
	public daoInsert03() {
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
		
		
		lBat = new Label("        볼: ");
		
		lBat.setBounds(60,170,100,20);
		lBat.setBackground(Color.CYAN);
		add(lBat);
		
		tBat = new TextField("");
		tBat.setBounds(220,170,360,20);
		add(tBat);
		
		
		lHit = new Label("    안타: ");
		
		lHit.setBounds(60,200,100,20);
		lHit.setBackground(Color.CYAN);
		add(lHit);
		
		tHit = new TextField("");
		tHit.setBounds(220,200,360,20);
		add(tHit);
		
		
		lHitAvg = new Label("안타율: ");
		
		lHitAvg.setBounds(60,230,100,20);
		lHitAvg.setBackground(Color.CYAN);
		add(lHitAvg);
		
		tHitAvg = new TextField("");
		tHitAvg.setBounds(220,230,360,20);
		add(tHitAvg);
		
		
		
		
		
		
		
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
			int bat =  Integer.parseInt(tBat.getText());
			int hit =  Integer.parseInt(tHit.getText());
			double hitAvg = Double.parseDouble(tHitAvg.getText());
			
	
			Human b = new Batter(s.sequence+1000, name, age, height, bat, hit, hitAvg);
			s.list.add(b);
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
