/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mecha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de cada tipo de empleado
        Tecnico tecnico = new Tecnico("Juan", "12.345.678");
        Operario operario = new Operario("Pedro", "87.654.321");
        Ingeniero ingeniero = new Ingeniero("María", "56.781.234");
        
        // Imprimir el salario de cada empleado
        System.out.println("Salario de " + tecnico.nombre + ": $" + tecnico.calcularSalario());
        System.out.println("Salario de " + operario.nombre + ": $" + operario.calcularSalario());
        System.out.println("Salario de " + ingeniero.nombre + ": $" + ingeniero.calcularSalario());
    }
    
}
