package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationW {
	
	@BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }
	  
    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass");
    }
  
	@BeforeMethod
    public static void beforeMethod() {
        System.out.println("@BeforeMethod");
    }
	
	@AfterMethod
    public static void afterMethod() {
        System.out.println("@AfterMethod");
    }
    @BeforeSuite
    public void setUp() {
        System.out.println("@Before Suite");
    }
  
    @AfterSuite
    public void tearDown() {
        System.out.println("@After Suite");
    }
  
    @Test
    public void testFirst() throws Exception {
        System.out.println("First test");
    }
  
    @Test
    public void testSecond() throws Exception {
        System.out.println("Second test");
    }
  
    @Test
    public void testThird() throws Exception {
        System.out.println("Third test");
    }

}
