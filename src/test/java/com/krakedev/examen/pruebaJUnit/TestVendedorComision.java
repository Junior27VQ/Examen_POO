package com.krakedev.examen.pruebaJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.krakedev.examen.VendedorComision;


public class TestVendedorComision {
	@Test
    public void validarCalcularSueldoComision() {
        // 1. Escenario
		VendedorComision vc = new VendedorComision("87654321", "C");
        
        double comision = 50.0;
        int ventas = 10;
        double esperado = 500.0; // 50 * 10

        // Usamos los setters heredados de la clase padre
        vc.setComisionPorVentas(comision);
        vc.setNumeroVentas(ventas);

        // 2. Ejecución
        double resultadoReal = vc.calcularSueldo();

        // 3. Verificación
        assertEquals(esperado, resultadoReal, 0.001, "El cálculo de comisión debe ser (comisión * ventas).");
    }

    @Test
    public void validarHerenciaCedula() {
        String cedulaEsperada = "999999";
        String tipo = "M";
        VendedorComision vc = new VendedorComision(cedulaEsperada, tipo);
        
        // Verificamos que la clase hija realmente recibió la cédula a través del constructor super()
        assertEquals(cedulaEsperada, vc.getCedula(), "La cédula debe heredarse correctamente de la clase padre.");
    }
    
}
