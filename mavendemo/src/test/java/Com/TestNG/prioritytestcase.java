package Com.TestNG;

import org.testng.annotations.Test;

public class prioritytestcase {
	
	
	@Test(priority=3,description="firsttestcase")
public void testcase1(){
		System.out.println("testcase1");
		}
	
	@Test(priority=1)
	public void testcase2() {
			System.out.println("testcase2");
	}
	@Test(priority=2)
	public void testcase3() {
			System.out.println("testcase3");
			
	}	
			
	
}
