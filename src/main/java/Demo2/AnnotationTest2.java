package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationTest2 {
	
	@Test
	 public void method1() {
	  
	  System.out.println("i am method1 from class test2");
	 }
	 
	 
	 @Test
	 public void method2() {
	  
	  System.out.println("i am method2 from class test2");
	 }
	 
	 @AfterClass
	 public void method3() {
	  System.out.println("i am method3 from class test2 afterclass");
	 }
	 
	 
	 @BeforeClass
	 public void method4() {
	  System.out.println("i am method4 from class test2 beforeClass");
	 }

}
