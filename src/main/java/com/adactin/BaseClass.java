package com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browername) {
		try {
			if (browername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Abinash\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.out.println("invalid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void currenturl() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void forward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void backward() {
		try {
			driver.navigate().back();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void quite() {
		try {
			driver.quit();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void getTitle() {
		try {
			driver.getTitle();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void screenshot(String path) throws IOException {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			File destinateFile = new File(path);
			FileUtils.copyFileToDirectory(sourceFile, destinateFile);
		} catch (WebDriverException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void selection(WebElement element, String Option, String Value) {
		Select sc = new Select(element);

		try {
			if (Option == "byIndex") {
				int parseInt = Integer.parseInt(Value);
				sc.selectByIndex(parseInt);

			} else if (Option == "byValue") {
				sc.selectByValue(Value);

			} else if (Option == "ByVisibleText") {
				sc.selectByVisibleText(Value);

			} else {
				System.out.println("Invalid Option");
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}

	}

	public static void inputValueElement(WebElement element, String Value) {
		try {
			element.sendKeys(Value);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}

	public static void confirmAlert(String Ok, String Cancel) {
		try {
			if (Ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();

			} else if (Cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void promptAlert(String Value, String Ok, String Cancel) {
		try {
			if (Ok.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().sendKeys(Value);
				driver.switchTo().alert().accept();

			} else if (Cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().sendKeys(Value);
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void actionMethod(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(Element).build().perform();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void actionMoveToElement(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionMoveToElementClick(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(Element).click().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void frame() {

		driver.switchTo().frame(0);
	}
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}
}
