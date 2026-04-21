package com.curso.v0;

//SINGLETON
public class ConexionMysql {
	
	String port;

	public ConexionMysql(String port) {
		this.port = port;
	}
	
	void getConexion() {
		System.out.println("Abrir conexion");
	}
	
	

}
