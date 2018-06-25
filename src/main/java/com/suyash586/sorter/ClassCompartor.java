package com.suyash586.sorter;

import java.util.Arrays;
import java.util.Comparator;

public class ClassCompartor implements Comparator<Class> {

	@Override
	public int compare(Class c1, Class c2) {

		if (c1.isInterface()) {
			if (Arrays.asList(c2.getInterfaces()).contains(c1)) {
				return -1;
			}
		}

		if (c2.isInterface()) {
			if (Arrays.asList(c1.getInterfaces()).contains(c2)) {
				return 1;
			}
		}
		if (!c1.isInterface()) {
			if (c1.getSuperclass().equals(c2)) {
				return 1;
			}
		}
		if (!c2.isInterface()) {
			if (c2.getSuperclass().equals(c1)) {
				return -1;
			}
		}

		return 0;

	}

}
