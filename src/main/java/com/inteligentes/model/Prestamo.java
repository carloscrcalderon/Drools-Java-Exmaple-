package com.inteligentes.model;

public class Prestamo {

	private int rentabilidad;
	private int tir;
	private int mercado;
	private int capital;
	private int crecimiento;
	private int patrimonio;
	private int riesgo;
	private int ingresos;
	private int gastos;
    private int porcentaje=0;
    
    
    
    
	public Prestamo() {
	}
	
	public Prestamo(int rentabilidad, int tir, int mercado, int capital, int crecimiento, int patrimonio, int riesgo,
			int ingresos, int gastos, int porcentaje) {
		this.rentabilidad = rentabilidad;
		this.tir = tir;
		this.mercado = mercado;
		this.capital = capital;
		this.crecimiento = crecimiento;
		this.patrimonio = patrimonio;
		this.riesgo = riesgo;
		this.ingresos = ingresos;
		this.gastos = gastos;
		this.porcentaje = porcentaje;
	}
	public int getRentabilidad() {
		return rentabilidad;
	}
	public void setRentabilidad(int rentabilidad) {
		this.rentabilidad = rentabilidad;
	}
	public int getTir() {
		return tir;
	}
	public void setTir(int tir) {
		this.tir = tir;
	}
	public int getMercado() {
		return mercado;
	}
	public void setMercado(int mercado) {
		this.mercado = mercado;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public int getCrecimiento() {
		return crecimiento;
	}
	public void setCrecimiento(int crecimiento) {
		this.crecimiento = crecimiento;
	}
	public int getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(int patrimonio) {
		this.patrimonio = patrimonio;
	}
	public int getRiesgo() {
		return riesgo;
	}
	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}
	public int getIngresos() {
		return ingresos;
	}
	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}
	public int getGastos() {
		return gastos;
	}
	public void setGastos(int gastos) {
		this.gastos = gastos;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	@Override
	public String toString() {
		return "Order [rentabilidad=" + rentabilidad + ", tir=" + tir + ", mercado=" + mercado + ", capital=" + capital
				+ ", crecimiento=" + crecimiento + ", patrimonio=" + patrimonio + ", riesgo=" + riesgo + ", ingresos="
				+ ingresos + ", gastos=" + gastos + ", porcentaje=" + porcentaje + "]";
	}
    

}
