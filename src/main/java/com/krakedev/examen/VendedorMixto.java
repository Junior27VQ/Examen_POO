package com.krakedev.examen;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula) {
		super(cedula);
	}
	@Override
	public double calcularSueldo() {
		double sueldoFijo=getSueldoFijo();
		double porcentaje = sueldoFijo*0.01;
		return this.getSueldoFijo()+(porcentaje*this.getNumeroVentas());
	}

}
