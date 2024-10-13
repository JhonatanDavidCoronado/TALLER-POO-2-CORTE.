/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maestro;

/**
 *
 * @author Personal
 */
public class Maestro {

    /**
     * @param args the command line arguments
     */
       String nombre;
    String materia;
    int edad;

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Materia: " + materia);
        System.out.println("Edad: " + edad);
    }

    public void impartirClase(String alumno) {
        System.out.println("El maestro " + nombre + " está impartiendo una clase a " + alumno);
    }

    public void calificarExamen(int calificacion) {
        System.out.println("El maestro " + nombre + " ha calificado el examen con una calificación de " + calificacion);
    }

    public static void main(String[] args) {
        Maestro maestro1 = new Maestro();
        maestro1.nombre = "Juan";
        maestro1.materia = "Matemáticas";
        maestro1.edad = 35;
        maestro1.mostrarDatos();
        maestro1.impartirClase("Carlos");
        maestro1.calificarExamen(8);

        Maestro maestro2 = new Maestro();
        maestro2.nombre = "Ana";
        maestro2.materia = "Lengua";
        maestro2.edad = 28;
        maestro2.mostrarDatos();
        maestro2.impartirClase("María");
        maestro2.calificarExamen(9);
    }
    
}
