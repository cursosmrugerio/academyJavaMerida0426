package com.curso.v1;

//SINGLETON
public class ConexionMysql {
	
	String port;
	
	static private ConexionMysql conexion;

	private ConexionMysql(String port) {
		this.port = port;
	}
	
	void getConexion() {
		System.out.println("Abrir conexion Mysql");
	}
	
	static public ConexionMysql getInstance() {
		
		if (conexion == null)
			conexion = new ConexionMysql("3036");
		
		return conexion;
	}
	
	

}
