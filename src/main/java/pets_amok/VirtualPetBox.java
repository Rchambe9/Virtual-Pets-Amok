package pets_amok;

public abstract class VirtualPetBox {

    private Organic organicPet;
    private int dirtiness = 0;
    public VirtualPetBox(Organic organicPet){
        this.organicPet = organicPet;
    }

    public int getDirtiness(){ return dirtiness; }

    public void setDirtiness(int dirtiness) {
        this.dirtiness = dirtiness;
    }


}
