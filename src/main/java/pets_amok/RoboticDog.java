package pets_amok;

public class RoboticDog extends Dog implements RoboticPets {

    int oilLevel;

    public RoboticDog(String newName, String newDescription) {
        super(newName, newDescription);
        oilLevel = 50;
    }

    @Override
    public void walk() {
        happinessLevel += 20;
        healthLevel += 10;
        oilLevel -= 5;
        energyLevel -= 5;
    }

    @Override
    public void play() {
        happinessLevel += 20;
        oilLevel -= 5;
        energyLevel -= 5;
    }

    @Override
    public void tick() {
        happinessLevel -= (5 + generateRandom());
        oilLevel -= (5 + generateRandom());
    }

    @Override
    public void oilPet() {
        oilLevel += 20;
    }

    @Override
    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public void recharge() {
        happinessLevel += 10;
        healthLevel += 10;
        energyLevel += 10;
    }

}