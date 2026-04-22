package com.curso.v3;

import com.curso.v3.algoritmo.ComportamientoVolar;
import com.curso.v3.algoritmo.SiVolar;

public abstract class Ave {
	
	//HAS-A //ENCAPSULAR
	private ComportamientoVolar cv;
	
	Ave(){
		cv = new SiVolar();
	}
	
	void volar() {
		cv.ejecutaVuelo();
	}

	public ComportamientoVolar getCv() {
		return cv;
	}

	public void setCv(ComportamientoVolar cv) {
		this.cv = cv;
	}
	
	

}
