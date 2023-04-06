package week2.HomeAssignment.Sel.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("878987");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		 String leadno = leadId.getText();
		System.out.println(leadno);
		 leadId.click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(leadno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			if (msg.contains("No records to display")){
				System.out.println("Record deleted successfully");
			}else {
				System.out.println("Record is not deleted successfully");
			}
			
		driver.close();

	}

}
