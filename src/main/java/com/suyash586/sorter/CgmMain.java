package com.suyash586.sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CgmMain {
	public static void main(String[] args) {
		List<Class> li = new ArrayList<>();

		li.add(ACImpl.class);
		li.add(A.class);

		li.add(CImpl.class);

		li.add(C.class);
		li.add(B.class);

		System.out.println("li " + li);

		Comparator<Class> compartor = new ClassCompartor();

		Collections.sort(li, compartor);

		System.out.println("li " + li);
	}
}
