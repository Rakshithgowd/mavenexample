package mavenexample.demo;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int r=c.addNos(100, 200);
		System.out.println("Addition is:"+r);
		
		int n=c.subNos(300,150);
		System.out.println("Subtraction is:"+n);
	}

}
