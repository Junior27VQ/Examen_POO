package com.krakedev.examen.pruebaJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.krakedev.examen.VendedorMixto;

public class TestVendedorMixto {
	@Test
    public void validarCalcularSueldoMixtoConPorcentaje() {
        // 1. Escenario (Arrange)
        VendedorMixto vm = new VendedorMixto("55667788", "A");
        
        double sueldoFijo = 2000.0;
        int ventas = 5;
        
        // Cálculo manual para el esperado:
        // 1% de 2000 = 20
        // 20 * 5 ventas = 100
        // Total: 2000 + 100 = 2100
        double esperado = 2100.0;

        vm.setSueldoFijo(sueldoFijo);
        vm.setNumeroVentas(ventas);

        // 2. Ejecución (Act)
        double resultadoReal = vm.calcularSueldo();

        // 3. Verificación (Assert)
        assertEquals(esperado, resultadoReal, 0.001, 
            "El sueldo debe ser el fijo más el 1% del mismo por cada venta.");
    }

    @Test
    public void validarSueldoMixtoSinVentas() {
        VendedorMixto vm = new VendedorMixto("55667788", "C");
        vm.setSueldoFijo(1000.0);
        vm.setNumeroVentas(0);

        // Si hay 0 ventas, el 1% adicional es 0. Debe retornar solo el fijo.
        assertEquals(1000.0, vm.calcularSueldo(), 0.001);
    }
    
}
