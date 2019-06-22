package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import single.Singleton;


public class MenuView extends Frame implements WindowListener, ActionListener {

	//insert
	//delete
	//select
	//update
	//allprint
	
	Button insertBtn, deleteBtn, selectBtn, updateBtn, printBtn, saveBtn, exitBtn;
	Singleton single = Singleton.getInstance();
	
	public MenuView() {
		super("메뉴");
		
		setLayout(null);
		
		
		insertBtn = new Button("선수 추가");
		insertBtn.setBounds(120,60,400,50);
		insertBtn.addActionListener(this);
		add(insertBtn);
		
		deleteBtn = new Button("선수 삭제");
		deleteBtn.setBounds(120,120,400,50);
		deleteBtn.addActionListener(this);
		add(deleteBtn);
		
		selectBtn = new Button("선수 검색");
		selectBtn.setBounds(120,180,400,50);
		selectBtn.addActionListener(this);
		add(selectBtn);
		
		updateBtn = new Button("선수 수정");
		updateBtn.setBounds(120,240,400,50);
		updateBtn.addActionListener(this);
		add(updateBtn);
		
		printBtn = new Button("모두 출력");
		printBtn.setBounds(120,300,400,50);
		printBtn.addActionListener(this);
		add(printBtn);
		
		saveBtn = new Button("파일 저장");
		saveBtn.setBounds(120,360,400,50);
		saveBtn.addActionListener(this);
		add(saveBtn);
		
		exitBtn = new Button("프로그램 종료");
		exitBtn.setBounds(120,420,400,50);
		exitBtn.addActionListener(this);
		add(exitBtn);
		
//		label = new Label();
//		setBounds(300,420,50,50);
//		add(label);
//		
		
		setBounds(0, 0, 640, 510);
		setBackground(Color.WHITE);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		String clsName = btn.getLabel();
		
		switch(clsName) {
		case "선수 추가" :
			new InsertView();
			this.dispose();
			
			break;
		case "선수 삭제" :
			new DeleteView();
			this.dispose();
			
			break;
			
		case "선수 검색" :
			new SelectView();
			this.dispose();
			
			break;
			
		case "선수 수정" :
			new UpdateView();
			this.dispose();
			
			break;
			
		case "모두 출력" :
			new PrintView();
			this.dispose();
			
			break;	
		
		case "파일 저장" :
			single.dao.saveData();
			JOptionPane.showMessageDialog(null, "파일을 정상적으로 저장하였습니다.");
			this.dispose();
			
			break;
			
		case "프로그램 종료" :
			System.exit(0);
			break;
			
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
