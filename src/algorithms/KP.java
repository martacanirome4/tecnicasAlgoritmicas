package algorithms;

// The Knapsack Problem (KP) (problema de la mochila)
/**
 * Disponemos de n objetos de valores vi(i:1...n) y pesos pi(i:1...n) respectivamente
 * Queremos cargar una mochila con una coleccion de esos objetos que maximice la suma
 * de los valores transportados
 * La capacidad maxima de la mochila es M ≥ 0
 */
public class KP {

    /**
     * La función calcula el valor máximo que se puede obtener seleccionando un subconjunto de elementos,
     * de modo que la suma de sus pesos no supere la capacidad máxima `W`.
     *
     * Usa programación dinámica para construir una tabla (`m`) donde cada celda representa el valor máximo
     * que se puede lograr para una combinación específica de artículos y capacidad de peso
     * Al considerar iterativamente cada artículo y su peso, el código llena la tabla y, en última instancia,
     * devuelve el valor máximo alcanzable para el problema de mochila dado
     *
     * @param w: matriz que representa los pesos de los elementos
     * @param v: matriz que representa los valores de los elementos
     * @param n: número entero que representa el número de elementos
     * @param W: número entero que representa la capacidad máxima de peso de la mochila
     * @return el valor máximo que se puede obtener seleccionando elementos de la matriz dentro de la capacidad de peso,
     * que se almacena en `m[n][W]`
     */
    public static int knapsackDP(int[] w, int[] v, int n, int W) {
        if (n <= 0 || W <= 0) {
            return 0;
        }

        int[][] m = new int[n + 1][W + 1];
        for (int j = 0; j <= W; j++) {
            m[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (w[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = Math.max(
                            m[i - 1][j],
                            m[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }
        return m[n][W];
    }

}