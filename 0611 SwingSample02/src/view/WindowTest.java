package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class WindowTest extends JFrame {

	JTextField textField;
	JTextArea	textArea;
	
	JButton btn1, btn2;
	
	
	public WindowTest() {
		super("textfield");
		
		JPanel panel = new JPanel();
		
		textArea = new JTextArea();
		textArea.setLineWrap(true); //텍스트에리아 겉에 선이 있도록 하는 것
		
		JScrollPane scrPane = new JScrollPane(textArea); // scroll bar의 경우 awt는 자동으로 생기지만, swing은 만들어 줘야함
		scrPane.setPreferredSize(new Dimension(400,300));
		panel.add(scrPane); //factory pattern과 유사함    textArea를 넣고 그걸 scrPane에 넣고 그 값으로 쓰는 것 
		
		
		JPanel botpan = new JPanel();
		
		textField = new JTextField(20);  //문자열을 괄호 안에 넣을 경우 그 문자열이 올라가게 되고 숫자를 넣을 경우 칸의 수를 지정해주는 것
		
		btn1 = new JButton("끝부분에 추가");
		//actionperformed 의 경우 버튼이 많을 때 쓰는것이 유용하다. 
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이 안쪽에 기입만하면 되는 것, 새로운 추가법 
				
				if(textField.getText().equals(""))return;
				
				String msg = textField.getText();
				textArea.append("\n" + msg);
				
			}
		});
		
		btn2 = new JButton("앞부분에 추가");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.insert(textField.getText() + "\n", 
									textArea.getLineStartOffset(0));
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				
			}
		});
		
		botpan.add(textField);
		botpan.add(btn1);
		botpan.add(btn2);
		
		//Layout 설정
		
		Container contentPane = getContentPane();
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
		// -> 레이아웃 설정하는 방법
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
