package person.job;

import dice.Dice;

public enum Job implements IJob {
    WARRIOR("Guerrier", Dice.D10),
    PRIEST("Prêtre", Dice.D8),
    WIZARD("Mage", Dice.D4);

    private Dice diceLifePoints;
    private String name;

    Job(final String name, Dice diceLifePoints) {
        this.name = name;
        this.diceLifePoints = diceLifePoints;
    }

    @Override
    public Dice getLifePointsByLevel() {
        return this.diceLifePoints;
    }

    @Override
    public String getName() {
        return "";
    }

	@Override
	public String toString() {
		return "Job{" +
				"diceLifePoints=" + this.diceLifePoints +
				", name='" + this.getName() + '\'' +
				", lifePointsByLevel=" + this.getLifePointsByLevel() +
				"} " + super.toString();
	}


}