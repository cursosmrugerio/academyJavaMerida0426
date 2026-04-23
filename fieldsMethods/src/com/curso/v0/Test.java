package com.curso.v0;

public class Test {
    int x = 5;  // campo de instancia
    
    public void demo(int x) {  // parámetro con MISMO NOMBRE
        x = 10;  // ¿cuál x cambias?
        System.out.println(x);         // imprime 10
        System.out.println(this.x);    // imprime 5
    }
    
    public static void main(String[] args) {
        new Test().demo(999);
    }
}