package RealTimeExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();
		String optionSelected =driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
		System.out.println(optionSelected);
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(optionSelected);
		driver.findElement(By.id("name")).sendKeys(optionSelected);
		driver.findElement(By.id("alertbtn")).click();
		String  text =	driver.switchTo().alert().getText();
		System.out.println(text.contains(optionSelected));
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product\"]/tbody[1]/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product\"]/tbody[1]/tr[2]/td[1]")).getText().equals("Rahul Shetty"));
		
	}

}
