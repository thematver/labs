package attacks;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {

	public Psychic() {
		super(Type.PSYCHIC, 90.0, 100);

	}
@Override
	protected void applyOppEffects(Pokemon p) {
	Effect ef = new Effect().stat(Stat.SPECIAL_DEFENSE, 1).chance(0.1);
		p.addEffect(ef);
	}

	@Override
	protected String describe() {
	return "использует психическую атаку";
	}

}