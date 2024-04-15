package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
       //Implementar solución
       Random rand = new Random();
        int numeroAleatorio = rand.nextInt(max_numero - min_numero + 1) + min_numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivinar el número");
        System.out.println("Se ha generado un número aleatorio entre " + min_numero + " y " + max_numero + ". Tienes " + max_intentos + " intentos para adivinarlo.");

        for (int intento = 1; intento <= max_intentos; intento++) {
            System.out.print("Intento #" + intento + ": Introduce un numero: ");
            int suposicion = scanner.nextInt();

            if (suposicion == numeroAleatorio) {
                System.out.println("Felicidades Has adivinado el número en " + intento + " intentos");
                return;
            } else {
                if (suposicion < numeroAleatorio) {
                    System.out.println("El número aleatorio es mayor.");
                } else {
                    System.out.println("El número aleatorio es menor.");
                }
            }
        }
        System.out.println("Lo siento, ya no quedan mas intentos, El número aleatorio era: " + numeroAleatorio);
    }
    }