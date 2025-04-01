/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpvideo;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TPvideo {

    public static void main(String[] args) {
        ListaDoble listita = new ListaDoble();
        int opcion = 0, elemento;
        
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo al Inicio\n"
                                + "2. Agregar un Nodo al Final\n"
                                + "3. Mostrar la lista de Inicio a Fin\n"
                                + "4. Mostrar la lista de Fin a Inicio\n"
                                + "5. Salir\n"
                                + "¿Qué deseas hacer?", "Menú de Opciones",
                                JOptionPane.INFORMATION_MESSAGE));
                
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Ingrese el elemento del Nodo",
                                "Agregando Nodo al Inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.AgregarInicio(elemento);
                        break;
                        
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(
                                null, "Ingrese el elemento del Nodo",
                                "Agregando Nodo al Final",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.Agregarfinal(elemento); // Asegúrate de que el método existe y se llama correctamente
                        break;
                        
                    case 3:
                        if (!listita.estVacia()) {
                            listita.MostrarListaInicioFin(); // Asegúrate de que el método exista
                        } else {
                            JOptionPane.showMessageDialog(
                                    null, "No hay Nodos ahora",
                                    "Lista Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4:
                        if (!listita.estVacia()) {
                            listita.MostrarListaFinInicio(); // Asegúrate de que el método exista
                        } else {
                            JOptionPane.showMessageDialog(
                                    null, "No hay Nodos ahora",
                                    "Lista Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Error, la opción no está en el menú", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
            }
            
        } while (opcion != 5);
    }
}
