package pets_amok;

import java.util.Random;

public abstract class VirtualPet {

    protected Random generator = new Random();

    protected String petName;
    protected String description;


    protected int healthLevel;
    protected int happinessLevel;
    protected int energyLevel;

    public VirtualPet(String newPetName, String newDescription) {
        petName = newPetName;
        description = newDescription;
        healthLevel = 50;
        happinessLevel = 50;
        energyLevel = 50;

    }

    public String getPetName() { return petName;}

    public String getDescription() { return description; }

    public int getHealthLevel() { return healthLevel; }

    public int getHappinessLevel() { return happinessLevel; }

    public int getEnergyLevel() { return energyLevel; }

    public abstract void play();

    public int generateRandom() {
        return generator.nextInt(20);
    }

    @Override
    public String toString() {
        return ("[" + petName + "] " + description);
    }

    public void decreaseHealth() {
        healthLevel -= 10;
    }

}
