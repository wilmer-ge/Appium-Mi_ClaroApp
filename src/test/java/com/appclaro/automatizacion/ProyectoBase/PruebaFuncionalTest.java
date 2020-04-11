package com.appclaro.automatizacion.ProyectoBase;


import java.net.MalformedURLException;



import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PruebaFuncionalTest {

	Main myMain = new Main();

	@BeforeSuite
	public void setup() throws MalformedURLException {	
		myMain.getDriver(); 
	}

	/***********************************************************/
	/************************TEST POSTPAGO**********************/
	/***********************************************************/
	
	@Test //(priority = 1)
	public void cp001DetalleConsumos() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execDetalleDeConsumos();	
	}

	@Test(priority=2,dependsOnMethods="cp001_Postpago")//(priority = 2)
	public void cp002PagaTuFactura() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execPagaTuFactura();	
	}

	@Test//(priority = 13)
	public void cp001_Postpago() throws InterruptedException, MalformedURLException {	
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execPostPago();
	}

	@Test(priority = 3)
	public void cp003DetalleDeTuPlan() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execDetalleDeTuPlan();	
	}

	//@Test//(priority = 4)
	//public void cp004RecargasyPaquetes() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execRecargasyPaquetes();	
	//}


	//@Test//(priority = 5)
	//public void cp005FamiliayAmigos() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execFamiliayAmigos();	
	//}

	//@Test//(priority = 6)
	//public void cp006RoamingInternacional() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execRoamingInternacional();	
	//}

	//@Test//(priority = 7)
	//public void cp007GestionaTuEquipo() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execGestionaTuEquipo();	
	//}

	//@Test//(priority = 8)
	//public void cp008execCambiaTuNumero() throws InterruptedException, MalformedURLException {
	//	PruebaFuncional myPrueba = new PruebaFuncional(myMain);
	//	myPrueba.execCambiaTuNumero();	
	//}

	//@Test//(priority = 9)
	//public void cp009execRedimeBeneficios() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		// 7myPrueba.execRedimeBeneficios();	
	//}

	//@Test//(priority = 10)
	//public void cp010execCentroVentas() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execCentroVentas();	
	//}

	//@Test//(priority = 11)
	//public void cp011execChateaConNosotros() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execChateaConNosotros();	
	//}

	//@Test//(priority = 12)
	//public void cp012execRecomendados() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execRecomendados();	
	//}


	/***********************************************************/
	/*************************TEST PREPAGO**********************/
	/***********************************************************/

	@Test(dependsOnMethods = { "cp013_Prepago" })  //(priority = 14)
	public void cp014_execSaldosConsumos() throws InterruptedException, MalformedURLException {	
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execSaldosConsumos();
	}

	@Test(priority = 15)
	public void cp015_execDetallePlanPre() throws InterruptedException, MalformedURLException {	
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execDetallePlanPre();
	}

	@Test(priority = 13)
	public void cp013_Prepago() throws InterruptedException, MalformedURLException {	
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execPrepago();
	}

//	@Test(priority = 16)
	//public void cp016_execGestionaEquipoPre() throws InterruptedException, MalformedURLException {	
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
	//	myPrueba.execGestionaEquipoPre();
	//}

//	@Test(priority = 17) //(dependsOnMethods = { "cp013_Prepago" })
//	public void cp017_execRecargasPaquetesPre() throws InterruptedException, MalformedURLException {	
//		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
//		myPrueba.execRecargasPaquetesPre();
//	}

	//@Test(priority = 18)
	//public void cp018_execElegidosPre() throws InterruptedException, MalformedURLException {	
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execElegidosPre();
	//}

	//@Test(priority = 19)
	//public void cp019_execEntraLadoClaro() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execEntraLadoClaro();
	//}

	//@Test(priority = 20)
	//public void cp020_execAdministraNavegacion() throws InterruptedException, MalformedURLException {	
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execAdministraNavegacion();
	//}

	//@Test(priority = 21)
	//public void cp021_execRedimeBeneficiosHogar() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execRedimeBeneficiosHogar();
	//}

	//@Test(priority = 22)
	//public void cp022_execClaroGaming() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execClaroGaming();
	//}

	//@Test(priority = 23)
	//public void cp023_execCentroAtencionVentasPre() throws InterruptedException, MalformedURLException {	
	//	PruebaFuncional myPrueba = new PruebaFuncional(myMain);
	//	myPrueba.execCentroAtencionVentasPre();
	//}

	//@Test(priority = 24)
	//public void cp024_execChateaConNosotrosPre() throws InterruptedException, MalformedURLException {	
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execChateaConNosotrosPre();
	//}


	//@Test(priority = 25)
	//public void cp025_execRecomendadosHogar() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execRecomendadosHogar();
	//}

	//@Test(priority = 26)
	//public void cp026_execAdquirirProducto() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execAdquirirProducto();
	//}

	//@Test(dependsOnMethods = { "cp013_Prepago" })//(priority = 27)
	//public void cp027_execDesasociarCuenta() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execDesasociarCuenta();
	//}
