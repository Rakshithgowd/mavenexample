package mavenexample.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mavenexample.demo.Calculator;

class TestBeforeAfter {
	@BeforeAll
	public void testdbcon()
	{
		System.out.println("db conn is up");
	}
	@BeforeEach
	public void testdbSet()
		{
			System.out.println("db conn is set");
		}
	
	
@Test
	public void TestAddition()
	{
	System.out.println("test method is added");
		Calculator c=new Calculator();
		int result=c.addNos(100, 200);
		Assertions.assertEquals(300, result);
	}

@Test
public void TestSubtraction()
{
	System.out.println("test method is subtracted");
	Calculator c=new Calculator();
	int result=c.subNos(500, 200);
	Assertions.assertEquals(300, result);
}
@AfterAll
public void testdbClose()
{
	System.out.println("db conn is down");
}
@AfterEach
public void testdbNotset()
{
	System.out.println("db conn is not set");
}


}

