package datastructure.stackqueuesinterview.animalshelter;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    // Enqueue method
    public void enqueue(Animal a){
        a.setOrder(order);
        order++;
        if (a instanceof Dog){
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat){
            cats.addLast((Cat) a);
        }
    }

    public int size(){
        return dogs.size() + cats.size();
    }

    // Dequeue dog
    public Dog dequeueDog(){
        return dogs.poll();
    }

    // Peek dog
    public Dog peekDog(){
        return dogs.peek();
    }


}
