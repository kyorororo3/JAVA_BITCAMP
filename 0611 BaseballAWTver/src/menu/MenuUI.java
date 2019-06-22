package menu;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import dao.daoAllPrint;
import dao.daoDelete;
import dao.daoInsert01;
import dao.daoSelect;
import dao.daoUpdate01;
import dto.Batter;
import dto.Pitcher;
import file.FileClass;
import single.SingletonClass;


public class MenuUI extends Frame implements ActionListener, WindowListener, MouseMotionListener {

	SingletonClass s = SingletonClass.getInstance();
	Button button;
	int posX, posY;
	Label label;
	FileClass myfile;
	
	public MenuUI(){
		super("MENU");
		
		setLayout(null);

		
			
		button = new Button("선수 추가");
		button.setBounds(120,60,400,50);
		button.addActionListener(this);
		add(button);
		
		button= new Button("선수 삭제");
		button.setBounds(120,120,400,50);
		button.addActionListener(this);
		add(button);
		
		button = new Button("선수 검색");
		button.setBounds(120,180,400,50);
		button.addActionListener(this);
		add(button);
		
		button = new Button("선수 수정");
		button.setBounds(120,240,400,50);
		button.addActionListener(this);
		add(button);
		
		button = new Button("모두 출력");
		button.setBounds(120,300,400,50);
		button.addActionListener(this);
		add(button);
		
		button = new Button("파일 저장");
		button.setBounds(120,360,400,50);
		button.addActionListener(this);
		add(button);
		
		button = new Button("프로그램 종료");
		button.setBounds(120,420,400,50);
		button.addActionListener(this);
		add(button);
		
		
		addMouseMotionListener(this);
		
		label = new Label();
		setBounds(300,420,50,50);
		add(label);
		
		
		setBounds(0, 0, 640, 510);
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
		// TODO Auto-generated method stub
		Button btn = (Button)e.getSource();
		String clsName = btn.getLabel();
		
		switch(clsName) {
		case "선수 추가" :
			new daoInsert01();
			this.dispose();
			
			break;
		case "선수 삭제" :
			new daoDelete();
			this.dispose();
			
			break;
			
		case "선수 검색" :
			new daoSelect();
			this.dispose();
			
			break;
			
		case "선수 수정" :
			new daoUpdate01();
			this.dispose();
			
			break;
			
		case "모두 출력" :
			new daoAllPrint();
			this.dispose();
			
			break;	
		
		case "파일 저장" :
			new daoUpdate01();
			this.dispose();
			
			break;
			
		}
		
		
		
		
		
		
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		  
	    posX = e.getX();
	    posY = e.getY();
	    
	    label.setText("x = " + posX + " y = " + posY);
	    label.setBounds(posX,posY, 200, 50);
	}
	public void loadData() {
		
		myfile = new FileClass();
		if(myfile != null) {
			JOptionPane.showMessageDialog(null, "선수 정보를 정상적으로 불러왔습니다.");
		}

		
		String datas[] = myfile.readFile();
	
		for (int i = 0; i < datas.length; i++) {
			String str = datas[i];				//1001-김일-28-167.5-4-6-2.5
			String data[] = str.split("-");     //1001 김일 28 167.5 4 6 2.5
												//번호    이름  나이 키      승 패 방어율
			int number = Integer.parseInt(data[0]); //투수인지 타자인지 알아보기 위한 방법
			if(number <2000) { //투수
				Pitcher p = new Pitcher(number, 
										data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]));
				s.list.add(p);
			}
			else {			   //타자
				Batter b = new Batter(number, 						//	번호
									  data[1], 						//  이름
									  Integer.parseInt(data[2]), 	//  나이
									  Double.parseDouble(data[3]), 	// 	키
									  Integer.parseInt(data[4]), 	//  승
									  Integer.parseInt(data[5]),    //  패
									  Double.parseDouble(data[6])); //  방어율
				s.list.add(b);
			}
		}
	this.dispose();}
}
