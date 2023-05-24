package algorithms;
import java.util.*;

// Minimum Edit Distance -- Dan Jurafsky (Stanford University, 2009)
public class MED {

    // space optimization

    /**
     * El método utiliza programación dinámica para calcular la cantidad mínima de operaciones (inserciones,
     * eliminaciones y sustituciones) necesarias para convertir una cadena en otra.
     *
     * Utiliza dos matrices para almacenar las distancias de edición mínimas para diferentes subproblemas e itera sobre
     * los caracteres de las cadenas para calcular la solución óptima.
     *
     * @param s: cadena 1 a comparar
     * @param t: cadena 2 a comparar
     * @return la cantidad mínima de operaciones necesarias para convertir una cadena en otra
     */
    public int editDistance(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] prev = new int[m + 1];
        int[] curr = new int[m + 1];

        for (int j = 0; j <= m; j++) {
            prev[j] = j;
        }

        for (int i = 1; i <= n; i++) {
            curr[0] = i;
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    curr[j] = prev[j - 1];
                }
                else {
                    int mn = Math.min(1 + prev[j],
                            1 + curr[j - 1]);
                    curr[j] = Math.min(mn, 1 + prev[j - 1]);
                }
            }
            prev = curr.clone();
        }

        return prev[m];
    }


}