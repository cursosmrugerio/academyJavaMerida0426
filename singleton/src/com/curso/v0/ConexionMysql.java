package com.curso.v0;

//SINGLETON
public class ConexionMysql {
	
	String port; //HAS-A

	public ConexionMysql(String port) {
		this.port = port;
	}
	
	void getConexion() {
		System.out.println("Abrir conexion");
	}
	
	

}
