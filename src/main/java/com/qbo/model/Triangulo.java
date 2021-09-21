package com.qbo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangulo extends DosDimensiones {
	
	private static Logger LOG = LoggerFactory.getLogger(Triangulo.class);
	
    String estilo;


    public double area(){
        return base*altura/2;
    }

    public void mostrarEstilo(){
    	LOG.info("Triangulo es: "+estilo);
    }

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}
