package view;

import java.awt.Checkbox;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class WindowTest extends JFrame implements ItemListener{
													// 값이 수시로 바뀔 때 쓰는 인터페이스 value change
	//awt소속이라고 해서 swing에서 못쓰는건 아니다.
	List list;	
	Checkbox checkbox;
	
	Label label;
	
	TextField textField;
	
	double toRadian;   //*3.141592 / 180.0 Math.PI
	
	
	public WindowTest() {
		super("list checkbox");
	
		textField = new TextField();
		textField.setText("여기에 입력");
		
		//layout잡는중
		
		GridLayout gridbag = new GridLayout();
		//GridBagConstraints c = new GridBagConstraints();
		//사용안함
		
		
		toRadian = 1.0;
		
		label = new Label("1");

		// list
		list = new List();
		list.add("root");
		list.add("sin");
		list.add("cos");
		list.add("tan");
		list.addItemListener(this);
		add(list);
		
		// check box
		
		checkbox  = new Checkbox("Degree");
		checkbox.setState(false); // 체크가 안되어 있도록 하는 설정
		checkbox.addItemListener(this);
		//checkbox의 경우 액션을써도 무관
		add(checkbox);
		
		add(textField);
		
		setBounds(0, 0, 640, 480);
		setLayout(gridbag);
		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//action은 이벤트 성
		//valuechange는 실시간으로 값이 바뀌는것 이때는 actionlistener를 쓰는게 아니다. 
		
		
	//UI부분의 list , checkbox	
		
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		//JOptionPane.showMessageDialog(null, "아이템 선택");
		//List _list = (List)e.getSource();
		//리스트에만 아이템 리스너를 쓸 때는 상관 없음 하지만 지금 아이템리스너를 쓰는 건 리스트와 체크박스가 있어서 둘다 받을 수 있는 소스가 필요로 함.
	
		Object obj = e.getSource();
		// object로 받으면 보다 구분하기가 편하다 
		
		if(obj == list) { // instance랑 비교하는게 가능
			//JOptionPane.showMessageDialog(null, "list 선택");
			
			int itemNo = list.getSelectedIndex();  //0,1,2,3
		//	JOptionPane.showMessageDialog(null, itemNo); // 이걸로 우리가 뭘 클릭했는지 알 수 있다  활용도가 높다

			double value = Double.parseDouble(textField.getText());
			double result = 0.0;
			
			switch(itemNo) {
			case 0:
				result = Math.sqrt(value);
				
				break;
			
			case 1:
				result = Math.sin(value);

				break;	
			case 2:
				result = Math.cos(value);

				break;	
			case 3:
				result = Math.tan(value);

				break;	
			}
			textField.setText(result + "");
		}
		else if(obj == checkbox) {
			// JOptionPane.showMessageDialog(null, "checkbox 선택");
			if(checkbox.getState() == true) {  //체크가 되었을 때
				double d = Double.parseDouble(textField.getText());
				d = d * Math.PI / 180.0;
				textField.setText(d + "");
			}
			else {
				textField.setText("0"); // 꼭 넣을 필요는 없다
			}
		}
		
	
	}
	
}
