package Global_environment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global_value_drive
{
	public static void main(String[] args) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Win H\\workspace\\TestNG_Udemy\\src\\data.proprities");
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Win H\\workspace\\TestNG_Udemy\\src\\data.proprities");
		prop.store(fos, null);
		
	}

}
