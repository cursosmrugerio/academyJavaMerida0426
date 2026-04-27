package com.curso.v0;

class Square {
    private double side = 0;
    String color;
    public Square(double length){
        this.side = length;
    }
    public double getSide() {  return side;    }

    public void setSide(double side) {  this.side = side;   }
    
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        Square mysq = new Square(10);
        mysq.color = "red";
        
        //mysq.side = 20;
        mysq = new Square(20);
        
        //set mysq's side to 20
    }
}