package pets_amok;

import pets_amok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Collection<VirtualPet> petShelter = new ArrayList<>();

    private int litterBox = 50;
    private int dogCage = 50;


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
        for (VirtualPet pet : petShelter){
            if (pet instanceof RoboticPets) {
                ((RoboticPets) pet).oilPet();
                ((RoboticPets) pet).recharge();
            }
        }
    }

    public void cleanDogCages() {
        for (VirtualPet pet : petShelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanDogCage();
            }
        }
    }

//    public VirtualPet[] pets() {return pets();
//    }
    public void walkDogs() {
        for (VirtualPet pet : petShelter) {
            if (pet instanceof Dog) {
                ((Dog) pet).walk();
            }
        }

    }

    public void intake(VirtualPet pet) {
        petShelter.add((VirtualPet)pet);
    }

    public void intake(RoboticPets pet) {
        petShelter.add((VirtualPet)pet);
    }

    public void intake(OrganicPets pet) {
        petShelter.add((VirtualPet)pet);
    }

    public void feedAllOrganic() {
        for (VirtualPet pet : petShelter) {
            if (pet instanceof OrganicPets) {
                ((OrganicPets) pet).feed();
            }
        }
        litterBox += 10;
        dogCage += 10;
    }

    public void waterAllOrganic() {
        for (VirtualPet pet : petShelter) {
            if (pet instanceof OrganicPets) {
                ((OrganicPets) pet).water();
            }
        }
        litterBox += 5;
        dogCage += 10;
    }


    public void tickAllPets() {
        for (VirtualPet pet : petShelter) {
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
        return petShelter;
    }

    public VirtualPet getPet(String name) {
        for (VirtualPet pet : petShelter) {
            if (pet.getPetName() == name) {
                return pet;
            }
        }return null;
    }

    public void playWithOne(VirtualPet onePet) {
        onePet.play();
    }

    public void adoptPet(VirtualPet pet) {
        petShelter.remove(pet.getPetName());
    }
}