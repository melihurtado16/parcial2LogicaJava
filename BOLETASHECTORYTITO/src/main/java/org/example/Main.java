package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hecho por Melissa Hurtado Velez y Jhorman Andres Salazar Quiroz
        String cedulaComprador, nombreComprador, apellidoComprador, ciudadComprador;
        Byte edadComprador, numeroBoletasComprador = 0;
        Integer valorBoleta = 450000;
        Scanner sc  = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Bienvenido a la compra de boletas para las glorias del reggaeton");
        System.out.println("Por favor ingresa tu nombre: ");
        nombreComprador = sc.nextLine();
        System.out.println("Por favor ingresa tu apellido: ");
        apellidoComprador = sc.nextLine();
        System.out.println("Por favor ingresa en que ciudad vives: ");
        ciudadComprador = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        edadComprador = sc.nextByte();

        if (edadComprador > 18) {
            System.out.println("Ingresa tu número de cédula: ");
            cedulaComprador = sc.nextLine();
            System.out.println("Cuantas boletas deseas comprar:");
            numeroBoletasComprador = sc.nextByte();
            if (numeroBoletasComprador <= 4) {
                Integer valorTotal = numeroBoletasComprador * valorBoleta;
                System.out.println("Hola "+ nombreComprador + " " + apellidoComprador);
                System.out.println("El valor total de tu compra es de: " + valorTotal);
            }
            else {
                System.out.println("No puedes comprar mas de 4 boletas");
            }

        } else {
            System.out.println("Eres menor de edad y no puedes entrar ni comprar boletas, madafaka.");
        }
    }
}