package attacks;

import ru.ifmo.se.pokemon.*;



public class Crunch extends PhysicalMove {

	public Crunch() {
		super(Type.DARK, 80.0, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		p.setMod(Stat.DEFENSE, 1);
	}

	@Override
	protected String describe() {
	return "использует атаку Crunch";
	}

}