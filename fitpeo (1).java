package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fitpeo {

	public static void main(String[] args) throws InterruptedException {
		//To intialize the browser
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.fitpeo.com/");
		driver.manage().window().maximize();
				
		//To find the location linktext
		driver.findElement(By.linkText("Revenue Calculator")).click();
			    
	    Thread.sleep(4000);
		        
	    //To scrolling webpage
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
				
		//moving the slider position
		WebElement slider=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, -27, 0).perform();
				
	    Thread.sleep(4000);
			    
		//after moving the slider position
		WebElement textField = driver.findElement(By.id(":r0:"));
		textField.clear();
		act.sendKeys(textField,Keys.ENTER).perform();
		act.dragAndDropBy(slider, -65, 0).perform();
		Thread.sleep(4000);
				
		//To fill the checkboxes
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")).click();
						


	}

}
