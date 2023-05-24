# Técnicas Algorítmicas - Algoritmos de programación dinámica

Este repositorio contiene implementaciones de tres algoritmos de programación dinámica: La secuencia de Fibonacci, El problema de la mochila y El problema de distancia mínima de edición.

## Secuencia Fibonacci

La sucesión de Fibonacci es una serie de números en los que cada número es la suma de los dos anteriores. En este repositorio, hemos implementado un enfoque de programación dinámica para calcular de manera eficiente los números de Fibonacci hasta una posición determinada.

La implementación está disponible en el archivo `FIB.java`. Utiliza una matriz para almacenar números de Fibonacci previamente calculados, evitando cálculos redundantes y brindando una solución optimizada.

## Problema de la mochila

El problema de la mochila es un problema de optimización clásico que consiste en seleccionar elementos de un conjunto para maximizar el valor total y mantener el peso total dentro de un límite determinado. La implementación en este repositorio resuelve el problema de la mochila 0/1 usando programación dinámica.

La implementación está disponible en el archivo `KP.java`. Utiliza un enfoque de programación dinámica para encontrar de manera eficiente el valor máximo que se puede lograr seleccionando elementos, teniendo en cuenta sus pesos y valores.

## Distancia mínima Editar

El problema de edición de distancia mínima implica encontrar el número mínimo de operaciones (inserciones, eliminaciones, sustituciones) necesarias para convertir una cadena en otra. Se ha implementado una solución de programación dinámica para calcular de manera eficiente la distancia mínima de edición entre dos cadenas.

La implementación está disponible en el archivo `MED.java`. Utiliza un enfoque de programación dinámica eficiente en el espacio para calcular el número mínimo de operaciones requeridas para transformar una cadena en otra.

## Uso

Cada implementación de algoritmo se puede compilar y ejecutar individualmente. El repositorio incluye código de muestra en los archivos respectivos para demostrar cómo usar los algoritmos desde la clase 'Main'.

Para compilar y ejecutar los algoritmos, asegúrese de tener instalado el Kit de desarrollo de Java (JDK) en su sistema. Utilice cualquier IDE de Java o herramientas de línea de comandos para compilar y ejecutar los archivos individuales.
Como se especifica en el archivo 'makefile' incluido, los pasos para compilar y ejecutar el proyecto son los siguientes:
1. Abra una ventana de terminal
2. Clone este repositorio (con git clone <url>)
3. Navege hasta el repositorio en su sistema local
4. Ejecute el comando: make compilar
5. Ejecute el comando: make ejecutar
El programa imprimirá los resultados por terminal.
