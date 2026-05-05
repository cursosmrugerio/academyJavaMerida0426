package com.book.v0;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal4 {

	public static void main(String[] args) {
		
		Predicate<String> empty = String::isEmpty;
		Predicate<String> notEmpty = empty.negate();
		
		Stream<String> stream1 = Stream.generate(() -> "");
		
		Stream<String> stream2 = stream1.limit(10);
		
		//System.out.println(stream2.count()); //10
		
		Stream<String> stream3 = stream2.filter(notEmpty);
		
		//System.out.println(stream3.count()); //0
		
		Collector<String,?,Map<String,List<String>>> collector =
							Collectors.groupingBy(k -> k);
		
		Map<String, List<String>> map = stream3.collect(collector);
		
		//System.out.println(map); //map vacio
		
		Set<Map.Entry<String,List<String>>> set = map.entrySet();
		
		//System.out.println(set); //set vacio
		
		Stream<Map.Entry<String,List<String>>> stream4 = set.stream();
		
		Stream<List<String>> stream5 = stream4.map(entry -> entry.getValue());
		
		//Stream<String> stream6 = stream5.flatMap(lista -> lista.stream());
		Stream<String> stream6 = stream5.flatMap(Collection::stream);
		
		Collector<String,?,Map<Boolean,List<String>>> collector2 =
				Collectors.partitioningBy(notEmpty);
		
		Map<Boolean, List<String>> result = 
				stream6.collect(collector2);
		
		System.out.println(result);
		

	}

}
