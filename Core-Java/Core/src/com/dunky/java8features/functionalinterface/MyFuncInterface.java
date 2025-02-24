package com.dunky.java8features.functionalinterface;
/*
* After Java 5, Java 8 is the major release with Functional programming features.
* Eg:
* 1. Lambda Expression: Using which we can write few lines of codes which do a lot of work.
* A  Lambda is an anonymous function or closure.
* 2. Functional interfaces: Used to Express Lambda Expression in Java 8.
* Examples of functional interfaces are: Runnable which has run() method
* Comparator which has compareTo()
* 3. Default Methods: Starting Java 8, we can also add default methods to interfaces.
* We can define any number of default methods in functional interface but there should be one
* and only one abstract method.
* 4. Predicates.
* 5. Functions.
* 6. Stream API.
*/

@FunctionalInterface
public interface MyFuncInterface {
    // Functional interface - If an interface has one and only one abstract method,
    // then it's called a functional interface. And that abstract method is called functional method.
    void myMethod();
}
