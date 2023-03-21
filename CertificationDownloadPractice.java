package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CertificationDownloadPractice {
	public static void main(String[] args) {
		System.out.println("Hello Manish Arya");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
        
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		 
		driver.get("https://www.karvy.com/");
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
	}

}
