/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.espacio_practicajava;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Espacio_PracticaJava {
    public static void main(String[] args) {
        Scanner Myscanner = new Scanner (System.in);
        int op;
        System.out.println("\tMenu");
        System.out.println("\t1.Suma");
        System.out.println("\t2.Resta");
        System.out.println("\t3.Salir");
        op = Myscanner.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese Primer numero");
                int num1 = Myscanner.nextInt();
                System.out.println("Ingrese Segundo numero");
                int num2 =Myscanner.nextInt();
                int suma = num1 + num2;
                System.out.println("La resta es :"+ suma);
                break;
            case 2:
                System.out.println("Ingrese Primer numero");
                num1 = Myscanner.nextInt();
                System.out.println("Ingrese Segundo numero");
                num2 =Myscanner.nextInt();
                int resta = num1 - num2;
                System.out.println("La resta es :"+ resta);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
