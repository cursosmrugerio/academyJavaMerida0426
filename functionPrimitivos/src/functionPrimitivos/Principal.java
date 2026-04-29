package functionPrimitivos;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		List<IntBinaryOperator> lista = List.of(
				(x,y) -> x+y,
				(z,w) -> z-w,
				(a,b) -> a*b,
				(pato1,pato2) -> pato1/pato2,
				(i1,i2) -> (int)Math.pow(i1, i2)
			);
		
		lista.forEach(ibo ->{
			System.out.println(ibo.applyAsInt(8,4));
		});

	}

}
