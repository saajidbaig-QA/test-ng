package Tsesingwithng.Testingng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.findElement(By.id("twotabsearchtextbox")).click();
driver.getTitle();
driver.close();

	}

}
