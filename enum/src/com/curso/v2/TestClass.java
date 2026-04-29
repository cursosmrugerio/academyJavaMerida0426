package com.curso.v2;

import java.util.*;

enum Title {
	MR("Mr."),ZZZ("zzz"), MS1("Ms."), MS2("Ms.");

	private String title;

	private Title(String s) {
		title = s;
	}
}

public class TestClass{
    public static void main(String[] args) {
        Set<Title> ts = new TreeSet<Title>();
        ts.add(Title.MS2);
        ts.add(Title.MR);
        ts.add(Title.MS1);
        ts.add(Title.ZZZ);
        
        for(Title t :  ts){
            System.out.println(t);
        }
    }
}