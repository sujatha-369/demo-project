package testNGPractice;

import org.testng.annotations.Test;

public class GroupingExample {
  
  @Test(groups= {"Apple"})
  public void apple1() {
	  System.out.println("Apple Testing");
	  
  }
  
  @Test(groups= {"Apple"})
  public void apple2() {
	  System.out.println("Apple Testing");
  }
  
  @Test(groups= {"Samsung"})
  public void samsung1() {
	  System.out.println("Samsung Testing");
  }
  
  @Test(groups= {"Samsung"})
  public void samsung2() {
	  System.out.println("Samsung Testing");
  }
  
  @Test(groups= {"VIVO"})
  public void vivo1() {
	  System.out.println("VIVO Testing");
  }
  
  @Test(groups= {"V"})
  public void vivo2() {
	  System.out.println("VIVO Testing");
  }
  
  
  
}
