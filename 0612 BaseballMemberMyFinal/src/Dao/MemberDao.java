package Dao;

import java.util.ArrayList;
import java.util.List;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.FileClass;

public class MemberDao {

	private List<Human> list;
	private int sequence;
	FileClass myfile;
	public MemberDao() {
		list = new ArrayList<Human>();
		
		//file Load
		
		//sequence
		sequence = 1001;
		myfile = new FileClass();		
		
		loadData();
		int lastNum = 0;
		if(list.isEmpty()) {
			lastNum = 1001;
		}
		else {
		Human h = list.get(list.size() - 1);
		lastNum = h.getNumber();
	
		sequence = 1000 + (lastNum%1000 + 1);
		}
	}
	
	public void insert(Human h) {
		if(h instanceof Pitcher) {
			h.setNumber(sequence);
		}
		else if(h instanceof Batter) {
			h.setNumber(sequence+1000);
		}
		list.add(h);
	
		sequence++;
	}
	
	public boolean delete(String name) {
		Human h = select(name);
		if(h == null) {
			return false;
		}
		else {
			list.remove(h);
			return true;
		}
	}
	
	public Human select(String name) {
		Human h = null;
		for (int i = 0; i < list.size(); i++) {
			Human human = list.get(i);
			if(name.equals(human.getName())) {
				h = list.get(i);
				break;
			}
		}
		return h;
		//null을 따지는 건 view에서 해야하는 것 
	}
	
	public void update(Human oldData, Human newData) {
		
		Human h = select(oldData.getName());
		
		//수정작업
		int findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			Human human = list.get(i);
			if(human == h) {
				findIndex = i;
				break;
			}
		}
		
		list.set(findIndex, newData);
		//찾지 못했을 때
	}
	
	public List<Human> allDatas(){
		return list;
	}
	
	public void allprint() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	public void saveData() {
		int dataLength = list.size();
		
		String datas[] = new String[dataLength];
		int len = 0;
		for (int i = 0; i <list.size(); i++) {
				datas[len] = list.get(i).toString();
				len++;
			}
	
		for (int i = 0; i < datas.length; i++) {
			System.out.println(i + "datas = " + datas[i]);
		myfile.writeFile(datas);}
	}
	
	public void loadData() {
		
		
		String datas[] = myfile.readFile();
		
		for (int i = 0; i < datas.length; i++) {
			String str = datas[i];				
			String data[] = str.split("-");    
												
			int number = Integer.parseInt(data[0]);
			if(number <2000) { //투수
				Pitcher p = new Pitcher(number, 
										data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]));
				list.add(p);
			}
			else {			   //타자
				Batter b = new Batter(number, 						//	번호
									  data[1], 						//  이름
									  Integer.parseInt(data[2]), 	//  나이
									  Double.parseDouble(data[3]), 	// 	키
									  Integer.parseInt(data[4]), 	//  승
									  Integer.parseInt(data[5]),    //  패
									  Double.parseDouble(data[6])); //  방어율
				list.add(b);
			}
		}
	}
}
