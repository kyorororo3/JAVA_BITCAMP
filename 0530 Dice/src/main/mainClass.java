package main;

import game.gamePlay;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		  
		  OOP : class 구축
		   		gamePlay : play class 	->Dao
		   		dice	 : object 2개 생성
		
		 User Interface  -> G UI (Graphic User Interface)
		 - Application
		 - WEB browser (WB)
		 
		
		 
		 
		 */
		
		gamePlay play = new gamePlay();
		
		while (true) {
			play.init();
			play.input();
			play.finding();
			play.resultPrint();
		}
		
		
	}

}
