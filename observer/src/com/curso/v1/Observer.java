package com.curso.v1;

public abstract class Observer {
	
	Subject subject; //HAS-A
	
	public Observer(Subject subject) {
		subject.attach(this); //*****
		this.subject = subject;
	}

	public abstract void update();
}
