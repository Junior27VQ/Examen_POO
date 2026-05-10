package com.krakedev.examen.pruebaJUnit;
	
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.krakedev.examen.Vendedor;

public class TestPruebaJUnit {
	@Test
    public void validarCalcularSueldo() {
        // 1. Escenario (Arrange): Creamos el objeto con la cédula requerida
        Vendedor vendedor = new Vendedor("12345678");
        
        // Definimos un sueldo de prueba
        double sueldoEsperado = 1500.50;
        vendedor.setSueldoFijo(sueldoEsperado);

        // 2. Ejecución (Act): Llamamos al método que queremos probar
        double resultadoReal = vendedor.calcularSueldo();

        // 3. Verificación (Assert): Comparamos si el resultado es el esperado
        // El tercer parámetro (0.001) es el "delta" para manejar precisión de decimales (double)
        assertEquals(sueldoEsperado, resultadoReal, 0.001, "El sueldo retornado debe ser igual al sueldo fijo asignado.");
    }
	
}
