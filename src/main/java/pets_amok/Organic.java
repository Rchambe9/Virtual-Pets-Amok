package pets_amok;

public abstract class Organic extends VirtualPet {

    protected int hunger = 8;
    protected int thirst = 10;
    protected int wasteLevel = 10;


    public Organic(String name) {
        super(name);
    }

    public int getHunger() {
        return hunger;
    }
    public int getThirst() { return thirst; }
    public int getWasteLevel(){ return wasteLevel; }

    public void water(){ thirst = thirst - 5; }
    public void feed(){ hunger = hunger - 4;}

}


