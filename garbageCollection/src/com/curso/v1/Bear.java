package com.curso.v1;

public class Bear {
    private Bear pandaBear; //Variable de instancia de clase

    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }

    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        brownBear.roar(polarBear);
        polarBear = null;
        brownBear = null;

    }
}