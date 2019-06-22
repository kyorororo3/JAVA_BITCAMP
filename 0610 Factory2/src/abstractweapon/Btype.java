package abstractweapon;

import bomb.Bomb;
import bomb.C4;
import weapon.Sword;
import weapon.Weapon;

public class Btype implements AbstractWeapon {

	@Override
	public Weapon CreateWeapon() {
	
		return new Sword();
	}

	@Override
	public Bomb CreateBomb() {
		// TODO Auto-generated method stub
		return new C4();
	}

}
