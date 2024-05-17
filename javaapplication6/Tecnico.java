/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mecha
 */
// Clase concreta Tecnico que hereda de la clase Empleado
class Tecnico extends Empleado {
    // Atributos específicos para el técnico: sueldo básico, horas extras, y plus por producción
    private final double sueldoBasico = 1500;
    private final int horasExtras = 200;
    private final double plusProduccion = sueldoBasico * 0.1;
    
    // Constructor de la clase Tecnico que llama al constructor de la clase Empleado
    public Tecnico(String nombre, String dni) {
        super(nombre, dni);
    }
    
    // Implementación del método calcularSalario() para calcular el salario del técnico
    @Override
    public double calcularSalario() {
        return sueldoBasico + (sueldoBasico * 0.5 * horasExtras) + plusProduccion;
    }
}
