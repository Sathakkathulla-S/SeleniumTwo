package week2.HomeAssignment.Sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("sathak.222@yopmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		 String name = fname.getText();
		 System.out.println(name);
		 fname.click();	 
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(3000);
			String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
				if (title.equals("Duplicate Lead")){
				System.out.println("Title verified successfully");
					}else {
				System.out.println("Page did not load to the required title");
					}
		driver.findElement(By.name("submitButton")).click();
		String fname1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (name.equals(fname1)){
			System.out.println("Duplicate created successfully");
		}else {
			System.out.println("The name is different and duplicate is not successfully created");
		}
		driver.close();

	}

}
