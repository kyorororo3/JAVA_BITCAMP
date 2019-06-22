package dao;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import single.SingletonClass;

public class UpdateClass implements DaoInterface {

	
	SingletonClass sc = SingletonClass.getInstance();
	SearchClass s = new SearchClass();
	
	@Override
	public void process() {
	System.out.print("수정할 선수 이름>> ");	
		String name = scan.next();
		int findIndex = s.search(name);
		if(sc.map.get(findIndex) == null && name.equals("")) {
			System.out.println("선수의 정보를 찾을 수 없습니다.");
			return;
		}
		Human h = sc.map.get(findIndex);
		
		if(h instanceof Pitcher) {
			Pitcher p = (Pitcher)h;
			System.out.print("승>> ");
			int win = scan.nextInt();

			System.out.print("패>> ");
			int lose = scan.nextInt();

			System.out.print("방어율>> ");
			double defense = scan.nextDouble();

			
			p.setWin(win);
			p.setLose(lose);
			p.setDefence(defense);
			
			sc.map.replace(findIndex, p);
		}
		else {
			Batter b = (Batter)h;
			System.out.print("볼>> ");
			int bat = scan.nextInt();

			System.out.print("안타>> ");
			int hit = scan.nextInt();

			System.out.print("안타율>> ");
			double hitAvg = scan.nextDouble();

			b.setBat(0);
			b.setHit(0);
			b.setHitAvg(0);
			sc.map.replace(findIndex, b);
			}
	}
}
