package moudlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
ChromeDriver driver;
public WebDriver openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	
}
public void Enterurl() {
	driver.get("https:/");
	
}

public void login() {
	driver.findElement(By.name("Email")).clear();
	driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Password")).sendKeys("admin");
	driver.findElement(By.className("Loginbutton")).click();
	driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
}
public void closeBrowser() {
	driver.close();
}
}
