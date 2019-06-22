package main;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String str = (String)arg;
		
		System.out.println("Observer A입니다. 통지를 받았습니다. :" + str );
	}

}
