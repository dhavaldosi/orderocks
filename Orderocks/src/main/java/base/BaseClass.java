package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initialzeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\resources\\config.properties");
		prop.load(fis);
		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Found url : " + prop.getProperty("url"));
		return driver;
	}

	public void getScreenShot(String fileName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\screenshots\\" + fileName + "_screenshot_"
				+ System.currentTimeMillis() + ".png"));
	}

	public void waitForelement(WebElement locator) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
	}

	public void clickOnElement(WebElement locator) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
			locator.click();
			log.info("Clicked on :" + locator.toString());
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
			new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(locator));
			js.executeScript("arguments[0].click();", locator);
			log.info("Clicked on using JS : " + locator);
		}
	}
	
	public void normalClickOnElement(WebElement locator) {
			new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(locator));
			new WebDriverWait(driver, Duration.ofSeconds(80)).until(ExpectedConditions.elementToBeClickable(locator));
			locator.click();
			log.info("Clicked on :" + locator.toString());
	}

	public void type(WebElement locator, String value) {
		waitForelement(locator);
		locator.sendKeys(value);
		log.info("Entered value in :" + locator);
	}

	public void switchToIframe(WebElement locator) {
		waitForelement(locator);
		driver.switchTo().frame(locator);
		log.info("Switched to frame : " + locator);
	}
	
	public void hoverOnElement(WebElement locator) {
		Actions actions = new Actions(driver);
	    actions.moveToElement(locator).perform();
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
		log.info("Switched to default frame");
	}

}