package com.mycompany.programacionobjetos;

public class ProgramacionObjetos {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setId(1);
        persona1.setNombre("Mario");
        persona1.setApellido("Lopez");
        persona1.setEdad(12);
        System.out.println("Personaje");
        
         // Crear una instancia de Persona usando el constructor con parámetros
        Persona persona2 = new Persona(2, "Maria", "Gomez", 25);

        // Mostrar información de las personas
        System.out.println("Persona 1: " + persona1.getNombre() + " " + persona1.getApellido() + ", Edad: " + persona1.getEdad());
        System.out.println("Persona 2: " + persona2.getNombre() + " " + persona2.getApellido() + ", Edad: " + persona2.getEdad());
        
    }
}
