package com.prueba.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void findTheGreatest() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, someBusinessImpl.findTheGreatest());
	}

	@Test
	public void findTheGreatestOneValue() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24 });
		assertEquals(24, someBusinessImpl.findTheGreatest());
	}
}