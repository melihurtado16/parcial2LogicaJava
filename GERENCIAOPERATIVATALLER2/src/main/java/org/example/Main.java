package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //EMPRESA TUYA: HECHO POR JHORMAN SALAZAR Y MELISSA HURTADO

        String nombreCliente, apellidoCliente;
        Byte edadCliente;
        Byte numeroUsosTarjetaMes;
        Double montoProductosAseo;
        Double montoProductosAlimenticios;
        Double montoProductosOtros;
        Double deudaTotal;
        Double descuentoPuntaje;
        String numeroPuntaje;


        Scanner Sc= new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("BIENVENIDO A EMPRESA TUYA");
        System.out.println("Ingresa por favor tu nombre:");
        nombreCliente = Sc.nextLine();
        System.out.println("Ingresa por favor tu apellido:");
        apellidoCliente = Sc.nextLine();
        System.out.println("Cuantos años tienes?");
        edadCliente = Sc.nextByte();
        System.out.println("Cuantos usos le diste a tu tarjeta TUYA este mes?");
        numeroUsosTarjetaMes = Sc.nextByte();
        System.out.println("Cual es el valor de lo que compraste este mes en productos de aseo?");
        montoProductosAseo = Sc.nextDouble();
        System.out.println("Cual es el valor de lo que compraste este mes en productos alimenticios?");
        montoProductosAlimenticios = Sc.nextDouble();
        System.out.println("Cual es el valor de lo que compraste este mes en OTROS productos?");
        montoProductosOtros = Sc.nextDouble();
        deudaTotal = (montoProductosAseo + montoProductosAlimenticios + montoProductosOtros);

        System.out.println("Hola "+nombreCliente + " " + apellidoCliente);
        if (deudaTotal>900000){
            descuentoPuntaje = 0.25;
            numeroPuntaje = "1";
            deudaTotal= deudaTotal-(deudaTotal*descuentoPuntaje);
            System.out.println("Tu descuento es de: " + descuentoPuntaje + "%" + " y el total de tu deuda queda en: " + deudaTotal);
        }

        else if (deudaTotal<900000 && deudaTotal>700000){
            descuentoPuntaje = 0.20;
            numeroPuntaje = "2";
            deudaTotal= deudaTotal-(deudaTotal*descuentoPuntaje);
            System.out.println("Tu descuento es de: " + descuentoPuntaje + "%" + " y el total de tu deuda queda en: " + deudaTotal);

        }

        else if (deudaTotal<700000 && deudaTotal>500000){
            descuentoPuntaje = 0.15;
            numeroPuntaje = "3";
            deudaTotal= deudaTotal-(deudaTotal*descuentoPuntaje);
            System.out.println("Tu descuento es de: " + descuentoPuntaje + "%" + " y el total de tu deuda queda en: " + deudaTotal);

        }

        else if (deudaTotal<500000 && deudaTotal>300000){
            descuentoPuntaje = 0.10;
            numeroPuntaje = "4";
            deudaTotal= deudaTotal-(deudaTotal*descuentoPuntaje);
            System.out.println("Tu descuento es de: " + descuentoPuntaje + "%" + " y el total de tu deuda queda en: " + deudaTotal);

        }
        else {
            System.out.println("Lamentablemente no aplicas para un auxilio, tu deuda total queda en: " + deudaTotal);

        }
    }
}


