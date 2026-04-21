package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		ConexionMysql con1 = ConexionMysql.getInstance();
		ConexionMysql con2 = ConexionMysql.getInstance();
		ConexionMysql con3 = ConexionMysql.getInstance();
		ConexionMysql con4 = ConexionMysql.getInstance();
		ConexionMysql con999 = ConexionMysql.getInstance();
		
		System.out.println(con3);
		System.out.println(con999);
		
		System.out.println(con3==con999); //true
		
	}

}
