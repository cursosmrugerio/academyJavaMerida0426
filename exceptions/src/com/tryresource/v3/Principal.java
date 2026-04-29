package com.tryresource.v3;

class ConexionMongoDb implements AutoCloseable{
	String port;

	public ConexionMongoDb(String port) {
		this.port = port;
	}
	
	void consulta() {
		System.out.println("Consulta db MongoDb");
	}
	void open(){
		System.out.println("Abrir conexion MongoDb");
		//throw new Exception("Exception al abrir conexion");
	}
	
	@Override
	public void close() {
		System.out.println("Cerrar conexion MongoDb");
		//throw new Exception("Exception al cerrar conexion");
	}
}

public class Principal {
	public static void main(String[] args) {
		System.out.println("AutoCloseable V3");
		ConexionMongoDb conn = new ConexionMongoDb("9000");
		try (conn){
			conn.open();
			conn.consulta();
		} 
		System.out.println(conn);
	}
}