/*
	@Test(priority = 28)
	public void cp028_execClaroVideoPre() throws InterruptedException, MalformedURLException {	
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execClaroVideoPre();
	}

	@Test(priority = 29)
	public void cp029_execClaroMusicaPre() throws InterruptedException, MalformedURLException {	
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execClaroMusicaPre();
	}
*/
	//@Test(priority = 30)
	//public void cp030_execStreamingVivoPre() throws InterruptedException, MalformedURLException {
		//PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		//myPrueba.execStreamingVivo();
	//}

	/***********************************************************/
	/*************************TEST HOGAR************************/
	/***********************************************************/
	
	@Test(priority = 31)
	public void cp000Hogar() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execHogar();
	}

	@Test(priority = 32)
	public void cp012DetalleDeTuPlanHogar() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execDetalleDeTuPlanHogar();
	}

	@Test(priority = 33)
	public void cp013PagaFactura() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execHogar();
		myPrueba.execPagaFactura();
	}

	/*@Test(priority = 34)
	public void cp014VisitasTecnicas() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execVisitasTecnicas();
	}

	@Test(priority = 35)
	public void cp015PersonalizaRedWifi() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execPersonalizaRedWifi();
	}

	@Test(priority = 36)
	public void cp016Elegidos() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execElegidos();
	}

	@Test(priority = 37)
	public void cp017EntraLadoClaro() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execEntraLadoClaro();
	}

	@Test(priority = 38)
	public void cp018AdquirirProducto() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execAdquirirProducto();
	}

	@Test(priority = 39)
	public void cp019ControlRemoto() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execControlRemoto();
	}

	@Test(priority = 40)
	public void cp020ClaroGaming() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execClaroGaming();
	}

	@Test(priority = 41)
	public void cp021SolictarTraslado() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execSolictarTraslado();
	}

	@Test(priority = 42)
	public void cp022RecomendadorInternet() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execRecomendadorInternet();
	}

	@Test(priority = 43)
	public void cp023RedimeBeneficiosHogar() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execRedimeBeneficiosHogar();
	}

	@Test(priority = 44)
	public void cp024CentroAtencionVentas() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execCentroAtencionVentas();
	}

	@Test(priority = 45)
	public void cp025ChateaNosotros() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execChateaNosotros();
	}

	@Test(priority = 46)
	public void cp026RecomendadosHogar() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execRecomendadosHogar();
	}

	@Test(priority = 47)
	public void cp027ConfiguracionSoporte() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execConfiguracionSoporte();
	}

	@Test(priority = 48)
	public void cp028DesasociarCuenta() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execDesasociarCuenta();
	}

	@Test(priority = 49)
	public void cp029ClaroVideo() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execClaroVideo();
	}

	@Test(priority = 50)
	public void cp030ClaroMusica() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execClaroMusica();
	}

	@Test(priority = 51)
	public void cp031StreamingVivo() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execStreamingVivo();
	}

	@Test(priority = 52)
	public void cp032DetalleConsumos() throws InterruptedException, MalformedURLException {
		PruebaFuncional myPrueba = new PruebaFuncional(myMain);
		myPrueba.execDetalleConsumos();
	}
	
	*/

	@AfterSuite
	public void teardown() throws MalformedURLException{
		//myMain.getDriver().quit();
	}

}
