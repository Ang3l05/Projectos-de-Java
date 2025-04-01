package com.mycompany.proyecto2;
import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) {
        Scanner Miescaner = new Scanner(System.in);
        String cadena;}
    
        char caracter;
        System.out.println("Ingrese su nombre");
        cadena = Entrada.nextLine();
        System.out.println("Su nombre es: "+cadena);
        System.out.println("Ingresa un caracter");
        caracter = Entrada.next().charAt(0);
        System.out.println("Un caracter: "+ caracter);
    }
}
