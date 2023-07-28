package Demo1;

	import org.testng.annotations.Test;

	public class OtherAnnotations {

	 @Test(invocationCount=10)
	 public void method1() {
	  System.out.println("hello");
	 }

	 
	 @Test(timeOut = 1000)
	 public void method2() {
	  
	  System.out.println("hello");
	 }
	 
	 
	 @Test(enabled=false)
	 public void method3() {
	  
	  System.out.println("hello");
	 }
	 

}
