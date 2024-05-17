/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author mecha
 */
// Clase concreta Operario que hereda de la clase Empleado
class Operario extends Empleado {
    // Atributos específicos para el operario: sueldo básico, horas extras, y plus por producción
    private final double sueldoBasico = 750;
    private final int horasExtras = 200;
    private final double plusProduccion = sueldoBasico * 0.1;
    
    // Constructor de la clase Operario que llama al constructor de la clase Empleado
    public Operario(String nombre, String dni) {
        super(nombre, dni);
    }
    
    // Implementación del método calcularSalario() para calcular el salario del operario
    @Override
    public double calcularSalario() {
        return sueldoBasico + (sueldoBasico * 0.5 * horasExtras) + plusProduccion;
    }
}
