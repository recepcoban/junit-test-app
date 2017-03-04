package junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.app.FindLetter;

public class AppTest1 {

	@BeforeClass
	public static void beforeClass() {
		System.err.println("JUnit Test - Start");
	}

	@AfterClass
	public static void afterClass() {
		System.err.println("JUnit Test - Finish");
	}

	@Before
	public void beforeEachTest() {
		System.out.println("---------------");
		System.out.println("starting " + new Object(){}.getClass().getEnclosingMethod().getName() + " method"); // give running method name
	}

	@After
	public void afterEachTest() {
		System.out.println("finishing " + new Object(){}.getClass().getEnclosingMethod().getName() + " method");
	}

	@Test
	public void testSonant() {
		FindLetter findLetter = new FindLetter();
		int sonant = findLetter.sonant("recepcoban");
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		Assert.assertEquals(5, sonant);
	}

	@Test
	public void testConsonant() {
		FindLetter findLetter = new FindLetter();
		int consonant = findLetter.consonant("recepcoban");
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		Assert.assertEquals(6, consonant);
	}

	/*@Test(timeout = 10)
	public void testForTimeout() {
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		while (true) {
			// code
		}
	}*/
	
	/*@Test(expected = Exception.class)
	public void testForException() {
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		// code
	}*/

	@Ignore
	@Test
	public void ignoreTest() {
		FindLetter findLetter = new FindLetter();
		int result = findLetter.sonant("ignore test");
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void assertTrue(){
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		Assert.assertTrue("assertTrue".equals("assertTrue"));
	}
	
	/*@Test
	public void assertFalse(){
		System.err.println("method : " + new Object(){}.getClass().getEnclosingMethod().getName());
		Assert.assertFalse(1 == 2);
	}*/

}
