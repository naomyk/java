package com.naomysam;

public class AnimalInheritance {
    String animalName;
    String breath;
    String locomotion;

    String name(String name) {
        animalName = name;
        return animalName;
    }

    public String breath(String alive) {
        breath = alive;
        return breath;
    }

    public String move(String name) {
        locomotion = "";
        while (true) {
            if (name.equals("dog"))
                locomotion = "walk";
            else
                locomotion="fly";
            break;
        }
        return locomotion;
    }
}

    class Dog extends AnimalInheritance {
        public void bark()  {
            System.out.println("barking");
        }

    }

    class SmallDog extends Dog {
        public void meow() {
            System.out.println("mewing");
        }
    }

    class Puppy extends SmallDog {
        public void eat() {
            System.out.println("eating");
        }
    }

