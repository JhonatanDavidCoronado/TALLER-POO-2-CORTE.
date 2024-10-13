/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author Personal
 */
public class Automovil {

    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
         String marca;
    String modelo;
    int año;

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    public void arrancar() {
        System.out.println("El automóvil ha arrancado");
    }

    public void acelerar(int velocidad) {
        System.out.println("El automóvil está acelerando a " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        Automovil toyota = new Automovil();
        toyota.marca = "Toyota";
        toyota.modelo = "Corolla";
        toyota.año = 2020;
        toyota.mostrarDatos();
        toyota.arrancar();
        toyota.acelerar(120);

        Automovil ford = new Automovil();
        ford.marca = "Ford";
        ford.modelo = "Mustang";
        ford.año = 2022;
        ford.mostrarDatos();
        ford.arrancar();
        ford.acelerar(150);
    }
}



    
    

