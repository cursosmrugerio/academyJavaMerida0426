package com.notebook.v0;

import java.util.Collection;

public class Principal {

	public static void main(String[] args) {

	}

	public static void getExceptions(Collection<? super Exception> coll) {
		coll.add(new RuntimeException());
		coll.add(new Exception());
	}

}
