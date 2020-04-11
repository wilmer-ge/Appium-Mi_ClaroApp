package com.appclaro.automatizacion.ProyectoBase;
import com.appclaro.automatizacion.ProyectoBase.Main;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Login {	
		
	Main myMain;
	
	Logger log = Logger.getLogger(Login.class);
	    
	/** ELEMENTOS*/	
		By linkPersonas = By.id("com.clarocolombia.miclaro:id/acceso_personas");
		By txtUsuario = By.id("com.clarocolombia.miclaro:id/usuario");
		By txtContrasena = By.id("com.clarocolombia.miclaro:id/et_password");
		By btnIniciarSesion = By.id("com.clarocolombia.miclaro:id/btn_iniciar_sesion");
		By lblMiClaro = By.id("com.clarocolombia.miclaro:id/ivHomeMiClaro");
		
		By menPrincipal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[3]");
		By btnCerrarSesion = By.id("com.clarocolombia.miclaro:id/tvCerrarSesion");
		By btnAceptarCerrarSesion = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
				

	/** CONSTRUCTOR */
	    public Login(Main myMain) {
			this.myMain = myMain;
		}
	    
	    /** EVENTOS (ACCIONES) */
	    
	    public void clickLinkPersonas() throws InterruptedException, MalformedURLException {
			
	    	this.myMain.WaitElement(linkPersonas);
	    	this.myMain.driver.findElement(linkPersonas).click();
		}
	
		public void setTxtUsuario(String mail) throws MalformedURLException {
			
			this.myMain.WaitElement(txtUsuario);
			this.myMain.driver.findElement(txtUsuario).clear();
			this.myMain.driver.findElement(txtUsuario).sendKeys(mail);		
		}
	
		public void setTxtContrasena(String password) throws MalformedURLException {
			
			this.myMain.WaitElement(txtContrasena);
			this.myMain.driver.findElement(txtContrasena).clear();
			this.myMain.driver.findElement(txtContrasena).sendKeys(password);
		}
	
		public void clickBtnIniciarSesion() throws MalformedURLException {
			
			this.myMain.WaitElement(btnIniciarSesion);
			this.myMain.driver.findElement(btnIniciarSesion).click();
		}
		
		public void getlblMiClaro() throws MalformedURLException {
					
			this.myMain.WaitElement(lblMiClaro);
			this.myMain.driver.findElement(lblMiClaro).getId();
				}
		
		public void clickMenPincipal() throws MalformedURLException {
			
			this.myMain.WaitElement(menPrincipal);
			this.myMain.driver.findElement(menPrincipal).click();
		}
		
		public void clickbtnCerrarSesion() throws MalformedURLException {
			
			this.myMain.WaitElement(btnCerrarSesion);
			this.myMain.driver.findElement(btnCerrarSesion).click();
		}
		
		public void clickbtnAceptarCerrarSesion() throws MalformedURLException {
			
			this.myMain.WaitElement(btnAceptarCerrarSesion);
			this.myMain.driver.findElement(btnAceptarCerrarSesion).click();
		}
		
	
		/** METODO */
	
		public void execLogin(String usuario, String contrasena) throws InterruptedException, MalformedURLException {
			this.clickLinkPersonas();
			this.setTxtUsuario(usuario);
			this.setTxtContrasena(contrasena);
			this.clickBtnIniciarSesion();
			this.getlblMiClaro();
		}
		
		public void execLogout () throws InterruptedException, MalformedURLException {
			this.clickMenPincipal();
			log.info("clickMenPincipal");
			this.clickbtnCerrarSesion();
			log.info("clickbtnCerrarSesion");
			this.clickbtnAceptarCerrarSesion();
			log.info("clickbtnAceptarCerrarSesion");
		}
		
	}
