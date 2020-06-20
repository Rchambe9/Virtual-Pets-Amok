package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {



        VirtualPetShelter petShelter = new VirtualPetShelter();
        OrganicCat organicCat = new OrganicCat("Whiskers", "Parisian Cat");


        @Test
        public void shouldBeAnOrganicCatWithAName() {
            assertEquals("Whiskers", organicCat.getName());

        }
        @Test
        public void shouldBeAbleToFeedOrganicCat(){

        }

}