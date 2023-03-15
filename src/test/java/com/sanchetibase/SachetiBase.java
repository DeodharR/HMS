package com.sanchetibase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SachetiBase {
	
	public WebDriver driver;
	//@Parameters("browser")
	@BeforeClass
	public void StartBrowser(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		//driver.get("https://sanchetihospital.org/");
		driver.get("https://www.pawanahospital.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}*/
	//Screenshot
		public void getscreenshot(String screenshotName) throws IOException{
			//take screenshot and store it in file format. 
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//copy in location
			FileUtils.copyFile(file, new File("./Screenshots/" +screenshotName +".png"));

		}

}
