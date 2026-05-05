package com.curso.v2;

import java.util.*;

public abstract class Subject {
	
	List<Observer> observadores;

	public Subject() {
		observadores = new ArrayList<>();
	}
	
	void attach(Observer o) {
		observadores.add(o);
	}
	
	void detach(Observer o) {
		observadores.remove(o);
	}
	
	void notificar() {
		for(Observer o: observadores)
			o.update();
	}
	
}
