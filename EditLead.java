package week2.HomeAssignment.Sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sathak"); 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(2000);
			String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
				if (title.equals("View Lead")){
				System.out.println("Title verified successfully");
					}else {
				System.out.println("Page did not load to the required title");
					}
		driver.findElement(By.linkText("Edit")).click();
		WebElement edit = driver.findElement(By.id("updateLeadForm_companyName"));
		String oldName = edit.getText();
				edit.clear();				
				edit.sendKeys("TestLeaf Systems");
		driver.findElement(By.name("submitButton")).click();
		
		 WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		 String name=text.getText();
		 System.out.println(name);
		
			if (oldName.equals(name)) {
				System.out.println("The name hasn't been updated");
			}else {
				System.out.println("The name has been updated");
			}
			
		//driver.close();

	}

}
