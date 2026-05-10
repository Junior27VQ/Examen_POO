package com.krakedev.examen;

public class Vendedor {
	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVentas;
	private String tipo;
	
	public Vendedor(String cedula, String tipo) {
		super();
		this.cedula = cedula;
		this.tipo = tipo;
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
		return sueldoFijo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", numeroVentas=" + numeroVentas + ", sueldoFijo=" + sueldoFijo
				+ ", comisionPorVentas=" + comisionPorVentas + ", tipo=" + tipo + "]";
	}
	

}
