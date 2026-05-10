package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.Vendedor;
import com.krakedev.examen.administracion.AdminVentas;

@RestController

@RequestMapping("/vendedor")
public class VendedorController {
	private final AdminVentas adminVentas;
	public VendedorController(AdminVentas adminVentas) {
		this.adminVentas= adminVentas;
	}
	
	@PostMapping("/agregar")
	public void agregarVendedor(@RequestBody Vendedor vendedor) {
		Vendedor nuevoVendedor=null;
		if(vendedor.getTipo().equals("V")) {
			nuevoVendedor=new Vendedor(vendedor.getCedula(),"V");
		}else if(vendedor.getTipo().equals("C")) {
			nuevoVendedor=new Vendedor(vendedor.getCedula(),"C");
		}else if(vendedor.getTipo().equals("M")) {
			nuevoVendedor=new Vendedor(vendedor.getCedula(),"M");
		}
		if(nuevoVendedor != null) {
			nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());
			nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());
			nuevoVendedor.setComisionPorVentas(vendedor.getComisionPorVentas());
		
			adminVentas.agregar(nuevoVendedor);
		}
	}
	
	@GetMapping("/calcularSueldo")
	public double calcularSueldoVendedor(@RequestParam String cedula) {
		return adminVentas.calcularSueldo(cedula);
	}

}
