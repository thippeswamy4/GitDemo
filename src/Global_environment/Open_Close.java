package Global_environment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Close {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream
		("C:\\Users\\Win H\\workspace\\TestNG_Udemy\\src\\Global_environment\\Script_data.proprities");
		prop.load(fis);
	
		System.setProperty("prop.getProperty("+"Key"+")","prop.getProperty("+"value"+")");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
		
//		System.out.println(prop.getProperty("Key"));
//		System.out.println(prop.getProperty("value"));
		
		
		
	}

}
