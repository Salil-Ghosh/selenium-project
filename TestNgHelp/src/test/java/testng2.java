import org.testng.annotations.Test;

public class testng2 {
	@Test
	public void testOne() {
		System.out.println("This is class 2 the testOne method");
	}


	@Test
	public void testTwo() {
		System.out.println("This is class 2 the testTwo method");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("This is class 2 the test3 method");
	}
	@Test(priority=1)
	public void test4() {
		System.out.println("This is class 2 the test4 method");
	}
}
