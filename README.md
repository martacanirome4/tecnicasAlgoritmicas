# 🧮 Técnicas Algorítmicas - Programación Dinámica

![Java](https://img.shields.io/badge/language-Java-orange)
![License](https://img.shields.io/badge/license-Apache_2.0-lightgrey)

### 📊 Este repositorio contiene implementaciones prácticas de **programación dinámica** para resolver problemas clásicos de optimización y secuencias.

---

## 📂 Contenido

1. 🌀 **Fibonacci** – Cálculo eficiente de la sucesión.
2. 🎒 **Problema de la Mochila (0/1)** – Optimización del valor en espacio limitado.
3. ✍️ **Distancia Mínima de Edición** – Transformación óptima de cadenas.

---

## 🌀 Secuencia Fibonacci

La **sucesión de Fibonacci** es una serie donde cada número es la suma de los dos anteriores.  
Implementación: `FIB.java`  
🔹 Usa **memorización** con un array para evitar cálculos redundantes.  
🔹 Complejidad reducida a **O(n)**.

```java
fib[0] = 0;
fib[1] = 1;
for (int i = 2; i <= n; i++) {
    fib[i] = fib[i-1] + fib[i-2];
}
```

---

## 🎒 Problema de la Mochila (0/1)

Dado un conjunto de objetos con **pesos y valores**, el objetivo es maximizar el valor total sin exceder la capacidad de la mochila.

Implementación: `KP.java`  
🔹 Algoritmo **bottom-up** con tabla de DP.  
🔹 Complejidad: **O(n·W)** donde n = objetos, W = capacidad.

> Usa tabla `dp[i][w]` que guarda el valor máximo para i objetos y capacidad w.

---

## ✍️ Distancia Mínima de Edición

Calcula el **mínimo número de operaciones** (insertar, eliminar, sustituir) para transformar una cadena en otra.

Implementación: `MED.java`  
🔹 Tabla de DP: `dp[i][j]` = distancia entre los primeros i y j caracteres.  
🔹 Complejidad: **O(m·n)** para cadenas de longitud m y n.

```java
if (s1.charAt(i) == s2.charAt(j)) {
    dp[i][j] = dp[i-1][j-1];
} else {
    dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);
}
```

---

## 🛠️ Uso

Compilar y ejecutar desde terminal (requiere Java JDK):

```bash
git clone <repo-url>
cd <repositorio>
make compilar
make ejecutar
```

🔸 Los resultados se mostrarán por consola.

> También puedes usar cualquier IDE (Eclipse, IntelliJ) para ejecutar los archivos individuales.

---

## 📚 Aprendizaje Clave

| Algoritmo                | Idea Principal                    | DP Técnica             |
|-------------------------|-----------------------------------|------------------------|
| Fibonacci               | Subproblemas solapados            | Memorización / Tablas  |
| Mochila 0/1             | Máximo valor sin exceder peso     | Bottom-up tabular      |
| Distancia Edición       | Transformar cadena → cadena       | Tabla con min operaciones |

> La programación dinámica permite **eficiencia** y evita cálculos repetidos.

---

## 👩‍💻 Autora

Marta Canino Romero – 2023  
[GitHub](https://github.com/martacanirome4)

---

## 📄 Licencia

Licensed under the Apache License 2.0 – [Ver licencia](http://www.apache.org/licenses/LICENSE-2.0)
