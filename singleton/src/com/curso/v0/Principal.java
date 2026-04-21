package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		ConexionMysql con1 = new ConexionMysql("3306");
		ConexionMysql con2 = new ConexionMysql("3306");
		ConexionMysql con3 = new ConexionMysql("3306");
		ConexionMysql con4 = new ConexionMysql("3306");
		ConexionMysql con999 = new ConexionMysql("3306");
		
		System.out.println(con1==con999); //true
		
	}

}
