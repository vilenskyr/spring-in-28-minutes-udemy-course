package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@Mock
	SomeCdiDao daoMock;

	@InjectMocks
	SomeCdiBusiness business;

	@Test
	public void testBasicScenario() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });

		int actualResult = business.findGreatest();

		assertEquals(4, actualResult);
	}

	@Test
	public void testBasicScenario_NoElements() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] {});

		int actualResult = business.findGreatest();

		assertEquals(Integer.MIN_VALUE, actualResult);
	}

	@Test
	public void testBasicScenario_EqualElements() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 2 });

		int actualResult = business.findGreatest();

		assertEquals(2, actualResult);
	}

}
