package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VirtualPet virtualPetTest;

    @BeforeEach
    public void setup(){
        virtualPetTest = new VirtualPet("Scruffy");

    }

    @Test
    public void shouldBeAbleToCreateVirtualPet(){

        assertEquals("Scruffy", virtualPetTest.getName());
    }

    @Test
    public void hungerShouldBe8WhenCreated(){

        assertEquals(8, virtualPetTest.getHunger());

    }
    @Test
    public void waterShouldBe10WhenCreated(){

        assertEquals(10, virtualPetTest.getThirst());
    }

    @Test
    public void energyShouldBe5WhenCreated(){

        assertEquals(5, virtualPetTest.getPlay());
    }

}
