package oo1.ejercicio16;

import java.util.*;

public class EvenNumberSet extends HashSet<Integer> implements Set<Integer>{
	@Override
	public boolean add(Integer n) {
		if (n % 2 == 0) {
			super.add(n);
			return true;
		}
		return false;
	}
}
