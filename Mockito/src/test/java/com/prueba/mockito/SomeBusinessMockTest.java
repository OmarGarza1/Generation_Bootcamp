package com.prueba.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

public class SomeBusinessMockTest {

	@Test
	public void findTheGreatest() {
		DataService dataServiceMock = mock(DataService.class);

		// dataService.retrieveAllData() => new int[] {24,15,3}
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = someBusinessImpl.findTheGreatest();

		assertEquals(24, result);

	}

	@Test
	public void findTheGreatestOneValue() {
		DataService dataServiceMock = mock(DataService.class);

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = someBusinessImpl.findTheGreatest();

		assertEquals(24, result);

	}

}