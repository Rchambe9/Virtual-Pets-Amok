package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreateVirtualPet(){
        VirtualPet virtualPetTest = new VirtualPet("Scruffy");

        assertEquals("Scruffy", virtualPetTest.getName());
    }

    @Test
    public void hungerShouldBe8WhenCreated(){
        VirtualPet virtualPetTest = new VirtualPet("Scruffy");

        assertEquals(8, virtualPetTest.getHunger());


    }

}
