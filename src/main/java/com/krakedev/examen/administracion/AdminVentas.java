package com.krakedev.examen.administracion;

import java.util.ArrayList;

import com.krakedev.examen.Vendedor;

public class AdminVentas {
	private ArrayList<Vendedor> vendedores=new ArrayList<Vendedor>();
	
	public void agregar(Vendedor vendedor) {
		boolean existe=true;
		for(Vendedor v:vendedores) {
			if(v.getCedula().equals(vendedor.getCedula()))
				break;
		}
		if(existe) {
			vendedores.add(vendedor);
		}
	}
	public Double calcularSueldo(String cedula) {
		Double sueldo=null;
		for(Vendedor v:vendedores) {
			if(v.getCedula().equals(cedula)) {
				sueldo=v.calcularSueldo();
				return sueldo;
			}
		}
		return sueldo;
	}


}
