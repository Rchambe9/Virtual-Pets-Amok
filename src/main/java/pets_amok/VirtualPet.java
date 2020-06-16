package pets_amok;

public class VirtualPet {
    private String name;
    private int hunger = 8;

    public VirtualPet(String name) {
        this.name   = name;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }
}
