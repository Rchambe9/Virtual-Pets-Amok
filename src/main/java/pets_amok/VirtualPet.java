package pets_amok;

public class VirtualPet {
    private String name;
    private int hunger = 8;
    private int thirst = 10;
    private int energy = 5;
    private int chargeUp = 3;

    public VirtualPet(String name) {
        this.name   = name;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() { return thirst; }

    public int getPlay() {  return energy;  }

    public int getReboot() {  return chargeUp; }
    }


