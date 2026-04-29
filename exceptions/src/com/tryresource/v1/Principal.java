package com.tryresource.v1;

class ConexionMongoDb implements AutoCloseable{
	String port;

	public ConexionMongoDb(String port) {
		this.port = port;
	}
	
	void consulta() {
		System.out.println("Consulta db MongoDb");
	}
	void open() throws Exception{
		System.out.println("Abrir conexion MongoDb");
		//throw new Exception("Exception al abrir conexion");
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("Cerrar conexion MongoDb");
		//throw new Exception("Exception al cerrar conexion");
	}
}

public class Principal {
	public static void main(String[] args) {
		System.out.println("AutoCloseable");
		try (ConexionMongoDb conn = new ConexionMongoDb("9000")){
			conn.open();
			conn.consulta();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//System.out.println(conn);
	}
}
