package com.krakedev.examen;

import com.krakedev.examen.administracion.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		AdminVentas av=new AdminVentas();
		Vendedor v1=new VendedorComision("123", "C");
		Vendedor v2=new VendedorMixto("456", "M");
		
		v1.setNumeroVentas(10);
		v1.setComisionPorVentas(5);
		v1.calcularSueldo();
		
		v2.setNumeroVentas(15);
		v2.setComisionPorVentas(7);
		
		av.agregar(v1);
		av.agregar(v2);
		
		Double resultado=av.calcularSueldo("147");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println("Resultado: "+resultado);

	}

}
