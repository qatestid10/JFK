package mainpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\qatestid12\\Chrome drivers\\New folder\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.ie.driver", "D:\\qatestid12\\32bit\\New folder\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
//

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement username;
		username = driver.findElement(By.id("input-email"));
		 username.sendKeys("mytc5@gmail.com");
				   
		WebElement Password;
		Password = driver.findElement(By.id("input-password"));
		Password.sendKeys("123456789");
				   
		WebElement loginButton;  
		loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginButton.click();
	
		System.out.println("Fianls Resultss");
	
		String actualpagetitle = "";
		String expectedTitle = "My Account";
		actualpagetitle  = driver.getTitle();
	
		System.out.println(actualpagetitle);
		
		if (actualpagetitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		String url = "";
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (actualpagetitle.contains("Account")){
            System.out.println("URL Test Passed!");
        } else {
            System.out.println("URL Test Failed");
        }
		
	/*	
			driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=HP+LP3065");
		
			WebElement Addtocart  = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", Addtocart);
			
			Addtocart.click();
			
		
			Thread.sleep(2000);
			
			WebElement opencartoption;
			opencartoption = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
			opencartoption.click();
			Thread.sleep(2000);
			WebElement check_out;
			check_out = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
			check_out.click();
			
		
			WebDriverWait wait2 = new WebDriverWait(driver,20);
			wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("button-payment-address")));

			
			WebElement Billing_details  = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].scrollIntoView()", Billing_details);
			
			Billing_details.click();
			
			Thread.sleep(3000);
			
			WebElement Delivery_Details  = driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));
			JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			jse3.executeScript("arguments[0].scrollIntoView()", Delivery_Details);
			
			Delivery_Details.click();
			
			Thread.sleep(5000);
			
			System.out.println("clicked"); 
			
			WebElement Delivery_Method  = driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]"));
			JavascriptExecutor jse4 = (JavascriptExecutor)driver;
			jse4.executeScript("arguments[0].scrollIntoView()", Delivery_Method);
			
			Delivery_Method.click();
			
			Thread.sleep(5000);
			
			WebElement Payment_Method   = driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]"));
			JavascriptExecutor jse5 = (JavascriptExecutor)driver;
			jse5.executeScript("arguments[0].scrollIntoView()", Payment_Method);
			
			WebElement select_checkbox = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]"));
			select_checkbox.click();
			
			
			Payment_Method.click();
			
			System.out.println("clicked"); 
			
	*/		
			
			driver.close();
			driver.quit();
	}

}
