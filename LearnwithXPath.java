package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnwithXPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.id("//*[@id=\"login\"]/p[1]/label"));
		
		elementUsername.sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("//*[@id=\"login\"]/p[3]/input")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GAVS");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ezhil");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String name=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println("name");
		
		
		
		
		
		
		
		
			
			
		}

}

