package com.Framework.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements FrameWorkConstants{

	static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openbrowser(@Optional("chrome")String browser){
		if(browser.equalsIgnoreCase("chrome")){
				System.setProperty(Chrome_path,Chrome_key);
		      driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty(Gecko_path,Gecko_key);
			driver = new FirefoxDriver();
		}
			}
	@AfterClass
	public void closebrowser(){
		driver.close();
	}
}

