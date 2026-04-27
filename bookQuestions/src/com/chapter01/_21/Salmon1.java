package com.chapter01._21;

public class Salmon1 {
    int count; //0 1 4
    { System.out.print(count+"-"); }
    { count++; }
    
    public Salmon1() {
        count = 4;
        System.out.print(2+"-");
    }

    public static void main(String[] args) {
        System.out.print(7+"-");
        var s = new Salmon1();
        System.out.print(s.count+"-");
    }
}

//7-0-2-4-
