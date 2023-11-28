package ru.javalab3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A class for testing the performance of the ArrayList and LinkedList classes.
 */
public class Timer {
    /**
     * Number of iterations during execution of method testing.
     */
    long iterations = 0;

    /**
     * An instance of the ArrayList class under test.
     */
    ArrayList<Integer> arrayList = new ArrayList<>();
    /**
     * An instance of the LinkedList class under test
     */
    LinkedList<Integer> linkedList = new LinkedList<>();

    /**
     * Default constructor
     */
    public Timer() {
        this.iterations = 0;
    }

    /**
     * Constructor with setting the number of iterations during testing.
     * @param iterations number of iterations during testing.
     */
    public Timer(long iterations) {
        this.iterations = iterations;
    }

    /**
     * Setter to change the number of iterations during testing.
     * @param newIterations new number of iterations
     */
    public void setIterations(long newIterations) {
        this.iterations = newIterations;
    }

    /**
     * Method for testing the Add method of the ArrayList class.
     * @param arrayList an instance of the ArrayList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfGetArrayList(ArrayList)
     * @see Timer#timeOfSetArrayList(ArrayList)
     * @see Timer#timeOfRemoveArrayList(ArrayList)
     */
    public long timeOfAddArrayList(ArrayList<Integer> arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }
        long stop = System.nanoTime();
        return stop - start;
    }
    /**
     * Method for testing the Get method of the ArrayList class.
     * @param arrayList an instance of the ArrayList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfAddArrayList(ArrayList)
     * @see Timer#timeOfSetArrayList(ArrayList)
     * @see Timer#timeOfRemoveArrayList(ArrayList)
     */
    public long timeOfGetArrayList(ArrayList<Integer> arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int value = arrayList.get(i);
        }
        long stop = System.nanoTime();
        return stop - start;
    }
    /**
     * Method for testing the Set method of the ArrayList class.
     * @param arrayList an instance of the ArrayList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfAddArrayList(ArrayList)
     * @see Timer#timeOfGetArrayList(ArrayList)
     * @see Timer#timeOfRemoveArrayList(ArrayList)
     */
    public long timeOfSetArrayList(ArrayList<Integer> arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int value = arrayList.set(i, 1);
        }
        long stop = System.nanoTime();
        return stop - start;
    }
    /**
     * Method for testing the Remove method of the ArrayList class
     * @param arrayList an instance of the ArrayList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfAddArrayList(ArrayList)
     * @see Timer#timeOfGetArrayList(ArrayList)
     * @see Timer#timeOfSetArrayList(ArrayList)
     */
    public long timeOfRemoveArrayList(ArrayList<Integer> arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        long stop = System.nanoTime();
        return stop - start;
    }

    /**
     * Method for testing the Add method of the LinkedList class
     * @param linkedList an instance of the LinkedList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfGetLinkedList(LinkedList)
     * @see Timer#timeOfSetLinkedList(LinkedList)
     * @see Timer#timeOfRemoveLinkedList(LinkedList)
     */
    public long timeOfAddLinkedList(LinkedList<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }
        long stop = System.nanoTime();
        return stop - start;
    }
    /**
     * Method for testing the Get method of the LinkedList class
     * @param linkedList an instance of the LinkedList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfAddLinkedList(LinkedList)
     * @see Timer#timeOfSetLinkedList(LinkedList)
     * @see Timer#timeOfRemoveLinkedList(LinkedList)
     */
    public long timeOfGetLinkedList(LinkedList<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int value = linkedList.get(i);
        }
        long stop = System.nanoTime();
        return stop - start;
    }
    /**
     * Method for testing the Set method of the LinkedList class
     * @param linkedList an instance of the LinkedList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfAddLinkedList(LinkedList)
     * @see Timer#timeOfGetLinkedList(LinkedList)
     * @see Timer#timeOfRemoveLinkedList(LinkedList)
     */
    public long timeOfSetLinkedList(LinkedList<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int value = linkedList.set(i, 1);
        }
        long stop = System.nanoTime();
        return stop - start;
    }
    /**
     * Method for testing the Remove method of the LinkedList class
     * @param linkedList an instance of the LinkedList class
     * @return execution time of a given number of iterations in nanoseconds
     * @see Timer#timeOfAddLinkedList(LinkedList)
     * @see Timer#timeOfGetLinkedList(LinkedList)
     * @see Timer#timeOfSetLinkedList(LinkedList)
     */
    public long timeOfRemoveLinkedList(LinkedList<Integer> linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        long stop = System.nanoTime();
        return stop - start;
    }

    /**
     * A method that performs full testing of the ArrayList and LinkedList classes and displays the test results on
     * the screen in the form of a table.
     */
    public void runFullTest() {
        System.out.printf("%-20s%-25s%-25s%n", "Method", "Number of operations", "Execution time (ns)");
        System.out.println("_____________________________________________________________________________________________");
        System.out.printf("%-20s%-25d%-25d%n", "ArrayList.add", iterations, timeOfAddArrayList(arrayList));
        System.out.printf("%-20s%-25d%-25d%n", "ArrayList.get", iterations, timeOfGetArrayList(arrayList));
        System.out.printf("%-20s%-25d%-25d%n", "ArrayList.set", iterations, timeOfSetArrayList(arrayList));
        System.out.printf("%-20s%-25d%-25d%n", "ArrayList.remove", iterations, timeOfRemoveArrayList(arrayList));
        System.out.println("_____________________________________________________________________________________________");
        System.out.printf("%-20s%-25d%-25d%n", "LinkedList.add", iterations, timeOfAddLinkedList(linkedList));
        System.out.printf("%-20s%-25d%-25d%n", "LinkedList.get", iterations, timeOfGetLinkedList(linkedList));
        System.out.printf("%-20s%-25d%-25d%n", "LinkedList.set", iterations, timeOfSetLinkedList(linkedList));
        System.out.printf("%-20s%-25d%-25d%n", "LinkedList.remove", iterations, timeOfRemoveLinkedList(linkedList));
    }
}


