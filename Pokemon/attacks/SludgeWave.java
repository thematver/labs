package attacks;

import ru.ifmo.se.pokemon.*;



public class SludgeWave extends SpecialMove {

	public SludgeWave() {
		super(Type.POISON, 95.0, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect e = new Effect().chance(0.1);
		e.poison(p);
	}

	@Override
	protected String describe() {
	return "делает волновой осадок";
	}

}
