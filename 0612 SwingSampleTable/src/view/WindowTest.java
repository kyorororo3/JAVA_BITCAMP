package view;

import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dto.DtoClass;

public class WindowTest extends JFrame implements MouseListener{

	JTable table;
	JScrollPane scrPane;
	
	String columnNames[] = {"상품번호", "상품명","상품가격","상품회사"};
	
	//table에 집어 넣는 데이터는 object형식으로 되어있음
	
	Object rowData[][];   //[행][열]
	
	List<DtoClass> list = new ArrayList<DtoClass>();
	
	public WindowTest() {
	
	
		list.add(new DtoClass(101,"맛동산", 1000, "오리온"));
		list.add(new DtoClass(102, "초코파이", 1200, "해태"));
		list.add(new DtoClass(103, "감자깡", 1800, "롯데"));
		
		rowData = new Object[list.size()][4];
		
		for (int i = 0; i < list.size(); i++) {
			rowData[i][0] = list.get(i).getSeq();
			rowData[i][1] = list.get(i).getName();
			rowData[i][2] = list.get(i).getMoney();
			rowData[i][3] = list.get(i).getCompany();			
		}
		
					    //실제데이터 		항목명
		table = new JTable(rowData, columnNames);
		table.addMouseListener(this);
		
		scrPane = new JScrollPane(table);
		add(scrPane);
		
		
		setBounds(0,0,640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int rowNumber = table.getSelectedRow();
		//JOptionPane.showMessageDialog(null, "선택행:" + rowNumber);
		
		DtoClass d = list.get(rowNumber);
		JOptionPane.showMessageDialog(null, d.toString());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
