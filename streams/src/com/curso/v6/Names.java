package com.curso.v6;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Names {

	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void printNames(){
        System.out.println(getList());
    }

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob Hope", "Bob Dole", "Bob Brown");

		Names n = new Names();
		
		//n.setList(list);
		n.setList(list.stream().collect(Collectors.toList()));
		
		//Consumer<String> consumer = x -> x.printNames();
		
		//n.getList().forEach(Names::printNames);
		
	}

}
