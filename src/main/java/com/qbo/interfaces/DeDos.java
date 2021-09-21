package com.qbo.interfaces;

public class DeDos implements Series {
	int iniciar;
    int valor;
    
    public DeDos(){
        iniciar=0;
        valor=0;
    }

	@Override
	public int getSiguiente() {
		 valor+=2;
		 return valor;
	}

	@Override
	public void reiniciar() {
		 valor=iniciar;
		
	}

	@Override
	public void setComenzar(int x) {
        iniciar=x;
        valor=x;
	}

}
