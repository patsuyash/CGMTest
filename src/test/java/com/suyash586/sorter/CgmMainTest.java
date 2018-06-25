package com.suyash586.sorter;

import static java.util.Collections.sort;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CgmMainTest {

	@Test
	public void sortWithNorelationItem_shouldstayAsis() {
		List<Class> li = new ArrayList<>();

		li.add(C.class);

		li.add(B.class);

		li.add(D.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(C.class, B.class, D.class));

	}

	@Test
	public void sortWithClassesOnlyOutOfOrder() {
		List<Class> li = new ArrayList<>();

		li.add(A.class);

		li.add(B.class);

		li.add(ACImpl.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(B.class, A.class, ACImpl.class));

	}

	@Test
	public void sortWithClassesOnlyAlreadyInorder() {
		List<Class> li = new ArrayList<>();

		li.add(B.class);

		li.add(A.class);

		li.add(ACImpl.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(B.class, A.class, ACImpl.class));

	}

	@Test
	public void sortWithInterfaceNClassesWithLeadingUnrealtedClassFirst() {
		List<Class> li = new ArrayList<>();

		li.add(A.class);

		li.add(CImpl.class);

		li.add(C.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(A.class, C.class, CImpl.class));

	}

	@Test
	public void sortWithInterfaceNClassesWithLeadingUnrealtedClassFirstInOrder() {
		List<Class> li = new ArrayList<>();

		li.add(A.class);

		li.add(C.class);

		li.add(CImpl.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(A.class, C.class, CImpl.class));

	}

	@Test
	public void sortWithInterfaceNClassesWithLeadingUnrealtedClassLast() {
		List<Class> li = new ArrayList<>();

		li.add(CImpl.class);

		li.add(C.class);
		li.add(A.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(C.class, CImpl.class, A.class));

	}

	@Test
	public void sortWithInterfaceNClassesWithLeadingUnrealtedClassLastInorder() {
		List<Class> li = new ArrayList<>();

		li.add(C.class);
		li.add(CImpl.class);
		li.add(A.class);

		sort(li, new ClassCompartor());

		assertThat(li, contains(C.class, CImpl.class, A.class));

	}
}
