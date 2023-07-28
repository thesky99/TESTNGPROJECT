package Demo1;

import org.testng.annotations.Test;

public class PriorityTest {
	
	 @Test
	 public void method1() {
	  
	  System.out.println("hello");
	 }
	 
	 @Test(priority=1)
	 public void method2() {
	  
	  System.out.println("hello1");
	 }
	 
	 
	 
	   @Test
	 public void method3() {
	  
	  System.out.println("hello2");
	 }
	 
	 

}
