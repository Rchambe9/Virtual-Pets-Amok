package pets_amok;

public class OrganicDog extends Organic {
    public OrganicDog(String name) {
        super(name);
    }
    public void walk(){
        this.wasteLevel = wasteLevel - 5;
        happinessLevel = happinessLevel + 3;
    }
}
