package com.curso.v2;

//SINGLETON
public class ConexionMysql {
	
	String port;
	
	static private ConexionMysql conexion = new ConexionMysql("3036");

	private ConexionMysql(String port) {
		this.port = port;
	}
	
	void getConexion() {
		System.out.println("Abrir conexion Mysql");
	}
	
	static public ConexionMysql getInstance() {
		return conexion;
	}
	
	

}
