package week2.day1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	     ChromeDriver driver =new ChromeDriver();

		//# 2️⃣ Load the url
		driver.get("https://www.facebook.com/");

		//#Maximize window (optional)
		driver.manage().window().maximize();

		//# 3️⃣ Enter the email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");

		//# 4️⃣ Enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");

		//# 5️⃣ Click on the Login button
		driver.findElement(By.name("login")).click();

		//# Wait for the page to load
		Thread.sleep(3);

		//# 6️⃣ Print the title of the current web page
		System.out.print("Page Title after login:"+driver.getTitle());

		//# (Optional) Close the browser after checking
		driver.quit();
				
	}

}
