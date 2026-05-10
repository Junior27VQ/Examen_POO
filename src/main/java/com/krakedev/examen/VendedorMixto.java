package com.krakedev.examen;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula, String tipo) {
		super(cedula, tipo);
	}
	@Override
	public double calcularSueldo() {
		double sueldoFijo=getSueldoFijo();
		double porcentaje = sueldoFijo*0.01;
		return this.getSueldoFijo()+(porcentaje*this.getNumeroVentas());
	}

}
