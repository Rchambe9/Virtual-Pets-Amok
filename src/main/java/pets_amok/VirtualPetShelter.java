package virtualpetsamok;

import pets_amok.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private int litterBox = 50;
    private int dogCage = 50;

    private Map<String, VirtualPet> petShelter = new HashMap<String, VirtualPet>();

    public int getLitterBox() {
        return litterBox;
    }
    public int getDogCage(){
        return dogCage;
    }

    public void cleanLitterBox() {
        litterBox = 0;
    }

    public void maintainAllRobo() {
        for (VirtualPet pet : pets()) {
            if (pet instanceof RoboticPets) {
                ((RoboticPets) pet).oilPet();
                ((RoboticPets) pet).recharge();
            }
        }
    }

    public void cleanDogCages() {
        for (VirtualPet pet : pets()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanDogCage();
            }
        }
    }

    public VirtualPet[] pets() {return pets();
    }
    public void walkDogs() {
        for (VirtualPet pet : pets()) {
            if (pet instanceof Dog) {
                ((Dog) pet).walk();
            }
        }

    }

    public void intake(VirtualPet pet) {
        petShelter.put(pet.getPetName(), (VirtualPet) pet);
    }

    public void intake(RoboticPets pet) {
        petShelter.put(pet.getPetName(), (VirtualPet) pet);
    }

    public void intake(OrganicPets pet) {
        petShelter.put(pet.getPetName(), (VirtualPet) pet);
    }

    public void feedAllOrganic() {
        for (VirtualPet pet : pets()) {
            if (pet instanceof OrganicPets) {
                ((OrganicPets) pet).feed();
            }
        }
        litterBox += 10;
        dogCage += 10;
    }

    public void waterAllOrganic() {
        for (VirtualPet pet : pets()) {
            if (pet instanceof OrganicPets) {
                ((OrganicPets) pet).water();
            }
        }
        litterBox += 5;
        dogCage += 10;
    }


    public void tickAllPets() {
        for (VirtualPet pet : pets()) {
            if (pet instanceof OrganicCat) {
                litterBox += ((OrganicCat) pet).tick();
            }
            if (!(pet instanceof OrganicCat))
                if (pet instanceof OrganicDog){
                    ((OrganicDog) pet).tick();
                }
            if (pet instanceof RoboticPets){
                ((RoboticPets) pet).tick();
            }
        }
    }


    public Collection<VirtualPet> retrieveAllPets() {
        return petShelter.values();
    }

    public VirtualPet getPet(String name) {
        return petShelter.get(name);
    }

    public void playWithOne(VirtualPet onePet) {
        onePet.play();
    }

    public void adoptPet(VirtualPet pet) {
        petShelter.remove(pet.getPetName());
    }
}