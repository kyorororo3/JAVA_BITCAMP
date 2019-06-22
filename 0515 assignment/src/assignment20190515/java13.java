package assignment20190515;

public class java13 {

	public static void main(String[] args) {
		// TODO 랜덤 수 취득
		/*
		double ran1;
		ran1 = (int)(Math.random()*100);
		System.out.println("ran1 = " + ran1);
		
		double ran2;
		ran2 = (int)(Math.random()*5)+11;
		System.out.println("ran2 = " + ran2);
		
		int array[] = {3,7,9,13,15};
		
		
		//*************ran4=(int)(Math.random()%5;
		System.out.println("ran3 = " + ran4);
		*/
		
		int ran1, ran2, ran3;
		
		ran1 =(int)(Math.random()*100);
		System.out.println("ran1 =" +ran1);
		
		ran2 =(int)(Math.random()*5)+11;
		System.out.println("ran2= " +ran2);
		
		int array[] = {3,7,9,13,15};
		
		ran3 =(int)(Math.random()*array.length);
		System.out.println("ran3 =" +array[ran3]);
		
		
		//선생님 풀이
		
		int r;
		r = (int)(Math.random()*100);
		System.out.println("r =" +r);
		
		r = (int)((Math.random())*5)+11; //랜덤 숫자가 나오는 갯수를 곱하는 것

		int Array[] = new int[5];
		int Array2[] = {3, 7, 9, 13, 15};
		r = (int)(Math.random()*5);
		System.out.println("r =" +array[r]);
		
		int num = 1;
		 num = num <<30;
		 System.out.println(num);
		 
	}

}
