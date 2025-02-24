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
    public Dog dequeueDogs(){
        return dogs.poll();
    }

    // Peek dog
    public Dog peekDogs(){
        return dogs.peek();
    }

    // Dequeue cat
    public Cat dequeueCats(){
        return cats.poll();
    }

    // Peek cat
    public Cat peekCats(){
        return cats.peek();
    }

    // Dequeue any
    public Animal dequeueAny(){
        if(dogs.size()==0){
            return dequeueCats();
        }else if(cats.size()==0){
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if(dog.isOlderThan(cat)){
            return dogs.poll();
        }else {
            return cats.poll();
        }
    }

    // Peek
    public Animal peek(){
        if(dogs.size()==0){
            return dequeueCats();
        }else if(cats.size()==0){
            return dequeueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if(dog.isOlderThan(cat)){
            return dogs.peek();
        }else {
            return cats.peek();
        }
    }
}
