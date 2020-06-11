package Com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsongroups {

	@Test(groups= {"smoketesting","sanitytesting"})
	public void login(){
			System.out.println("login");
			}
		
	@Test(groups={"smoketesting","regressiontesting"})
		public void search() {
		System.out.println("search");
		Assert.assertEquals("xyz", "abc");		
		}
	@Test(groups= {"smoketesting","retesting"})
		public void logout() {
				System.out.println("logout");
				
		}	
	
	
	
	
}
