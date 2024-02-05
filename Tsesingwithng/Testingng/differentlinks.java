package Tsesingwithng.Testingng;


	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	public class differentlinks{

	@DataProvider
	@Test
		public Object[][]data(){
		
		Object[][]obj={
				{"sairam","sl@123"},
				{"ramkrisha","krashna@123"},
				{"student","passwpord123"},
				{"krishna","12345"},
		};
		return obj;
	} 
	@Test(dataProvider="data")
		public void login(String username,String pwd) throws InterruptedException
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		driver.close();

		
		
	}
		



		

	}





