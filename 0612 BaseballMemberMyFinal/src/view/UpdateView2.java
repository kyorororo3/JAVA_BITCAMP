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
import dto.Human;
import dto.Pitcher;
import single.Singleton;

public class UpdateView2 extends Frame implements ActionListener, WindowListener {

		Singleton single = Singleton.getInstance();
		Button goMenuBtn, updateBtn;
	
		UpdateView getInfo;
		String updateName;
		Human human;
		Label lWin, lLose, lDefense, lBat, lHit, lHitAvg;
		TextField tWin, tLose, tDefense, tBat, tHit, tHitAvg;
		
		
	public UpdateView2() {
		
		setLayout(null);
			
//		getInfo = new UpdateView();
//		single.updateName = getInfo.nameTextField.getText();
		
		human = single.dao.select(single.updateName);
		
			
			if(human instanceof Pitcher) {
				Pitcher p = (Pitcher) human;
				
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
			else if(human instanceof Batter){
				Batter b = (Batter)human;
				
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
			
			
		
		goMenuBtn = new Button("메 뉴");
		goMenuBtn.setBounds(50,400,250,50);
		goMenuBtn.addActionListener(this);
		add(goMenuBtn);
		
		updateBtn = new Button("수 정");
		updateBtn.setBounds(338,400,250,50);
		updateBtn.addActionListener(this);
		add(updateBtn);
		
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

		if(btnLabel.equals("수 정")) {
			if(tWin.getText().equals("")
					||tLose.getText().equals("")
					||tDefense.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "빈칸을 채워주십시오.");
			}
			
			if(human instanceof Pitcher) {
				Pitcher Pit = new Pitcher();
			
				int win = Integer.parseInt(tWin.getText());
				int lose = Integer.parseInt(tLose.getText());
				double defense = Double.parseDouble(tDefense.getText());
				
				Pit.setWin(win);
				Pit.setLose(lose);
				Pit.setDefence(defense);
				
				
				single.dao.update(human,Pit);
				JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
			}
			else if(human instanceof Batter) {
				if(tBat.getText().equals("")
						||tHit.getText().equals("")
						||tHitAvg.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "빈칸을 채워주십시오.");
				}
				Batter Bat = new Batter();
				int bat = Integer.parseInt(tWin.getText());
				int hit = Integer.parseInt(tLose.getText());
				double hitAvg = Double.parseDouble(tDefense.getText());
				
				Bat.setBat(bat);
				Bat.setHit(hit);
				Bat.setHitAvg(hitAvg);
				
				
				single.dao.update(human,Bat);
				JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
			}
			
			
			
		}
		else if(btnLabel.equals("메 뉴")) {
			new MenuView();
			this.dispose();
		}
	}

}
