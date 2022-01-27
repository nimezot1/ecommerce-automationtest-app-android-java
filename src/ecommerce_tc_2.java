import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;

public class ecommerce_tc_2 extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException { // TODO Auto-generated
																								// method stub
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

		// METODO PARA CLICAR NO PRIMEIRO E SEGUNDO IGUAIS EXISTENTE NA TELA. NÃO SE
		// PODE COLOCAR 1, 2, 3..... PARA ADD O PRODUTO NA CESTA
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);

		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double soma = 0;
		for (int i = 0; i < count; i++) {
			String amount = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			double amount2 = getAmount(amount);
			soma = soma + amount2;
		}
		
		

		//String preco2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		//double preco2valor = getAmount(preco2);

		//double somaPreco = preco1valor + preco2valor;
		System.out.println(soma + " < soma dos preços");

		String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		total = total.substring(1);

		double totalValor = Double.parseDouble(total);
		System.out.println(totalValor + " < valor total");
		Assert.assertEquals(soma, totalValor);
		
		//mobile gestures
		
		WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		
		WebElement terms = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		t.longPress(longPressOptions().withElement(element(terms)).withDuration(ofSeconds(2))).release().perform();
		
		String texto = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals(texto, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		
		driver.findElement(By.id("android:id/button1")).click();
	}

	public static double getAmount(String value) {
		value = value.substring(1);
		double amountValue = Double.parseDouble(value);
		return amountValue;
	}

}
