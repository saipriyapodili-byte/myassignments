package week2.day1;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        
		//Load the URL
		driver.get("https://en-gb.facebook.com/");

		//Maximize window
		driver.manage().window().minimize();

		//Add implicit wait
//		driver.
//		implicitly_wait(10);
		driver.findElement(By.id(null))
		//Click on "Create new account"
		create_btn = driver.find_element(By.XPATH, "//a[text()='Create new account']");
		create_btn.click();

		//Wait a bit for the signup form to appear
		time.sleep();

		//Enter first name
		driver.findElement(By.id("firstname")).sendKeys("Bhaa");

		//Enter surname
		driver.findElement(By.id("lastname")).sendKeys("Craft");
		 
		driver.

		//Enter mobile number or email
		driver.findElement(By.id("reg_email__").sendkeys("bhaacraft@example.com");

		//Enter new password
		driver.findElement(By.id("reg_passwd__").sendkeys("SuperSecret123!");

		//Handle dropdowns for Date of Birth
		day_Dropdown = Select(driver.find_element(By.ID, "day"));
		Month.dropdown = Select(driver.find_element(By.ID, "month"));
		Year.dropdown = Select(driver.find_element(By.ID, "year"));

		day_dropdown.select_by_visible_text("15");
		month_dropdown.select_by_visible_text("May");
		year_dropdown.select_by_visible_text("2009");

		//Select gender radio button (e.g., Male)
		gender.radio = driver.find_element(By.XPATH, "//label[text()='Male']/following-sibling::input");
		gender.radio.click();

		//Optional: pause to see the filled form before closing
		Thread.sleep(5);

		//Close the browser
		driver.quit();

		

			}

		}

	}

}
