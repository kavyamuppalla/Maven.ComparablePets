package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTypeComparatorTest {

    @Test
    public void compare() {
        PetTypeComparator petTypeComparator = new PetTypeComparator();
        Pet pet = new Pet();
        pet.setName("dog");
        Pet pet1 = new Pet();
        pet1.setName("dog");
        int actual = petTypeComparator.compare(pet,pet1);

        Assert.assertEquals(0,actual);
    }
}