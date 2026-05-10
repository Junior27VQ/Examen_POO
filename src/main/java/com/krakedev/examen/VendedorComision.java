package com.krakedev.examen;

public class VendedorComision extends Vendedor{

	public VendedorComision(String cedula) {
		super(cedula);
	}

	@Override
	public double calcularSueldo() {
		return this.getComisionPorVentas()*this.getNumeroVentas();
	}
	

}
