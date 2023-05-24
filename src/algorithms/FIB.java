package algorithms;

// El método de Fibonacci toma un número entero n como entrada y devuelve el número de Fibonacci en la posición n
public class FIB {

    /**
     * La función calcula el número de Fibonacci en la posición `n` usando programación dinámica
     * @param n: número entero que representa la posición del número de Fibonacci
     * @return el número de Fibonacci en la posición `n`
     */
    public static long fibonacci(int n) {

        // Declare an array to store Fibonacci numbers.
        long[] fibArray = new long[n + 1];

        // base cases
        fibArray[0] = 0;
        fibArray[1] = 1;

        // Calculate and store Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        // Return the Fibonacci number at position n
        return fibArray[n];
    }

}