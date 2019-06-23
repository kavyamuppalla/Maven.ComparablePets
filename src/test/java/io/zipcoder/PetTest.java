package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {



    @Test
    public void speak() {
        Pet pet = new Pet();
        pet.speak();

    }

    @Test
    public void compareTo() {
        Pet pet = new Pet();
        pet.setName("dog");
        Pet pet1 = new Pet();
        pet1.setName("cat");
        int actual = pet.compareTo(pet1);
        Assert.assertEquals(1,actual);
    }
}