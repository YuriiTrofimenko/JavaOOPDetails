package org.ellie.javaoopdetails;

import java.util.ArrayList;

import org.ellie.javaoopdetails.interfaces.ICompareExpression;
import org.ellie.javaoopdetails.model.Person;
import org.ellie.javaoopdetails.utils.UniversalAlgo;

public class Main {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> elements = new ArrayList<>();
		elements.add(10);
		elements.add(5);
		elements.add(-2);
		elements.add(100);
		elements.add(0);
		elements.add(3);*/
		
		ArrayList<Person> elements = new ArrayList<>();
		elements.add(new Person("b", 20));
		elements.add(new Person("a", 25));
		elements.add(new Person("c", 18));
		
		elements.forEach(el -> {System.out.println(el);});
		System.out.println();
		/*UniversalAlgo.sort(elements);*/
		/*UniversalAlgo.sort(elements, (o1, o2) -> {
			return (int)o2 - (int)o1;
		});*/
		/*UniversalAlgo.sort(elements, (o1, o2) -> {
			return ((Person)o2).name.compareTo(((Person)o1).name);
		});*/
		
		final int ageLimit = 20;
		
		//ageLimit += 5;
		
		/*UniversalAlgo.sort(elements, (o1, o2) -> {
			if (((Person)o1).age > ageLimit || ((Person)o2).age > ageLimit) {
				System.out.println("Error!");
			}
			return ((Person)o2).name.compareTo(((Person)o1).name);
		});*/
		
		UniversalAlgo.sort(elements, new ICompareExpression() {
			
			@Override
			public int expression(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Person)o2).name.compareTo(((Person)o1).name);
			}
		});
		
		elements.forEach(el -> {System.out.println(el.toString());});
	}
}
