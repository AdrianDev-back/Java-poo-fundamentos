package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.ImplementFunction;
import model.entities.ProductFunction;



public class ProgramFunction {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProductFunction> list = new ArrayList<>();
		
		list.add(new ProductFunction("Tv", 900.00));
		list.add(new ProductFunction("Mouset", 50.00));
		list.add(new ProductFunction("Tablet", 350.50));
		list.add(new ProductFunction("Hd case", 80.90));
		
		//List<String> names = list.stream().map(new ImplementFunction()).collect(Collectors.toList());
		//List<String> names1 = list.stream().map(ProductFunction::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names2 = list.stream().map(ProductFunction::nonStaticUpperCaseName).collect(Collectors.toList());
		List<String> names3 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		
		
		names3.forEach(System.out::println);
		
	
		
		
		

	}

}
