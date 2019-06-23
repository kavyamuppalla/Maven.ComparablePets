package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speakTest() {
        Dog dog = new Dog();
        dog.speak();
    }
}