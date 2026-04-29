package com.curso.v0;

class TestClass {

	public enum EnumB {
		B, BB, BBB;
//      clone es final en la clase Enum
//		public Object clone() {
//			return B;
//		}
	}

	public static enum EnumC {
		C, CC, CCC
	};

	// public static enum EnumD extends EnumC{ DDD };

	public TestClass() {
		// System.out.println(EnumC.CC.index()); //4
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		EnumB b = EnumB.BBB;
		EnumB.BBB.ordinal();

		System.out.println(EnumC.valueOf("CCC")); // 5
		System.out.println(EnumC.CCC.name()); // 6
		System.out.println(EnumC.CCC.ordinal()); // 7
	}

	
}
