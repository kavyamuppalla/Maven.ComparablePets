package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitTest {

    @Test
    public void speak() {
        Rabbit rabbit = new Rabbit();
        rabbit.speak();
    }
}