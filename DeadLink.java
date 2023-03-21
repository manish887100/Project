package Pack1;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeadLink {
	public static void main(String[] args) {
		System.out.println("Hello Manish Arya");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("http://www.deadlinkcity.com/");
	   
	   //find hyperlink
	   
	   List <WebElement> LinkList=driver.findElements(By.tagName("a"));
	   
	   System.out.println(LinkList.size());
	   
	   for(WebElement element:LinkList) {
		   
		   String url=element.getAttribute("href");
		   try {
			   URL urllink=new URL(url);
			   
			   
		   }
		   
		   
	   }
	   
	   
	   
	}

}
