package com.curso.v2;

import com.curso.v2.algoritmo.ComportamientoVolar;

public abstract class Ave {
	
	//HAS-A
	ComportamientoVolar cv;
	
	void volar() {
		cv.ejecutaVuelo();
	}

}
