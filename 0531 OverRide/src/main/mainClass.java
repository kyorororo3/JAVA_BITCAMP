package main;

import child.ChildClass;
import child.SubClass;
import sup.SuperClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		SubClass sub = new SubClass(123);
		
		sub.method();
		sub.overRideMethod();
		 */
		
		/*
		//부모의 instance  자식 클래스
		SuperClass sc = new SubClass();
		//c++도 가능
		sc.method();		 // super class
		sc.overRideMethod(); //over ride method -> subclass에 있는 애
		
		SubClass sub = (SubClass)sc;
		sub.func();
		*/
		
		
		SuperClass arrCls[] = new SuperClass[4];
		
		arrCls[0] = new SubClass();
		arrCls[1] = new ChildClass();
		arrCls[2] = new ChildClass();
		arrCls[3] = new SubClass();
		
		for (int i = 0; i < arrCls.length; i++) {
			arrCls[i].overRideMethod();
		}
		
		for (int i = 0; i < arrCls.length; i++) {
			
			if(arrCls[i] instanceof SubClass) {
				SubClass s = (SubClass)arrCls[i];
				s.func();
			}
			else if(arrCls[i] instanceof ChildClass) {
				ChildClass c = (ChildClass)arrCls[i];
				c.function();
			}
			//override는 관리는 부모가하면서 자식 클래스에 접근을 하기 위해서 
			//overriding이 안되어 있는 자식 클래스의 함수에 접근하기 위해서는 instanceof를 쓴다
		}
	}

}
