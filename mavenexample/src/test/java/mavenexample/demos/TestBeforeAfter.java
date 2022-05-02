package mavenexample.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import mavenexample.demo.Calculator;

class TestBeforeAfter {
	//@BeforeAll
	//public void testdbcon()
	//{
	//	System.out.println("db conn is up");
	//}
	//@BeforeEach
//	public void testdbSet()
	//	{
		//	System.out.println("db conn is set");
		//}
	
	
//@Test
	//public void TestAddition()
	//{
	//System.out.println("test method is added");
		//Calculator c=new Calculator();
		//int result=c.addNos(100, 200);
		//Assertions.assertEquals(300, result);
	//}

//@Test
//public void TestSubtraction()
//{
	//System.out.println("test method is subtracted");
	//Calculator c=new Calculator();
	//int result=c.subNos(500, 200);
	//Assertions.assertEquals(300, result);
//}
//@AfterAll
//public void testdbClose()
//{
	//System.out.println("db conn is down");
//}
//@AfterEach
//public void testdbNotset()
//{
	//System.out.println("db conn is not set");
//}
@ParameterizedTest
@ValueSource(ints = {8,4,2,6,12})
void test_int_arrays(int arg) {
  System.out.println("arg => "+arg);
  Assertions.assertTrue(arg % 2 == 0);
}   

@DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = {"Hello"})
    void testParam(String message) {
	 Assertions.assertNotNull(message);
    }

	@ParameterizedTest(name="#{index} - Test with Argument={0}")
    @ValueSource(strings = {"Peter King", "Arthur King", "Martin King"})
    void test_string_arrays(String arg) {
      String searchKey = "King";
      
      System.out.println("arg => "+arg);
      Assertions.assertTrue(arg.contains(searchKey));
    }  

}

