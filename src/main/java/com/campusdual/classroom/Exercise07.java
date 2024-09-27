package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(5);  // Cambia este número para probar diferentes entradas
        sumFirstNaturalNumbers(5);  // Cambia este número para probar diferentes entradas
        showFirstNaturalNumbers(5);  // Cambia este número para probar diferentes entradas
    }


    public static void positionInAList(int num) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }

        int index = numbers.indexOf(num);

        if (index != -1) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + index);
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }


    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma de los primeros " + num + " números positivos es: " + sum);
    }

    public static void showFirstNaturalNumbers(int num) {
        System.out.print("Los primeros " + num + " números positivos son: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + (i < num ? ", " : "."));
        }
        System.out.println();  // Nueva línea al final
    }
}
