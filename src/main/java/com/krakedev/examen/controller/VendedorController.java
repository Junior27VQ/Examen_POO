package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.Vendedor;
import com.krakedev.examen.administracion.AdminVentas;

@RestController

@RequestMapping("/vendedor")
public class VendedorController {
	private final AdminVentas adminVentas;
	private String cedula;
	public VendedorController(AdminVentas adminVentas) {
		this.adminVentas= adminVentas;
	}
	
	@PostMapping
	public void agregarVendedor(@RequestBody Vendedor vendedor) {
		Vendedor nuevoVendedor=null;
		if(vendedor.getTipo().equals("V")) {
			nuevoVendedor=new Vendedor(vendedor.getCedula(),"V");
		}else if(vendedor.getTipo().equals("C")) {
			nuevoVendedor=new Vendedor(vendedor.getCedula(),"C");
		}else if(vendedor.getTipo().equals("M")) {
			nuevoVendedor=new Vendedor(vendedor.getCedula(),"M");
		}
		adminVentas.agregar(nuevoVendedor);
	}
	
	public double calcularSueldoVendedor() {
		return adminVentas.calcularSueldo(cedula);
	}

}
