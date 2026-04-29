package com.curso.v1;

public enum Dia {
	
	LUNES{
		void getVisitantes() {}
	},
	MARTES{
		void getVisitantes() {}
	},
	MIERCOLES{
		void getVisitantes() {}
	},
	JUEVES{
		void getVisitantes() {}
	},
	VIERNES{
		void getVisitantes() {}
	},
	SABADO{
		void getVisitantes() {}
	},
	DOMINGO{
		void getVisitantes() {}
	};
	
	abstract void getVisitantes();
	
	public static void main(String[] args) {
		System.out.println("Hello Enum");
	}
	
	

}
