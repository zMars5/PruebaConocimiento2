package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcion = 0;
        String nombrePeluche = null;
        Integer precioUnitario = null;
        Double costoVenta = 0.0;
        Double costoVentaIVA = 0.0;
        Integer precioNuevo;

        System.out.println("TIENDA PELUCHITOS");
        System.out.println("MENU: ");
        System.out.println("1. AGREGA NOMBRE Y PRECIO UNITARIO");
        System.out.println("2. CALCULA EL COSTO DE VENTA COMO PRECIO UNITARIO + IVA 19%");
        System.out.println("3. MUESTRA INFORMACION DEL NUEVO PELUCHE");
        System.out.println("4. EDITAR EL PRECIO UNITARIO DE NUEVO PELUCHE");
        System.out.println("5. SALIR");
        System.out.print("Digita la opcion: ");
        opcion = scanner.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste la opcion n1");
                    System.out.println("Agrega el nombre");
                    nombrePeluche = scanner.next();
                    System.out.println("Agrega el precio unitario");
                    precioUnitario = scanner.nextInt();
                    System.out.print("Digita otra opcion: ");
                    opcion = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Elegiste la opcion n2");
                    Double costoIva = 0.19;
                    costoVenta = precioUnitario * costoIva;
                    costoVentaIVA = precioUnitario + costoVenta;
                    System.out.println("El costo de venta es de: " + costoVentaIVA);
                    System.out.print("Digita otra opcion: ");
                    opcion = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Elegiste la opcion n3");
                    System.out.println("La informacion del peluche es: Nombre: " + nombrePeluche + ", Precio: " + precioUnitario + ", Costo venta: " + costoVentaIVA);
                    System.out.print("Digita otra opcion: ");
                    opcion = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Elegiste la opcion n4");
                    System.out.println("Edita el precio del peluche");
                    precioUnitario = scanner.nextInt();
                    System.out.println("El nuevo precio del peluche es: " + precioUnitario);
                    costoIva = 0.19;
                    costoVenta = precioUnitario * costoIva;
                    costoVentaIVA = precioUnitario + costoVenta;
                    System.out.println("El precio actualizado del peluche con el IVA aplicado es de: " + costoVentaIVA);
                    System.out.print("Digita otra opcion: ");
                    opcion = scanner.nextInt();
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 5);
        System.out.println("Gracias, Hasta pronto...");
    }
}