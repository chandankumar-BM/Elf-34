package com.Framework.Library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture extends BaseTest{
public static String Screencapture(){
		LocalDateTime systemdate=LocalDateTime.now();
		 String Report=systemdate.toString().replaceAll(":","-");
		 String imgpath="./Screenshots/"+Report+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File(imgpath);
		try {
			FileHandler.copy(temp,perm);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "."+imgpath;
	}
	
}

