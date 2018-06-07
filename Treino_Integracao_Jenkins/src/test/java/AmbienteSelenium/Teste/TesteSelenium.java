package AmbienteSelenium.Teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteSelenium {
	
	public static void main(String[]args){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\erick.silva\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/1desafio/"); 
		driver.quit();
		
	}	
		
}		
