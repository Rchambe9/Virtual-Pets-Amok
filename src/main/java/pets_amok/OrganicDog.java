package pets_amok;

public class OrganicDog extends Dog implements OrganicPets {

    protected int cageDirtiness;
    protected int hunger;
    protected int thirst;

    public OrganicDog(String newPetName, String newDescription){
        super(newPetName, newDescription);

        cageDirtiness = 30;
        hunger = 20;
        thirst = 40;

    }
    public void feed() {
        hunger -= 40;
        thirst += 20;
        healthLevel += 15;
        happinessLevel += 10;
        energyLevel += 5;
    }
    public void water() {
        thirst -= 20;
        hunger -= 5;
        healthLevel += 10;
        happinessLevel += 5;
        energyLevel += 5;

    }
    @Override
    public void walk() {
        happinessLevel += 20;
        healthLevel += 20;
        energyLevel -= 30;
        hunger += 40;
        thirst += 20;
        cageDirtiness -= 20;

    }
    @Override
    public void play() {
        happinessLevel += 30;
        healthLevel += 20;
        hunger += 30;
        thirst += 20;
        energyLevel -= 20;
        cageDirtiness -= 20;
    }
    public void cleanDogCage(){
        cageDirtiness += 20;
        happinessLevel += 10;
        healthLevel += 10;
    }
    @Override
    public int getHunger() {
        return hunger;
    }

    public int getThirst(){ return thirst; }

    public int getCageMessiness() {
        return cageDirtiness;
    }

    @Override
    public int tick() {
        hunger += (3 + generateRandom());
        thirst += (3 + generateRandom());
        happinessLevel += (3 + generateRandom());
        cageDirtiness += (5 + generateRandom());
        return 0;
    }


}
