package com.dunky.javacollections.concurrent;

/*
* When we use Collections such as ArrayList, HashMap, HashSet
* We will have to use synchronization (attain lock) to achieve Thread Safety which degrades performance.
* Additionally, Fail Fast iterator scenario when looping through a collection while at the same time
* we try to access and manipulate the collections, will trigger ConcurrentModificationException.
*
* Concurrent Collections introduced in Java 1.5, CopyOnWriteArrayList,
* CopyOnWriteArraySet, ConcurrentHashMap, come to the rescue.
*
* USE CASE; Applied for too many reads with few writes.
*/

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayList implements Runnable{

    static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();

    private static void addCourse() {
        courses.add("Java");
        courses.add("AWS");
        courses.add("Node");
        courses.add("Mathematics");
        courses.add("Docker");
        courses.add("AI/ML");

        Iterator<String> itr = courses.iterator();
        while(itr.hasNext()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
            String course = itr.next();
            if(course.equals("Docker")) {
                courses.remove(course);
            }
            System.out.println(course);
        }
        System.out.println("\nFinal list of courses after operation: " +courses);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread  got interrupted");
        }
        courses.add("Kubernetes");
    }


    public static void main(String[] args) {
        // ArrayListProblem
        ConcurrentArrayList concurrent = new ConcurrentArrayList();
        concurrent.run();
        addCourse();

    }
}
