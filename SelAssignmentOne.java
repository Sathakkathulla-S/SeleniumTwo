package week2.HomeAssignment.Sel.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelAssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//launch browser
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement creatNew = driver.findElement(By.linkText("Create new account"));
		creatNew.click();
		driver.findElement(By.name("firstname")).sendKeys("Sathak");
		driver.findElement(By.name("lastname")).sendKeys("Sardhar");
		driver.findElement(By.name("reg_email__")).sendKeys("789456441");
		driver.findElement(By.name("reg_passwd__")).sendKeys("hggsteg");
		Select options = new Select(driver.findElement(By.id("day")));
		options.selectByValue("8");
		Select choose = new Select(driver.findElement(By.id("month")));
		choose.selectByIndex(2);
		Select list = new Select(driver.findElement(By.id("year")));
		list.selectByValue("1994");
		
		driver.findElement(By.xpath("//input[@value=2]")).click();
		
	}

}
