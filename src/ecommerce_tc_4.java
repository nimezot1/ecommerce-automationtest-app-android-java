import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_4 extends base {

	public static void main(String[] args) throws MalformedURLException { // TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();

		driver.findElement(By.xpath("//*[@text='Female']")).click();

		driver.findElement(By.id("android:id/text1")).click();

		// SCROLL SIMPLES PARA ENCONTRAR O ELEMENTO
		WebElement tap_brazil = driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));");
		t.tap(tapOptions().withElement(element(tap_brazil))).perform();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		System.out.println(driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size());

		// com.androidsample.generalstore:id/rvProductList
		// WebElement radioGroup = driver.findElement(AppiumBy.androidUIAutomator("new
		// UiScrollable(new
		// UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new
		// UiSelector().text(\"Radio Group\"));"));
		// assertNotNull(radioGroup.getLocation());

		// SCROLL PADRÃO PARA ENCONTRAR O ELEMENTO
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Nike SFB Jungle\").instance(0));"));

		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if (text.equalsIgnoreCase("Nike SFB Jungle")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	}

}
