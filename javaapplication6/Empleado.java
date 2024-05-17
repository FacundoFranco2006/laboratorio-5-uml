/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mecha
 */
abstract class Empleado {
    protected String nombre; // Atributo para almacenar el nombre del empleado
    protected String dni; // Atributo para almacenar el DNI del empleado
    
    // Constructor de la clase Empleado
    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Método abstracto que debe ser implementado por las subclases para calcular el salario del empleado
    public abstract double calcularSalario();
}