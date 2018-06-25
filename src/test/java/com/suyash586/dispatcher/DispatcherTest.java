package com.suyash586.dispatcher;

import static org.mockito.ArgumentCaptor.forClass;
import static org.mockito.Mockito.verify;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class DispatcherTest {

	@Test
	@Ignore
	public void testDispatch() {
		TestDispatcher test = Mockito.spy(new TestDispatcher());

		test.dispatch("String");
		ArgumentCaptor<String> srg = forClass(String.class);
		verify(test).test(srg.capture());

	}

}
