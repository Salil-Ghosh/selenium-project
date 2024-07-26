import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	public class ExampleTest {
		@BeforeSuite
		public void runOnce() {
			System.out.println("This is the @BeforeSuite method");
		}

		@BeforeClass
		public void runOnce21() {
			System.out.println("This is the @Beforeclass method");
		}
		@AfterClass
		public void runOnce31() {
			System.out.println("This is the @Afterclass method");
		}

		@Test
		public void testOne() {
			System.out.println("This is the testOne method");
		}

		@AfterTest
		public void runForEachTest2() {
			System.out.println("This is the @AfterTest method");
		}

		@BeforeTest
		public void runForEachTest3() {
			System.out.println("This is the @BeforeTest method of test2");
		}
		@Test
		public void testTwo() {
			System.out.println("This is the testTwo method");
		}
		@AfterTest
		public void runForEachTest4() {
			System.out.println("This is the @AfterTest method test2");
		}
		@BeforeMethod
		public void runOnc5() {
			System.out.println("This is the @BeforemethodE method");
		}
		@AfterMethod
		public void runOnce4() {
			System.out.println("This is the @AFTERmethodE method");
		}
		@BeforeSuite
		public void runOnce2() {
			System.out.println("This is the @BeforeSuite method2");
		}
		@AfterSuite
		public void runOnce3() {
			System.out.println("This is the @AFTERSUITE method");
		}
		public void runOnce323() {
			System.out.println("This is the Normal method");
		}



	}
}
