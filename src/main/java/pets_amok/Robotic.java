package pets_amok;

public abstract class Robotic extends VirtualPet {

    private int rustLevel = 2;

    public Robotic(String name) {
        super(name);
    }


    public int getRustLevel(){ return rustLevel; }

    public void oilUp(){ rustLevel = rustLevel - 2;}


    }