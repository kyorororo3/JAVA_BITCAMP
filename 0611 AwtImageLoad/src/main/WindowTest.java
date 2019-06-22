package main;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 
 
 			jpg     gif		png		bmp		tga		tiff	
     압축		 1	   jpg묶음                     X     Alpha
   web	   90%이상                           퀄리티는 높지만
   		 가볍다 == 퀄리티최악			  압출률 제로
  		   절약 == 빈곤
  		   살인 == 정의???????????????
  sprite     X                     기본+마스크(이미지)
  (투명도) 						작업량이 두배로 늘어남 (투명처리를 해줘야하니까)
 						역사가 제일 짧아요 (10년도 안됨)
 						기본 이미지를 만들 때 테두리를 투명으로 줌 
 						
  Android				    1위(안드로이드 only)
  						퀄리티도 좋고 작업량도 많지 않고 효율적이다 
  						
 */

public class WindowTest extends Frame implements WindowListener {

	
	Image jpgImg = null;
	Image pngImg = null;
	
	public WindowTest() {
		
		setLayout(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//이미지 불러오기 
	//	jpgImg = tk.getImage("house.jpg");  상대경로
	//	jpgImg = tk.getImage("e:\\temp\\pig.png"); 절대경로
		//192.168.0.66
		jpgImg = tk.getImage("\\\\192.168.0.66\\공유\\girl.jpg");
		pngImg = tk.getImage("bird.png");
		
	
		setBounds(100,100,500,500);
		setVisible(true);
		addWindowListener(this);
		
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		int width = jpgImg.getWidth(this);
		int height = jpgImg.getHeight(this);
		
		//화면 중앙에 출력을 해주고 싶을 때  --> 배경화면 
		g.drawImage(jpgImg, (getWidth()-width)/2, (getHeight() -height)/2 , this);
		
		//이미지 위에 이미지를 뿌리는 경우 --> 새 이미지
		g.drawImage(pngImg, 200, 200, this);
		
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
