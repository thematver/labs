package attacks;

import ru.ifmo.se.pokemon.*;



public class SleepPowder extends StatusMove {

	public SleepPowder() {
		super(Type.GRASS, 0, 75);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().turns(3);
		e.sleep(p);
	}

	@Override
	protected String describe() {
	return "усыпляет";
	}

}