package pets_amok;

public abstract class VirtualPet {
    private String name;

    protected int healthLevel = 3;
    protected int happinessLevel = 4;
    protected int energyLevel = 4;

    public VirtualPet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return healthLevel;
    }

    public int getHappiness() {
        return happinessLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;

    }

}
