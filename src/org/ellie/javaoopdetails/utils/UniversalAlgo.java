package org.ellie.javaoopdetails.utils;

import java.util.ArrayList;
import java.util.List;

import org.ellie.javaoopdetails.interfaces.ICompareExpression;

public class UniversalAlgo {

	//Метод сортирует только список целых чисел, только в одном направлении
	/*public static void sort(ArrayList _elements) {
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for(int i = 0; i < _elements.size() - 1; i++) {
				
				if((int)_elements.get(i) > (int)_elements.get(i + 1)) {
					
					Integer tmpInt = (Integer)_elements.get(i + 1);
					_elements.set(i + 1, (Integer)_elements.get(i));
					_elements.set(i, tmpInt);
					swapped = true;
				}
			}
		};
	}*/
	
	//Метод сортирует список объектов любого типа в любом направлении,
	//получая правило сортировки извне при вызове - в качестве второго аргумента
	public static void sort(ArrayList _elements, ICompareExpression _expression) {
		
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for(int i = 0; i < _elements.size() - 1; i++) {
				
				if(_expression.expression(_elements.get(i), _elements.get(i + 1)) < 0) {
					
					Object tmpInt = _elements.get(i + 1);
					_elements.set(i + 1, _elements.get(i));
					_elements.set(i, tmpInt);
					swapped = true;
				}
			}
		};
	}
}
