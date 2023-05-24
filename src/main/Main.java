package main;
import algorithms.KP;

public class Main {
    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int numItems = 4;
        int capacity = 8;

        int maxValue = knapsackDP(weights, values, numItems, capacity);
        System.out.println("Maximum value: " + maxValue);
    }

}