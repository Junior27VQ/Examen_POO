package com.krakedev.examen.administracion;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.examen.Vendedor;

@Service
public class AdminVentas {
	private ArrayList<Vendedor> vendedores=new ArrayList<Vendedor>();
	
	public void agregar(Vendedor vendedor) {
		boolean existe=true;
		for(Vendedor v:vendedores) {
			if(v.getCedula().equals(vendedor.getCedula()))
				existe=false;
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
