package attacks;

import ru.ifmo.se.pokemon.*;


public class Rest extends StatusMove {

	public Rest() {
		super(Type.PSYCHIC, 0, 100);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setCondition(new Effect().turns(2).condition(Status.SLEEP));
		Effect ef_heal  = new Effect().stat(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP))).turns(1);
		p.addEffect(ef_heal);
	}

	@Override
	protected String describe() {
	return "отдыхает. Круто!";
	}

}
