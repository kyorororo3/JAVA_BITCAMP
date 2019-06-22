package dao;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import file.FileClass;
import single.SingletonClass;

public class daoSaveData extends Frame implements ActionListener, WindowListener {

	SingletonClass s = SingletonClass.getInstance();
	FileClass myfile;
	public daoSaveData() {
		
	int dataLength = s.list.size();
		
		String datas[] = new String[dataLength];
		int len = 0;
		for (int i = 0; i <s.list.size(); i++) {
				datas[len] = s.list.get(i).toString();
				len++;
			}
	
		for (int i = 0; i < datas.length; i++) {
			System.out.println(i + "datas = " + datas[i]);
		myfile.writeFile(datas);}
		
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
		// TODO Auto-generated method stub

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
		JOptionPane.showMessageDialog(null, "선수 정보를 정상적으로 저장하였습니다.");

	}

}
