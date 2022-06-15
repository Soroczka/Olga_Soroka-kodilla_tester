package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();
        Duck duck = new Duck();
        duck.giveVoice();
        System.out.println(duck.getNumberOfLegs());
        System.out.println(dog.getNumberOfLegs());

        Animal dog2 = new Dog();
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog2);

        /*
        zapis Animal dog = new Dog() nie jest konieczny
        można używać zapisu Dog dog = new Dog();
        */
    }
}
