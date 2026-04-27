package com.chapter01._21;

public class Salmon4 {
	
    public static void main(String[] args) {
        System.out.print(7+"-");
        var s = new Salmon4();
        var s2 = new Salmon4();
        System.out.println(s.count+"-");
        System.out.println(s2.count+"-");
        System.out.println(contador+"-");
    }
    
    int count; //0 1 4  SEGUNDO OBJETO //0 1 4
    { System.out.println(count+"-"); }
    { count++; }
  
    public Salmon4() {
        count = 4;
        contador++;
        System.out.println(2+"-");
    }
    
	static int contador;//0 1 2 3
  
    static { contador++; }
    static { System.out.println("static: "+contador+"-"); }
    
 


} 
//1-
//7-0-
//2-
//0-
//2-
//4-
//4-
//3-








