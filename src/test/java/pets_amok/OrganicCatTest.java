package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {



        virtualpetsamok.VirtualPetShelter petShelter = new virtualpetsamok.VirtualPetShelter();
        OrganicCat organicCat = new OrganicCat("Whiskers", "Parisian Cat");


        @Test
        public void shouldBeAnOrganicCatWithAName() {
            assertEquals("Whiskers", organicCat.getPetName());

        }
        @Test
        public void shouldBeAbleToFeedOrganicCat(){

        }

}