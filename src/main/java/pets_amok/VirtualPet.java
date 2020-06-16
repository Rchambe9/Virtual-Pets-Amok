package pets_amok;

public class VirtualPet {
    private String name;
    private int hunger = 8;
    private int thirst = 10;

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

    }

