package week2.HomeAssignment.Sel.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelAssignmenttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * //Pseudo Code
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sathak");
		driver.findElement(By.id("lastNameField")).sendKeys("Sardhar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("SK");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sad");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I am a tester");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sathak.222@yopmail.com");
		
		Select option=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		option.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement contactUpdate = driver.findElement(By.id("updateContactForm_description"));
		contactUpdate.clear();
		contactUpdate.sendKeys("I am developer");
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Do Testing too");
		
		driver.findElement(By.xpath("//input[contains(@class,\"Submit\")]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
