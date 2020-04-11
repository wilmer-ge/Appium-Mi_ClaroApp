package com.appclaro.automatizacion.ProyectoBase;

import com.appclaro.automatizacion.ProyectoBase.Main;
import com.appclaro.automatizacion.ProyectoBase.Login;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest {	
	
	Main myMain = new Main();
	Logger log = Logger.getLogger(LoginTest.class);
	Login myLogin = new Login(myMain);
		
	@BeforeSuite
    public void setup() throws MalformedURLException {	
		log.info("Capturando driver");
		myMain.getDriver(); 
    }
    
	@Test (priority = 0)
    public void cp001_LoginPersonas() throws InterruptedException, MalformedURLException {
		log.info("**********Inicio Test cp001_LoginPersonas***********");
		log.info("Definiendo datos de login");
		myLogin.execLogin("franklinegonzales@gmail.com", "Frank2020");
		log.info("**********Fin Test cp001_LoginPersonas***********");
    }
	
	@Test (priority = 1)
    public void cp002_CerrarSesionPersonas() throws InterruptedException, MalformedURLException {
		log.info("**********Inicio Test cp002_CerrarSesionPersonas***********");
		log.info("Ejecutando logout");
		myLogin.execLogout();
		log.info("**********Fin Test cp002_CerrarSesionPersonas***********");
    }
	
	@AfterSuite
    public void teardown() throws MalformedURLException{
      log.info("**********Fin Test cp001_LoginPersonas***********");
      myMain.getDriver().quit();
      log.info("**********Driver cerrado***********");
    }
}


