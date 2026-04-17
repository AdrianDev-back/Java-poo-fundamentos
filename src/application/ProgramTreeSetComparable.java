package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.ProductTreeSet;

public class ProgramTreeSetComparable {

	public static void main(String[] args) {
		
    Set<ProductTreeSet> set = new TreeSet<>();
		
		set.add(new ProductTreeSet("TV", 900.00));
		set.add(new ProductTreeSet ("Notebook",1200.0));
		set.add(new ProductTreeSet("Tablet", 400.0));
		
		for (ProductTreeSet p : set) {
			System.out.println(p);
		}
	}

}
