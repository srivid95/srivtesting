package testcase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headlessbrowser {
	
	public static void main(String[]args) {
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
