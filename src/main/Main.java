package main;
import algorithms.KP;
import algorithms.MED;
import algorithms.FIB;

public class Main {
    public static void main(String[] args) {

        // KP algorithm
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int numItems = 4;
        int capacity = 8;

        int maxValue = KP.knapsackDP(weights, values, numItems, capacity);
        System.out.println("Maximum value: " + maxValue);

        // MED algorithm
        String s = "marta";
        String t = "marciano";

        MED ob = new MED();

        int ans = ob.editDistance(s, t);
        System.out.println("The total number of operations to convert "+ s +" to "+ t +" is: " + ans);

        // Fibonacci algorithm
        int n = 10;
        FIB ob2 = new FIB();
        long fib = ob2.fibonacci(n);
        System.out.println("The number at position " + n + " in the Fibonnaci sequence is: " + fib);
    }

}