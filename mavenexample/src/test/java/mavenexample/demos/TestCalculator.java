package mavenexample.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mavenexample.demo.Calculator;

class TestCalculator {
	Calculator c = new Calculator();
	
	
	@Disabled
	@Test
	public void testHello()
	{
		Assertions.assertEquals("Happy Morning",c.sayHello());
	}
	@Disabled
	@Test
public void testAddition()
{
	Assertions.assertEquals(300, c.addNos(100, 200));
}
	@Disabled
	@Test
	public void testSubtraction() {
		Assertions.assertEquals(150, c.subNos(300, 150));
	}
	
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	
	
}
