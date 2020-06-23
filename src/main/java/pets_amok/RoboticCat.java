package pets_amok;

public class RoboticCat extends Cat implements RoboticPets {
    int oilLevel;

    public RoboticCat(String nameParam, String descriptionParam) {
        super(nameParam, descriptionParam);
        oilLevel = 50;
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


