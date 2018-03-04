package javaPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MathOperation {
	

	public static EventFiringWebDriver eventdriver;
	
	public static void main(String[] args) throws IOException {
		
		 long number=(long)Math.floor(Math.random()*900000000)+100000000l;
		System.out.println(number);
		
		File obj=eventdriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(obj, new File("./snapshots/"+number+".jpg"));
		
		

	}
	
}
