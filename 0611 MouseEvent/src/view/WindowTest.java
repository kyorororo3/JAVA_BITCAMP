package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowTest extends JFrame implements MouseListener, MouseMotionListener{

	JLabel label;
	int posX, posY;
	
	
	public WindowTest() {
		super("마우스 이벤트");
		
		
		setLayout(null);
		label = new JLabel("x = y = ");
		label.setBounds(50, 100, 200, 50);
		add(label);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		addMouseListener(this);
		addMouseMotionListener(this);
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
	 public void mouseMoved(MouseEvent event) {
		    //TODO
		  
		    posX = event.getX();
		    posY = event.getY();
		    
		    label.setText("x = " + posX + " y = " + posY);
		    label.setBounds(posX,posY, 200, 50);
		    
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// 우리가 쓸 하나  마우스를 클릭했을 때 이벤트를 발생시키는 것 
	//	JOptionPane.showMessageDialog(null, "마우스클릭");
//		posX = e.getX();
//		posY = e.getY();
//		
//		label.setText("x = " + posX + " y = " + posY);
		//클릭해서 위치가 어딘지 파악하고 어떻게 위치를 설정할지 볼 수 있다. 
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
