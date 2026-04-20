package com.curso.v2;

public class Bear {
    private Bear pandaBear; //Variable de instancia de clase

    private void roar(Bear b) {
        pandaBear = b;
    }

    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        Bear bear  = new Bear();
        
        brownBear.roar(polarBear);
        polarBear.roar(bear);
        bear.roar(brownBear);
        

        boolean b = brownBear == brownBear.pandaBear.pandaBear.pandaBear ;
        
        System.out.println(b); //true
        
    }
}