package com.chapter01._21;

public class Salmon3 {
	static int contador;//0 1 2
    int count; //0 1 4
    { System.out.println(count+"-"); }
    { count++; }
    
    static { contador++; }
    static { System.out.println(contador+"-"); }
    
    public Salmon3() {
        count = 4;
        contador++;
        System.out.println(2+"-");
    }

    public static void main(String[] args) {
        System.out.print(7+"-");
        var s = new Salmon3();
        System.out.println(s.count+"-");
        System.out.println(contador+"-");
    }
} 
//1-
//7-0-
//2-
//4-
//2-





