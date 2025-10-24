package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {

	

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		 
		ChromeDriver driver=new ChromeDriver(options);
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click SFA
		driver.findElement(By.partialLinkText("SFA")).click();
		//click lead
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Fristname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sai");
		
		//lname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pod");
		
		//sourcedd
		
		WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate select class
		Select sel=new Select(sourceDD);
		sel.selectByIndex(2);
		
		
		//industryDD
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("IND_FINANCE");

 
		

	}

}
