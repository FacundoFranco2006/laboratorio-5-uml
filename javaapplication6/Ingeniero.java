/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mecha
 */
// Clase concreta Ingeniero que hereda de la clase Empleado
class Ingeniero extends Empleado {
    // Atributos específicos para el ingeniero: sueldo básico y plus por producción
    private final double sueldoBasico = 3000;
    private final double plusProduccion = sueldoBasico * 0.1;
    
    // Constructor de la clase Ingeniero que llama al constructor de la clase Empleado
    public Ingeniero(String nombre, String dni) {
        super(nombre, dni);
    }
    
    // Implementación del método calcularSalario() para calcular el salario del ingeniero
    @Override
    public double calcularSalario() {
        return sueldoBasico + plusProduccion;
    }
}


