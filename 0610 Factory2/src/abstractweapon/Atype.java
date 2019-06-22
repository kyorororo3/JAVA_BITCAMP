package abstractweapon;

import bomb.Bomb;
import bomb.Dynamite;
import weapon.Gun;
import weapon.Weapon;

public class Atype implements AbstractWeapon {

	@Override
	public Weapon CreateWeapon() {
		return new Gun();
	}

	@Override
	public Bomb CreateBomb() {
		return new Dynamite();
	}

}
