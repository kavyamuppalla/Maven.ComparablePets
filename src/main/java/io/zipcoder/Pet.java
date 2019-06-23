package io.zipcoder;

public class Pet implements Comparable<Pet> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Pet");
    }



    public int compareTo(Pet o) {
        return this.getName().compareTo(o.getName());
    }
}
