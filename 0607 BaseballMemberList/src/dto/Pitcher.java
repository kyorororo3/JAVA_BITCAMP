package dto;

public class Pitcher extends Human {

	private int win;
	private int lose;
	private double defence;
	
	public Pitcher() {
		
	}

	public Pitcher(int number, String name, int age, double height, 
			int win, int lose, double defence) {
		super(number, name, age, height);
		this.win = win;
		this.lose = lose;
		this.defence = defence;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}

	@Override   //고쳐기입한 것 super를 통해서 하면 됨 
	public String toString() {
		return super.toString() + "-" + win + "-" + lose + "-" + defence;
	}
	
	
	
}
