import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestCar {
	private Car object_test;

	@BeforeEach
	public void setUp()
	{
		object_test = new Car("a", "a", 1, 1, 1.5);
		
	}
	
	@Test
	public void testsGetters()
	{
		String output = "aa111.5";
		String test_variable = object_test.getDescription();
		assertEquals(test_variable, output);
	}
	
	@Test
	public void testCarStrategy()
	{
		CarStrategy mock = Mockito.mock(CarStrategy.class);
		Mockito.when(mock.getExtendedDescription()).thenReturn("");
		object_test.setCarStrategy(mock);
		String test_variable = object_test.getDescription();
		String output = "aa111.5";
		assertEquals(test_variable, output);
	}
}
