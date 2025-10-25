package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftaps {
    public static void main(String[] args) throws InterruptedException {

        // Initialize the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Enter username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter First Name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhaa");

        // Enter Last Name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Craft");

        // Enter Company Name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NASA");

        // Enter Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Astronomer");

        // Click Create Lead button
        driver.findElement(By.name("submitButton")).click();

        // Wait a bit to see result (optional)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
