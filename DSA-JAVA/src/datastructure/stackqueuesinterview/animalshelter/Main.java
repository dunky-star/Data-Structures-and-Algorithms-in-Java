package datastructure.stackqueuesinterview.animalshelter;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly
 * "first in, first out" basis. People must adopt either the "oldest"
 * (based on arrival time) of all animals at the shelter, or they can select
 * whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
 */

public class Main {
    public static void main(String[] args){
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Karl"));
        animals.enqueue(new Dog("Benji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Dog("Dexter"));

        System.out.println(animals.dequeueAny().name());
        System.out.println(animals.dequeueDogs().name());
    }

}
