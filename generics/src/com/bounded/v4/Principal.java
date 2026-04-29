package com.bounded.v4;

import java.util.*;

abstract class Figura {}
class Circulo extends Figura{}
class Cuadrado extends Figura{}
class Triangulo extends Figura{}

public class Principal {
	
	//LOWER BOUNDED WILDCARD
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Object());
		list.add("Hola");
		list.add(Double.valueOf(5.0));
		showLowerBounded(list);
		
		List<String> listString = new ArrayList<>();
		listString.add("A");
		listString.add("B");
		listString.add("C");
		
		List<Double> listDouble = new ArrayList<>();
		listDouble.add(5.0);
		listDouble.add(2.0);
		listDouble.add(1.7);
		
		List<Figura> listFigura = new ArrayList<>();
		listFigura.add(new Circulo());
		listFigura.add(new Cuadrado());
		listFigura.add(new Triangulo());
		showLowerBounded(listFigura);
		
		List<Circulo> listCirculo = new ArrayList<>();
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());

		List<Cuadrado> listCuadrado = new ArrayList<>();
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		
		List<Triangulo> listTriangulo = new ArrayList<>();
		listTriangulo.add(new Triangulo());
		listTriangulo.add(new Triangulo());
		listTriangulo.add(new Triangulo());
		//showLowerBounded(listTriangulo); //DON'T COMPILE
		
	}
	
	static void showLowerBounded(List<? super Figura> lista){
		//SI PERMITE AÑADIR ELEMENTOS
		//PERO TIENE QUE SER Figura O SUBCLASE DE Figura
		//lista.add("Hello"); //DON'T COMPILE
		lista.add(new Triangulo());
		
		for(Object obj: lista) {
			System.out.println(obj);
		}
		System.out.println("********");
		
	}
	

}
