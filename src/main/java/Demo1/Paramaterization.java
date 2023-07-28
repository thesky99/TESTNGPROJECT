package Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramaterization {
 
 @Test
 @Parameters({"url","username"})
 public void method1(String urlNew,String username) {
  System.out.println(urlNew);
  System.out.println(username);
 }
 
 

}
