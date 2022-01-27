import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;



public class scriptPalmeirasWhatsapp extends base {

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException { // TODO Auto-generated
																								// method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
		
		//SCRIPT HINO DO PALMEIRAS
		
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		driver.findElements(By.id("com.sec.android.app.launcher:id/hotseat_icon")).get(3).click();
		
		driver.findElement(By.xpath("//*[@text='Tiago']")).click();
		
		
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Quando surge o alviverde imponente");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("No gramado em que a luta o aguarda");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Sabe bem o que vem pela frente");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Que a dureza do prélio não tarda!");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("E o Palmeiras no ardor da partida");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Transformando a lealdade em padrão");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Sabe sempre levar de vencida");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("E mostrar que, de fato, é campeão!");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Defesa que ninguém passa");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Linha atacante de raça");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Torcida que canta e vibra");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Defesa que ninguém passa");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Linha atacante de raça");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Torcida que canta e vibra");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Por nosso alviverde inteiro");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Que sabe ser brasileiro");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Ostentando a sua fibra!");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Quando surge o alviverde imponente");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("No gramado em que a luta o aguarda");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Sabe bem o que vem pela frente");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Que a dureza do prélio não tarda!");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("E o Palmeiras no ardor da partida");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Transformando a lealdade em padrão");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Sabe sempre levar de vencida");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("E mostrar que, de fato, é campeão!");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Defesa que ninguém passa");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Linha atacante de raça");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Torcida que canta e vibra");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Defesa que ninguém passa");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Linha atacante de raça");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Torcida que canta e vibra");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Por nosso alviverde inteiro");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Que sabe ser brasileiro");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Ostentando a sua fibra!");
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		
		
		
		
		//int limite = 100;
		//for (int i = 1; i < limite; i++) {
		//	driver.findElement(By.xpath("//*[@text='Mensagem']")).sendKeys("Tem verdão amanhã - teste > " + i + " de " +  limite);
		//	driver.findElement(By.id("com.whatsapp:id/send")).click();
		//}
		
	}
}
