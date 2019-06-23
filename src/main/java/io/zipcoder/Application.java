package io.zipcoder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have");
        int a = sc.nextInt();
        sc.nextLine();
        List<Pet> pets = new ArrayList<Pet>();
        for(int i = 0; i < a; i++) {
            System.out.println("What kind of pet do you have");
            String kind = sc.nextLine();

            System.out.println("What is pet name");
            String name = sc.nextLine();

            if(kind.equals("Cat")) {
                Pet cat = new Cat();
                cat.setName(name);
                pets.add(cat);

                //System.out.println(name);

            }
            else if(kind.equals("Dog")) {
                Pet dog = new Dog();
                dog.setName(name);
                pets.add(dog);
                //System.out.println(name);
            }
            else if(kind.equals("Rabbit")) {
                Pet rabbit = new Rabbit();
                rabbit.setName(name);
                pets.add(rabbit);

                //System.out.println(name);
            }

        }
        for(Pet pet : pets) {
            pet.speak();
            System.out.println(pet.getName());
        }
    }
}
