package com.krakedev.examen;

public class Vendedor {
	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVentas;
	public Vendedor(String cedula) {
		super();
		this.cedula = cedula;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getNumeroVentas() {
		return numeroVentas;
	}
	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}
	public double getSueldoFijo() {
		return sueldoFijo;
	}
	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	public double getComisionPorVentas() {
		return comisionPorVentas;
	}
	public void setComisionPorVentas(double comisionPorVentas) {
		this.comisionPorVentas = comisionPorVentas;
	}
	
	public double calcularSueldo() {
		return sueldoFijo+comisionPorVentas;
	}
	
	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", numeroVentas=" + numeroVentas + ", sueldoFijo=" + sueldoFijo
				+ ", comisionPorVentas=" + comisionPorVentas + "]";
	}
	

}
