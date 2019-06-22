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

import javax.swing.JOptionPane;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import menu.MenuUI;
import single.SingletonClass;

public class daoUpdate02 extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	
	Label lName, lAge, lHeight, lWin, lLose, lDefense, lBat, lHit, lHitAvg;
	TextField tName, tAge, tHeight, tWin, tLose, tDefense, tBat, tHit, tHitAvg;
	Human human;
	Pitcher p;
	Batter b;
	Button goMenu, insert;
	
	public daoUpdate02() {
		super("UPDATE02");
		
		setLayout(null);
		
		human = s.search(s.updateName);
		
		if(human instanceof Pitcher) {
		p = (Pitcher)human;
		lWin = new Label("        승: ");
		
		lWin.setBounds(60,170,100,20);
		lWin.setBackground(Color.CYAN);
		add(lWin);
		
		tWin = new TextField();
		tWin.setText("기존 정보: "+ p.getWin()+"");
		tWin.setBounds(220,170,360,20);
		add(tWin);
		
		System.out.println(p.getWin()+"");
		lLose = new Label("        패: ");
		
		lLose.setBounds(60,200,100,20);
		lLose.setBackground(Color.CYAN);
		add(lLose);
		
		tLose = new TextField();
		tLose.setText("기존 정보: "+ p.getLose()+"");
		tLose.setBounds(220,200,360,20);
		add(tLose);
		
		
		lDefense = new Label("방어율: ");
		
		lDefense.setBounds(60,230,100,20);
		lDefense.setBackground(Color.CYAN);
		add(lDefense);
		
		tDefense = new TextField();
		tDefense.setText("기존 정보: "+ p.getDefence()+"");
		tDefense.setBounds(220,230,360,20);
		add(tDefense);
		
		}
		else {
			b = (Batter)human;
			lBat = new Label("        볼: ");
			
			lBat.setBounds(60,170,100,20);
			lBat.setBackground(Color.CYAN);
			add(lBat);
			
			tBat = new TextField();
			tBat.setText("기존 정보: "+ b.getBat()+"");
			tBat.setBounds(220,170,360,20);
			add(tBat);
			
			
			lHit = new Label("    안타: ");
			
			lHit.setBounds(60,200,100,20);
			lHit.setBackground(Color.CYAN);
			add(lHit);
			
			tHit = new TextField();
			tHit.setText("기존 정보: "+ b.getHit()+"");
			tHit.setBounds(220,200,360,20);
			add(tHit);
			
			
			lHitAvg = new Label("안타율: ");
			
			lHitAvg.setBounds(60,230,100,20);
			lHitAvg.setBackground(Color.CYAN);
			add(lHitAvg);
			
			tHitAvg = new TextField();
			tHitAvg.setText("기존 정보: "+ b.getHitAvg()+"");
			tHitAvg.setBounds(220,230,360,20);
			add(tHitAvg);
			
		}
		
		
		goMenu = new Button("메 뉴");
		goMenu.setBounds(50,400,250,50);
		goMenu.addActionListener(this);
		add(goMenu);
		
		insert = new Button("수 정");
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
		
		if(btnName.equals("수 정")) {
			if(human instanceof Pitcher) {
				int win = Integer.parseInt(tWin.getText());
				int lose = Integer.parseInt(tLose.getText());
				double defense = Double.parseDouble(tDefense.getText());
				
				p.setWin(win);
				p.setLose(lose);
				p.setDefence(defense);
				
				int findIndex = s.list.indexOf(p);
				s.list.set(findIndex, p);
				JOptionPane.showMessageDialog(null, "선수 정보가 정상적으로 수정되었습니다.");
				new MenuUI();
				this.dispose();
			}
			else {
				int bat = Integer.parseInt(tBat.getText());
				int hit = Integer.parseInt(tHit.getText());
				double hitAvg = Double.parseDouble(tHitAvg.getText());
				
				b.setBat(bat);
				b.setHit(hit);
				b.setHitAvg(hitAvg);
				
				int findIndex = s.list.indexOf(b);
				s.list.set(findIndex, b);
				JOptionPane.showMessageDialog(null, "선수 정보가 정상적으로 수정되었습니다.");
				new MenuUI();
				this.dispose();
			}
		}
		
		else if(btnName.equals("메 뉴")) {
			new MenuUI();
			this.dispose();
		}
	}

}
