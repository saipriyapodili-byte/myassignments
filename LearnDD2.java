package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnDD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//click on the phone tab
		//driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter the phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		//click Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String leadID = driver.findElement(By.xpath(
                "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))
                .getText();
        System.out.println("Captured Lead ID: " + leadID);

        // 1️⃣2️⃣ Click on the first resulting lead
        driver.findElement(By.xpath(
                "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))
                .click();

        // 1️⃣3️⃣ Click "Delete" button
        driver.findElement(By.linkText("Delete")).click();

        driver.findElement(By.linkText("Find Leads")).click();

        driver.findElement(By.name("id")).sendKeys(leadID);

        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // 1️⃣7️⃣ Verify the "No records to display" message
        String message = driver.findElement(By.className("x-paging-info")).getText();
        if (message.equals("No records to display")) {
            System.out.println("✅ Lead successfully deleted!");
        } else {
            System.out.println("❌ Lead not deleted. Message: " + message);
        }

        // 1️⃣8️⃣ Close browser
        driver.quit();
	
	
	
	}

}
