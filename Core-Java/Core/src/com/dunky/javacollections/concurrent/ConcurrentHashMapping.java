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
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapping implements Runnable{

    static ConcurrentHashMap<String, String> courseRating = new ConcurrentHashMap<String, String>();

    private static void addCourse() {
        courseRating.put("Java", "5.0");
        courseRating.put("AWS", "4.5");
        courseRating.put("Node", "4.7");
        courseRating.put("Mathematics", "4.8");
        courseRating.put("Docker", "4.9");
        courseRating.put("AI/ML", "5.0");

        Iterator<String> iter = courseRating.keySet().iterator();
        while(iter.hasNext()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
            String course = iter.next();
            if(course.equals("Docker")) {
                courseRating.get(course);
            }
            System.out.println(courseRating);
        }
        System.out.println("\nFinal list of courses after operation: " + courseRating);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread  got interrupted");
        }
        courseRating.put("Kubernetes", "4.8");
    }


    public static void main(String[] args) {
        // ArrayListProblem
        ConcurrentHashMapping concurrent = new ConcurrentHashMapping();
        concurrent.run();
        addCourse();

    }
}
