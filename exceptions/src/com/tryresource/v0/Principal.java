package com.tryresource.v0;

class ConexionMongoDb{
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
	
	void close() throws Exception{
		System.out.println("Cerrar conexion MongoDb");
		//throw new Exception("Exception al cerrar conexion");
	}
}

public class Principal {
	
	public static void main(String[] args) {
		
		ConexionMongoDb conn = new ConexionMongoDb("9000");
		
		try {
			conn.open();
			conn.consulta();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//DECISION
				//System.out.println("Paso finally Close");
			}
		}
		
		
		
	}

}
