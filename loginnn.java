package bbvv;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginnn {
	WebDriver driver;
//	@BeforeTest
//	public void bt() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	@Test(enabled = false)
//	public void tc1() {
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//	}
//	@After
//	public void at() {
//		driver.close();
//	}
	@Test
	public void revstr() {
		
		//Using StringBuilder
		String str="vandana";
		String str1=" ";
		StringBuilder res=new StringBuilder();
		res.append(str);
		res.reverse();
		System.out.println(res);
		
		
		//Using for loop
		
		String str5="vandana";
		char[] arr=str5.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}
}









