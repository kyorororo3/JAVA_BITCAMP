package main;

import frame.WindowTest;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 기본 component
		 : 두종류로 나누어지게 됨
		 1)AWT
		 	Button, Label, Choice, Checkbox, List, RadioButton(선택하면 다른거 지워지는 느낌), ScrollBar
		 2)swing -AWT를 경량화 시켜놓은 Library
		 	JButton, JLabel, JChoice ... 위와 같다  AWT와 호환이 된다. 이것이 조금 좀 더 간편하다 
		 
		 
		 컨테이너 component
		 	하나로 묶어서 사용하는 것 
		 	
		 	Frame(판에 종이를 깔 때 종이가 frame), Panel,  Container, Window, Dialog(계산기는 윈도우가 아닌 Dialog),FileDialog(파일불러오기할 때 뜨는 창)
		 
		 Text component
		 	TextField(카톡의 입력창), TextArea,TextComponent
		 
		 */
		
		
		new WindowTest();
	}

}
