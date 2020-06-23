package pets_amok;

public class OrganicCat extends Cat implements OrganicPets {

    protected int hunger;
    protected int thirst;

    public OrganicCat(String nameParam, String descriptionParam) {
        super(nameParam, descriptionParam);
        hunger = 50;
        thirst = 50;
    }

    @Override
        public void feed(){
        hunger -= 30;
        thirst += 20;
        energyLevel += 10;
        happinessLevel += 10;
    }
    @Override
    public void water(){
        thirst -= 20;
        happinessLevel += 10;
    }
    @Override
    public void play(){
        hunger += 40;
        thirst += 20;
        energyLevel -= 20;
        happinessLevel += 30;
    }
    @Override
    public int tick(){
        hunger += (3 + generateRandom());
        thirst += (3 + generateRandom());
        happinessLevel += (3 + generateRandom());
        return (2 + generateRandom());
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public int getThirst() {
        return thirst;
    }


}