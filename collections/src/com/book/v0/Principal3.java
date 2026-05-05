package com.book.v0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Principal3 {

	public static void main(String[] args) {
		
		//HashSet<Object> hs1 = new HashSet<String>();
		//HashSet<Number> hs2 = new HashSet<Integer>();
		
		//Lower Bounded Wildcard
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		
		List<String> list = new ArrayList<>();
		
		List<Object> values = new ArrayList<Object>();
		
		//List<Object> objects = new ArrayList<? extends Object>();
		
		Map<String, ? extends Number> hm = 
				new HashMap<String, Integer>();
		
	}

}
