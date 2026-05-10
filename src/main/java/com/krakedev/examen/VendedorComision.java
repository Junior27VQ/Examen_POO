package com.krakedev.examen;

public class VendedorComision extends Vendedor{

	public VendedorComision(String cedula, String tipo) {
		super(cedula, tipo);
	}

	@Override
	public double calcularSueldo() {
		return this.getComisionPorVentas()*this.getNumeroVentas();
	}
	

}
