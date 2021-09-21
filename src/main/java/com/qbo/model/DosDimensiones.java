package com.qbo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DosDimensiones {
	double base;
	private static Logger LOG = LoggerFactory.getLogger(Triangulo.class);
    public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	double altura;

    public void mostrarDimension(){
    	LOG.info("La base y altura es: "+base+" y "+altura);
    }
}
