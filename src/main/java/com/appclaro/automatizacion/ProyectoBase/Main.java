package com.appclaro.automatizacion.ProyectoBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Main {

	public AndroidDriver<MobileElement> driver;
	Logger log = Logger.getLogger(Login.class);

    public AndroidDriver<MobileElement> getDriver()  throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "HUAWEI p30 Pro");
		caps.setCapability("udid", "45C0219719001807"); //Give Device ID of your mobile phone
		//caps.setCapability("udid", "618aaab5"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.clarocolombia.miclaro");
		caps.setCapability("appActivity", "com.clarocolombia.miclaro.activities.Splash");
		caps.setCapability("noReset", "true");	
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
        return driver;
	}
	
	public boolean WaitElement(By elemento) throws NoSuchElementException {
		log.info("Entrando en WaitElement! "+elemento.toString());
		boolean existe = false;
		int intentos = 0;
		while (!existe && intentos <= 1) {
			try {
				log.info("Dentro del try"+elemento.toString());
				if (driver.findElement(elemento).isDisplayed() || driver.findElement(elemento).isEnabled()) {
					existe = true;
					log.info("Existe "+elemento.toString());
				} else {
					log.info("Else Existe "+elemento.toString());
					Thread.sleep(5000);
					intentos++;
				}

				if (intentos == 1) {
					throw new Exception("Elemento no encontrado");
					
				}
			} catch (Exception e) {
				intentos = 2;
				existe = false;
				log.info("Existe false "+elemento.toString());
			}
		}
		return existe;
	}
}
