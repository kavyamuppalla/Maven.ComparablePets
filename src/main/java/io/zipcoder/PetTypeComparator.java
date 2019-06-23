package io.zipcoder;

import java.util.Comparator;

public class PetTypeComparator implements Comparator<Pet> {


    public int compare(Pet o1, Pet o2) {
        String o1ClassName = o1.getClass().getSimpleName();
        String o2ClassName = o2.getClass().getSimpleName();
        return o1ClassName.compareTo(o2ClassName);

    }
}
