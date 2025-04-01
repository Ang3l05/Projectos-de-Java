/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_code;

import javax.swing.JOptionPane;

public class Prueba_Code {

    public static void main(String[] args) {
        int Op = 0; // Variable para la opción del menú

        while (true) {
            try {
                // Mostrar menú y capturar la opción como entero
                String input = JOptionPane.showInputDialog(null, "-- Menú --\n"
                        + "1. Suma\n"
                        + "2. Resta\n"
                        + "3. Multiplicación\n"
                        + "4. Salir\n"
                        + "Seleccione una opción:");

                if (input == null) {
                    // Si el usuario cierra el cuadro de diálogo
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                }

                Op = Integer.parseInt(input); // Convierte el input a un número entero

                if (Op < 1 || Op > 4) {
                    // Validar si la opción está fuera del rango permitido
                    JOptionPane.showMessageDialog(null, "Error: La opción no está en la lista.");
                    continue;
                }

                switch (Op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Has seleccionado: Suma.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado: Resta.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Has seleccionado: Multiplicación.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        return; // Termina la ejecución del programa
                }

            } catch (NumberFormatException e) {
                // Capturar el error si el usuario ingresa algo que no es un número
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido.");
            }
        }
    }
}

