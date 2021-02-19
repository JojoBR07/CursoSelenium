package selenium.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocator {

	static WebDriver driver;

	public static void main(String[] args) {

		TesteLinkText();

	}

	public static void TesteFacebook() {

		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("email@email.com");

		driver.findElement(By.id("pass")).sendKeys("senha");

		driver.findElement(By.id("Entrar")).click();

	}

	public static void TesteTagEClass() {

		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		List<WebElement> label = driver.findElements(By.tagName("label"));

		System.out.println(label.size());

		for (WebElement webElement : label) {
			System.out.println(webElement.getText());
		}
	}

	public static void TesteClassName() {

		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.trivago.com.br");

		((WebElement) driver.findElements(By.className("siteheader__control"))).click();

	}
	
	public static void TesteLinkText() {

		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		((WebElement) driver.findElements(By.partialLinkText("Esqueceu a senha?"))).click();

	}

}
