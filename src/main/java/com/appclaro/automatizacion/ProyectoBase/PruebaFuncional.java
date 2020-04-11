package com.appclaro.automatizacion.ProyectoBase;
import com.appclaro.automatizacion.ProyectoBase.Main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
//import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class PruebaFuncional {
	public AndroidDriver<MobileElement> driver;
	Main myMain;

	Logger log = Logger.getLogger(Login.class);

	/** ELEMENTOS*/	
	//Login
	By linkPersonas = By.id("com.clarocolombia.miclaro:id/acceso_personas");
	By txtUsuario = By.id("com.clarocolombia.miclaro:id/usuario");
	By txtContrasena = By.id("com.clarocolombia.miclaro:id/et_password");
	By btnIniciarSesion = By.id("com.clarocolombia.miclaro:id/btn_iniciar_sesion");
	By lblMiClaro = By.id("com.clarocolombia.miclaro:id/ivHomeMiClaro");

	//Temporal
	By fmeTemporal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/c.c.l.i.ka/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TextView");
	By btnCerrarTemporal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/c.c.l.i.ka/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button");

	//POSTPAGO
	By btnPostPago = By.id("com.clarocolombia.miclaro:id/bgPostPago");

	//Detalle de Consumos
	By btnDetalleConsumos = By.id("com.clarocolombia.miclaro:id/tvDetalleConsumos");
	//By btnBeneficio = By.id("com.clarocolombia.miclaro:id/imgBono");	
	//By btnVoz = By.id("Voz");
	By btnVoz = By.xpath("//d.c.l.a.a.c[@content-desc=\"Voz\"]/android.widget.TextView");
	
	

	By btnLdi = By.id("com.clarocolombia.miclaro:id/imgLdi");
	//By btnSMS = By.id("SMS");
	By btnSMS = By.xpath("//d.c.l.a.a.c[@content-desc=\"SMS\"]/android.widget.TextView");
	

	//By toolbar = By.xpath("com.clarocolombia.miclaro:id/toolbar");
	
	By btnConsumos = By.xpath("//d.c.l.a.a.c[@content-desc=\"Datos\"]");
	
	By btnApps = By.id("com.clarocolombia.miclaro:id/btnRedesElegibles");
	
	By btnatrasApps = By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]");
	
	//android.widget.ImageButton[@content-desc="Navegar hacia arriba"]
	
	By btnCosumoRecargas = By.id("com.clarocolombia.miclaro:id/btnMisRecargasPrepago");
	
	By btnSaldo = By.id("com.clarocolombia.miclaro:id/lbl_detalle_mesanterior");
	
	By btnSaldo2 = By.id("com.clarocolombia.miclaro:id/lbl_recargasmes_anterior");
	
	By btnSaldo3 = By.id("com.clarocolombia.miclaro:id/lbl_historial_consumosmes");
	
	By btnMensaje = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
	
    By btnSaldo4 = By.id("com.clarocolombia.miclaro:id/lbl_historial_recargas");
	
	By btnSaldo5 = By.id("com.clarocolombia.miclaro:id/lbl_detalle_recargas_mes");
	
	By btnSaldo6 = By.id("com.clarocolombia.miclaro:id/btn_lb_otros_saldos");

	//By btnAtras = By.id("Desplazarse hacia arriba");
	//By btnAtras = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
	//By btnAtras = By.id("Navegar hacia arriba");
	By btnAtras = By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]");
	//android.widget.ImageButton[@content-desc="Navegar hacia arriba"]

	By btnAtrasImg = By.id("com.clarocolombia.miclaro:id/imgBack");

	//By btnCuota = By.id("com.clarocolombia.miclaro:id/imgCuotas");

	//Paga tu factura
	By btnPagaTuFactura = By.id("com.clarocolombia.miclaro:id/tvAdminFactura");
	
	By btnHistorial = By.id("com.clarocolombia.miclaro:id/lbl_verHistorico_Pago");
	
	By btnDetalleFactura = By.id("com.clarocolombia.miclaro:id/tv_detalle_factura");
	By btnPagaTuFacturAqui = By.id("com.clarocolombia.miclaro:id/btn_pagar_total_factura");
	
	By btnSeleccionaListaMedioPago = By.id("dropdownMenuButton");
	
	By PSE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]");
	
	By Pagar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.widget.Button");
	
	By Banco = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.Spinner");
	
	By Banco2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	
	By Personas = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.widget.Spinner[1]");
	
	By btnSeleccionaMedioPago = By.id("Selecciona");
	By btnPse = By.id("Por medio de PSE");
	By btnPagar = By.id("Pagar");
	By btnPagosAutomaticos = By.id("com.clarocolombia.miclaro:id/btn_domiciliacion_factura");
	
	By btnverhistorial = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[8]/android.view.View[2]");
	
	By btnRegresar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View[8]/android.view.View/android.view.View[8]/android.view.View");
	
	By tarjetas = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[11]/android.view.View[4]/android.view.View/android.view.View[17]/android.view.View/android.view.View/android.view.View");
	
	By tarjetas2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[11]/android.view.View[4]/android.view.View/android.view.View[17]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View");
	
	By inscribir = By.id("BTN_INSCRIBIR_2982420091");
	
	By btnPagosOtrosCuentas = By.id("com.clarocolombia.miclaro:id/btnPayOtherFact");
	By btnIrAgenda = By.id("com.clarocolombia.miclaro:id/btnAddAgend");
	
	By btnDevolverAgenda = By.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");
	
	By factura = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	
	By btnDescargaTuFactura = By.id("com.clarocolombia.miclaro:id/btn_descargar_factura");
	By btnFacturaDigital = By.id("com.clarocolombia.miclaro:id/btn_convenio_electronico");
	By btnSuscripciones = By.id("com.clarocolombia.miclaro:id/btn_ver_suscripcciones");
	By btnNotificaciones = By.id("com.clarocolombia.miclaro:id/btn_ver_notificaciones");
	
	//Detalle de tu Plan
	By btnDetalleDeTuPlan = By.id("com.clarocolombia.miclaro:id/tvDetallePlan");
	
	By btnDetalleRedes = By.id("com.clarocolombia.miclaro:id/lbBtnDescripRedes");
	
	By cerrar = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
	
	By administrar = By.id("com.clarocolombia.miclaro:id/lb_ver_fami_amigos");
	
	By btnDescripcionDelPlan = By.id("com.clarocolombia.miclaro:id/expand_detalle_plan");
	//By btnDescripcionDelPlanC = By.id("com.clarocolombia.miclaro:id/colapse_detalle_plan");
	
	By aplicaciones = By.id("com.clarocolombia.miclaro:id/btnRedesElegibles");
	
	By aplicaciones2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	
	By aplicaciones3 = By.id("com.clarocolombia.miclaro:id/btn_aceptar");

	By btnMejoraTuPlan = By.id("com.clarocolombia.miclaro:id/btn_mejora_tu_plan");
	
	By btnMejoraTuPlan2 = By.id("com.clarocolombia.miclaro:id/pos_mejora_0_83");
	
	By btnMejoraTuPlan3 = By.id("com.clarocolombia.miclaro:id/aplicar_filtros");
	
	By btnMejoraTuPlan4 = By.id("com.clarocolombia.miclaro:id/btn_detalle_plan");
	
	By btnMejoraTuPlan5 = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
	
	By btnCerrarFiltros = By.id("com.clarocolombia.miclaro:id/close_filtros");
	By btnPaquetesAdicionales = By.id("com.clarocolombia.miclaro:id/btn_paquetes_adicionales");
	By btnAdministraTuRoaming = By.id("com.clarocolombia.miclaro:id/btnRoaming"); 
	By btnEstado = By.id("com.clarocolombia.miclaro:id/swEstado");
	By btnDescripcionRedes = By.id("com.clarocolombia.miclaro:id/lbBtnDescripRedes");

	
	
	//Recargas y Paquetes
	By btnRecargasPaquetes = By.id("com.clarocolombia.miclaro:id/tvRecargas");
	By btnTerminosCondiciones = By.id("com.clarocolombia.miclaro:id/txtTerminos");
	By btnComprasRecurrentes = By.id("com.clarocolombia.miclaro:id/cardComprasRecurrentes");
	By btnContraSaldo = By.id("com.clarocolombia.miclaro:id/btnAdminCompRecuCont");
	By btnTarjetaCredito = By.id("com.clarocolombia.miclaro:id/btnAdminCompRecuTarj");
	By btnCerrar = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
	By btnPaquetesDatos = By.id("com.clarocolombia.miclaro:id/contTitulo");
	By btnRecargas = By.id("com.clarocolombia.miclaro:id/backgroundRecargasBtn");
	By btnListaValoresRecarga = By.id("android:id/text1");
	By btnValorRecarga = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	By btnRecargar = By.id("com.clarocolombia.miclaro:id/txtTituloBtn");
	By btnConfirmarRecarga = By.id("com.clarocolombia.miclaro:id/btnPago");
	//By btnCerrarOpcion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.ImageView");
	By btnCerrarOpcion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]");
	By btnback = By.id("com.clarocolombia.miclaro:id/imgBack");
	
	//Familia y Amigos
	By btnFamiliayAmigos = By.id("com.clarocolombia.miclaro:id/tvFamilia");
	By btnFamiliayAmigos1 = By.id("com.clarocolombia.miclaro:id/btnHomEleFamAmi");
	By btnElegidosTodoDestino = By.id("com.clarocolombia.miclaro:id/btnHomEleTodDest");
	By btnElegidoDeTexto = By.id("com.clarocolombia.miclaro:id/btnHomEleText");
	
	//Roaming Internacional
	By btnRoamingInternacional = By.id("com.clarocolombia.miclaro:id/tvRoaming");
	
	//Gestiona tu equipo
	By btnGestionaTuEquipo = By.id("com.clarocolombia.miclaro:id/tvEquipo");
	By btnRegistraTuEquipo = By.id("com.clarocolombia.miclaro:id/btnRegistrarEquipo");
	By btnRegistraTuImeiDuplicado = By.id("com.clarocolombia.miclaro:id/btnRegisImei");		
	By btnReconectaPorRoboPerdida = By.id("com.clarocolombia.miclaro:id/btnReconecRoboPerdida");
	By btnConsultaTusEquipos = By.id("com.clarocolombia.miclaro:id/btnConsultarEquipo");

	//cambia tu Número
	By btnCambiaTuNumero = By.id("com.clarocolombia.miclaro:id/tvCambioNumero");

	//Redime Beneficios
	By btnRedimeBeneficios = By.id("com.clarocolombia.miclaro:id/tvClaroClub");
	By btnAbrirMenu = By.xpath("//android.view.View[@content-desc=\"Cupones Mis Cupones 0\"]");

	//Cavs
	By btnCavs = By.id("com.clarocolombia.miclaro:id/tvCavs");

	//Chatea con Nosotros
	By btnChateConNosotros = By.id("com.clarocolombia.miclaro:id/tvChat");

	By btnInformacion = By.id("Información");

	//Recomendados
	By btnRecomendados = By.id("com.clarocolombia.miclaro:id/tvRecomendados");

	/////// PREPAGO ////
	By btnPrepago = By.id("com.clarocolombia.miclaro:id/bgPrePago");

	//Saldos y consumos
	By tvDetalleConsumos = By.id("com.clarocolombia.miclaro:id/tvDetalleConsumos");
	By btn_consultar_detalle_mesanterior = By.id("com.clarocolombia.miclaro:id/btn_consultar_detalle_mesanterior");
	By btn_consultar_recargasmes_anterior = By.id("com.clarocolombia.miclaro:id/btn_consultar_recargasmes_anterior");
	By btn_consultar_consumosmes = By.id("com.clarocolombia.miclaro:id/btn_consultar_consumosmes");
	By btn_consultar_recargas = By.id("com.clarocolombia.miclaro:id/btn_consultar_recargas");
	By btn_consultar_consumos = By.id("com.clarocolombia.miclaro:id/btn_consultar_consumos");
	
	By Detalle = By.id("com.clarocolombia.miclaro:id/btn_consultar_detalle_llamadas");
	
	By Detalle2 = By.id("com.clarocolombia.miclaro:id/btn_consultar_detalle_paquetes");
	
	By Detalle3 = By.id("com.clarocolombia.miclaro:id/btn_consultar_detalle_llamadas");
	
	By btn_consultar_detalle_llamadas = By.id("com.clarocolombia.miclaro:id/btn_consultar_detalle_llamadas");
	By expand_detalle = By.id("com.clarocolombia.miclaro:id/expand_detalle");
	By btn_img_otros_saldos = By.id("com.clarocolombia.miclaro:id/btn_img_otros_saldos");

	//Detalle de tu plan
	By btnAdmBene = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[16]");
	By btnHomEleTodDest = By.id("com.clarocolombia.miclaro:id/btnHomEleTodDest");
	By btnHomEleAmi = By.id("com.clarocolombia.miclaro:id/btnHomEleAmi");
	By btn_cambio_plan = By.id("com.clarocolombia.miclaro:id/btn_cambio_plan");
	By informacion_prepago = By.id("com.clarocolombia.miclaro:id/informacion_prepago");
	
	By Vercontrato = By.id("com.clarocolombia.miclaro:id/btn_ver_contrato_prepago");

	//Gestiona tu equipo
	By tvAdminEquipo = By.id("com.clarocolombia.miclaro:id/tvAdminEquipo");
	By btnRegistrarEquipo = By.id("com.clarocolombia.miclaro:id/btnRegistrarEquipo");
	By btnRegisImei = By.id("com.clarocolombia.miclaro:id/btnRegisImei");
	By btnConsultarEquipo = By.id("com.clarocolombia.miclaro:id/btnConsultarEquipo");

	//Recargas y paquetes
	By tvRecargas = By.id("com.clarocolombia.miclaro:id/tvRecargas");
	By edtNumero = By.id("com.clarocolombia.miclaro:id/edtNumero");
	By btnCancelarElegidoTexto = By.id("com.clarocolombia.miclaro:id/btnCancelarElegidoTexto");
	By txtTerminos = By.id("com.clarocolombia.miclaro:id/txtTerminos");
	By cardComprasRecurrentes = By.id("com.clarocolombia.miclaro:id/cardComprasRecurrentes");
	By btnAdminCompRecuCont = By.id("com.clarocolombia.miclaro:id/btnAdminCompRecuCont");
	By btnAdminCompRecuTarj = By.id("com.clarocolombia.miclaro:id/btnAdminCompRecuTarj");

	By btnPaqTodoIncE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup");
	By btnPaqTodoIncC = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[2]");

	By btnPaqDatE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup");
	By btnPaqDatC = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[2]");

	By btnPaqAppE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.view.ViewGroup");
	By btnPaqAppC = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[2]");

	By btnPaqVozE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.view.ViewGroup");
	By btnPaqVozC = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[2]");

	By btnFiltro = By.id("com.clarocolombia.miclaro:id/btnFiltro");
	By btnApliDiaPaqRec = By.id("com.clarocolombia.miclaro:id/btnApliDiaPaqRec");

	By backgroundRecargasBtn = By.id("com.clarocolombia.miclaro:id/backgroundRecargasBtn");
	By backgroundPaquetesBtn = By.id("com.clarocolombia.miclaro:id/backgroundPaquetesBtn");

	//Elegidos
	By tvElegidosTodoDestino = By.id("com.clarocolombia.miclaro:id/tvElegidosTodoDestino");

	//Administra tu navegación
	By tvNavegacion = By.id("com.clarocolombia.miclaro:id/tvNavegacion");

	//Centro de Atención y Ventas
	By tvCavsPre = By.id("com.clarocolombia.miclaro:id/tvCavs");

	//Chatea con nosotros
	By tvChat = By.id("com.clarocolombia.miclaro:id/tvChat");

	//Claro Video
	By openClaroVideo = By.id("com.clarocolombia.miclaro:id/openClaroVideo");

	//Claro Música
	By openClaromusic = By.id("com.clarocolombia.miclaro:id/openClaromusic");



	////// HOGAR  /////
	By tvHogar = By.id("com.clarocolombia.miclaro:id/tvHogar");

	By tvDirectionHogar = By.id("com.clarocolombia.miclaro:id/tvDirectionHogar");


	//Detalle de tu plan
	By tvDetallePlan = By.id("com.clarocolombia.miclaro:id/tvDetallePlan");
	By btnNavegacionDatos = By.id("com.clarocolombia.miclaro:id/btnNavegacionDatos");

	By btnRegulatorio = By.id("com.clarocolombia.miclaro:id/btnRegulatorio");

	By btn_televi_paque = By.id("com.clarocolombia.miclaro:id/btn_televi_paque");

	By btnAdquirirPaquetePremium = By.id("com.clarocolombia.miclaro:id/btnAdquirirPaquetePremium");

	By btn_indicativos = By.id("com.clarocolombia.miclaro:id/btn_indicativos");
	By rbIndiLdiNal = By.id("com.clarocolombia.miclaro:id/rbIndiLdiNal");
	By rbIndiLdiInter = By.id("com.clarocolombia.miclaro:id/rbIndiLdiInter");
	By spiFragLdiNal = By.id("com.clarocolombia.miclaro:id/spiFragLdiNal");

	By btn_tarificador = By.id("com.clarocolombia.miclaro:id/btn_tarificador");
	By rgTarifiLineas = By.id("com.clarocolombia.miclaro:id/rgTarifiLineas");
	By btnTarifiLines = By.id("com.clarocolombia.miclaro:id/btnTarifiLines");


	By btnPortalVoz = By.id("com.clarocolombia.miclaro:id/btnPortalVoz");


	By btnDescargarVoz = By.id("com.clarocolombia.miclaro:id/btnDescargarVoz");

	//Paga tu factura
	By tvAdminFactura = By.id("com.clarocolombia.miclaro:id/tvAdminFactura");

	By btn_verHistoricoPagosHogar = By.id("com.clarocolombia.miclaro:id/btn_verHistorico_Pago_Hogar");

	//MobileElement btn_pagar_total_factura = driver.findElementByAccessibilityId("com.clarocolombia.miclaro:id/btn_pagar_total_factura");
	//MobileElement btn_pagar_total_factura = By.id("com.clarocolombia.miclaro:id/btn_pagar_total_factura");
	//boolean isDi = btn_pagar_total_factura2.isDisplayed();
	By btn_pagar_total_factura = By.id("com.clarocolombia.miclaro:id/btn_pagar_total_factura");

	By btn_domiciliacion_factura = By.id("com.clarocolombia.miclaro:id/btn_domiciliacion_factura");

	By btnverhistorial2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[8]/android.view.View[2]");
	
	By btnPagoOtherFact = By.id("com.clarocolombia.miclaro:id/btnPagoOtherFact");

	By btn_enviar_factura_correo = By.id("com.clarocolombia.miclaro:id/btn_enviar_factura_correo");

	By btn_descargar_factura = By.id("com.clarocolombia.miclaro:id/btn_descargar_factura");

	By btn_descargar_factura2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	

	
	By btn_convenio_electronico = By.id("com.clarocolombia.miclaro:id/btn_convenio_electronico");

	By btn_detalle_facturas = By.id("com.clarocolombia.miclaro:id/btn_detalle_facturas");
	By btn_historial_factura = By.id("com.clarocolombia.miclaro:id/btn_historial_factura");		

	//Visitas técnicas
	By tvVisitaTecnica = By.id("com.clarocolombia.miclaro:id/tvVisitaTecnica");
	By btnTraslado = By.id("com.clarocolombia.miclaro:id/btnTraslado");
	//By btnTrasCancel = By.id("com.clarocolombia.miclaro:id/btnTrasCancel");
	By btnVisitaAnt1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");

	//Personaliza tu red WIFI
	By tvPersonalizaWifi = By.id("com.clarocolombia.miclaro:id/tvPersonalizaWifi");

	By btnPersonalizaModem = By.id("com.clarocolombia.miclaro:id/btnPersonalizaModem");
	By btnPersoWifiDialog = By.id("com.clarocolombia.miclaro:id/btnPersoWifiDialog");

	By btnInfoWifiDialog = By.id("com.clarocolombia.miclaro:id/btnInfoWifiDialog");

	//Elegidos
	By tvElegidos = By.id("com.clarocolombia.miclaro:id/tvElegidos");
	By link_terminos_condiciones = By.id("com.clarocolombia.miclaro:id/link_terminos_condiciones");

	By btnAdminElegidoMovil = By.id("com.clarocolombia.miclaro:id/btnAdminElegidoMovil");
	By btnAddElegido = By.id("com.clarocolombia.miclaro:id/btnAddElegido");
	By btnCancelarElegidoFijo = By.id("com.clarocolombia.miclaro:id/btnCancelarElegidoFijo");

	//Entra al lado Claro
	By tvStarWars = By.id("com.clarocolombia.miclaro:id/tvStarWars");

	//Adquirir producto
	By tvAdquirirProducto = By.id("com.clarocolombia.miclaro:id/tvAdquirirProducto");

	//Configurar Control Remoto
	By tvRemotes = By.id("com.clarocolombia.miclaro:id/tvRemotes");
	By btnConfCtrlTV = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
	By btnConfCtrlTVOpc1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
	By btnConfCtrlTVCod = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup");

	By btnConfCtrlDeco = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup");
	By btnConfCtrlDecoOpc1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
	By btnConfCtrlDecoCod = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup");

	//Claro Gaming
	By tvClaroGamers = By.id("com.clarocolombia.miclaro:id/tvClaroGamers");
	By btnIrCatalogo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.Button");

	//Solicitar traslado
	By tvTraslados = By.id("com.clarocolombia.miclaro:id/tvTraslados");
	By lbTextTrasUbi = By.id("com.clarocolombia.miclaro:id/lbTextTrasUbi");
	By btnTrasCancel = By.id("com.clarocolombia.miclaro:id/btnTrasCancel");

	//Recomendador de internet
	By tvRecomendadorInternet = By.id("com.clarocolombia.miclaro:id/tvRecomendadorInternet");
	By btnEmpezar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.widget.Button");

	By btnRICasa = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View");

	By btnRIMenor35 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[6]/android.view.View");

	By btnRIPiso1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[12]/android.view.View");

	By btnRIHabitacion1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[12]/android.view.View");

	By btnRISiguiente1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[17]/android.widget.Button");

	By btnRISmartTableAdd = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View[3]");

	By btnRIComputadoresAdd = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[4]/android.view.View[3]");

	By btnRISiguiente2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.widget.Button");

	By btnRIBasicoInfo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View[1]/android.widget.Image");

	By btnRIBasicoAtras = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[7]/android.widget.Button");

	By btnRIBasico = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View");

	By btnRISiguiente3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.widget.Button");

	By btnRIReiniciar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button");

	//Redime beneficios

	By tvCuenta = By.id("com.clarocolombia.miclaro:id/tvCuenta");
	By tvClaroClub = By.id("com.clarocolombia.miclaro:id/tvClaroClub");

	//Centros de atencion y ventas
	By tvZonasWifi = By.id("com.clarocolombia.miclaro:id/tvZonasWifi");

	//Chatea con nosotros
	By tvCavs = By.id("com.clarocolombia.miclaro:id/tvCavs");

	//Recomendados
	By tvRecomendados = By.id("com.clarocolombia.miclaro:id/tvRecomendados");

	//Configuracion y Soporte
	By tvConfigSupport = By.id("com.clarocolombia.miclaro:id/tvConfigSupport");

	//Desasociar cuenta
	By tvDesasociar = By.id("com.clarocolombia.miclaro:id/tvDesasociar");

	//Claro video
	By claroVideo = By.id("com.clarocolombia.miclaro:id/claroVideo");
	//Pendiente abre google play

	//Claro Musica
	By claroMusica = By.id("com.clarocolombia.miclaro:id/claroMusica");
	//Pendiente abre google play

	//Streaming en vivo
	By tvRedMas = By.id("com.clarocolombia.miclaro:id/tvRedMas");

	//Pendiente abre google play
	By btnPromo = By.id("com.clarocolombia.miclaro:id/btnPromo");


	//Detalle de consumos
	By tvDetalleConsumo = By.id("com.clarocolombia.miclaro:id/tvDetalleConsumo");

	By btn_aceptar = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
	By btn_cancelar = By.id("com.clarocolombia.miclaro:id/btnCancelar");
	//android.support.v7.app.a.b[@content-desc="Voz"]/android.widget.TextView	
	//android.support.v7.app.a.b[@content-desc="Voz"]
	
	//Menu
	
	By Menu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[3]");

	By Cerrarsesion = By.id("com.clarocolombia.miclaro:id/btnIrEmpresas");
	
	By Cerrarsesion2 = By.id("com.clarocolombia.miclaro:id/btn_aceptar");
	

	
	
	/** CONSTRUCTOR 
	 * @param myMain */
	public PruebaFuncional(Main myMain) {
		this.myMain = myMain;
	}

	/** EVENTOS (ACCIONES) */


	public void clickfmeTemporal() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(fmeTemporal);
		this.myMain.driver.findElement(btnCerrarTemporal).click();
	}

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

	public void clickbtnPostPago() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPostPago);
		this.myMain.driver.findElement(btnPostPago).click();
	}

	public void clickBtnDetalleConsumos() throws MalformedURLException {

		this.myMain.WaitElement(btnDetalleConsumos);
		this.myMain.driver.findElement(btnDetalleConsumos).click();
	}

	//public void clickBtnBeneficio() throws MalformedURLException {

		//this.myMain.WaitElement(btnBeneficio);
		//this.myMain.driver.findElement(btnBeneficio).click();
	//}

	public void clickBtnVoz() throws MalformedURLException {

		this.myMain.WaitElement(btnVoz);
		this.myMain.driver.findElement(btnVoz).click();
	}

	public void clickBtnLdi() throws MalformedURLException {

		this.myMain.WaitElement(btnLdi);
		this.myMain.driver.findElement(btnLdi).click();
	}

	public void clickBtnSMS() throws MalformedURLException {

		this.myMain.WaitElement(btnSMS);
		this.myMain.driver.findElement(btnSMS).click();
	}
	
	public void clickBtnConsumos() throws MalformedURLException {

		this.myMain.WaitElement(btnConsumos);
		this.myMain.driver.findElement(btnConsumos).click();
	}
	
	public void clickBtnApps() throws MalformedURLException {

		this.myMain.WaitElement(btnApps);
		this.myMain.driver.findElement(btnApps).click();
	}
	
	public void clickBtnatrasApps() throws MalformedURLException {

		this.myMain.WaitElement(btnatrasApps);
		this.myMain.driver.findElement(btnatrasApps).click();
	}
	
	public void clickBtnConsumoRecargas() throws MalformedURLException {

		this.myMain.WaitElement(btnCosumoRecargas);
		this.myMain.driver.findElement(btnCosumoRecargas).click();
	}
	
	public void clickBtnSaldo() throws MalformedURLException {

		this.myMain.WaitElement(btnSaldo);
		this.myMain.driver.findElement(btnSaldo).click();
	}
	
	
	public void clickBtnSaldo2() throws MalformedURLException {

		this.myMain.WaitElement(btnSaldo2);
		this.myMain.driver.findElement(btnSaldo2).click();
	}
	
	public void clickBtnSaldo3() throws MalformedURLException {

		this.myMain.WaitElement(btnSaldo3);
		this.myMain.driver.findElement(btnSaldo3).click();
	}
	
	public void clickBtnMensaje() throws MalformedURLException {

		this.myMain.WaitElement(btnMensaje);
		this.myMain.driver.findElement(btnMensaje).click();
	}
	
	public void clickBtnSaldo4() throws MalformedURLException {

		this.myMain.WaitElement(btnSaldo4);
		this.myMain.driver.findElement(btnSaldo4).click();
	}
	
	public void clickBtnSaldo5() throws MalformedURLException {

		this.myMain.WaitElement(btnSaldo5);
		this.myMain.driver.findElement(btnSaldo5).click();
	}
	
	public void clickBtnSaldo6() throws MalformedURLException {

		this.myMain.WaitElement(btnSaldo6);
		this.myMain.driver.findElement(btnSaldo6).click();
	}
	
	
	
	public void clickBtnAtras() throws MalformedURLException {			
		this.myMain.WaitElement(btnAtras);			
		this.myMain.driver.findElement(btnAtras).click();
	}

	public void clickBtnAtrasImg() throws MalformedURLException {			
		this.myMain.WaitElement(btnAtrasImg);			
		this.myMain.driver.findElement(btnAtrasImg).click();
	}

	public void clickBtnPagaTuFactura() throws MalformedURLException {

		this.myMain.WaitElement(btnPagaTuFactura);
		this.myMain.driver.findElement(btnPagaTuFactura).click();
	}

	
	public void clickBtnHistorial() throws MalformedURLException {

		this.myMain.WaitElement(btnHistorial);
		this.myMain.driver.findElement(btnHistorial).click();
	}
	
	
	public void clickBtnDetalleFactura() throws MalformedURLException {

		this.myMain.WaitElement(btnDetalleFactura);
		this.myMain.driver.findElement(btnDetalleFactura).click();
	}
	public void clickBtnPagaTuFacturAqui() throws MalformedURLException {

		this.myMain.WaitElement(btnPagaTuFacturAqui);
		this.myMain.driver.findElement(btnPagaTuFacturAqui).click();
	}

	
	public void clickBtnSeleccionaListaMedioPago() throws MalformedURLException {			
		this.myMain.WaitElement(btnSeleccionaListaMedioPago);
		this.myMain.driver.findElement(btnSeleccionaListaMedioPago).click();
	}
	
	
	public void BotonPSE() throws MalformedURLException {

		this.myMain.WaitElement(PSE);
		this.myMain.driver.findElement(PSE).click();
	}
	
	public void BotonPagar() throws MalformedURLException {

		this.myMain.WaitElement(Pagar);
		this.myMain.driver.findElement(Pagar).click();
	}
	
	public void BotonBanco() throws MalformedURLException {

		this.myMain.WaitElement(Banco);
		this.myMain.driver.findElement(Banco).click();
	}
	
	public void BotonBanco2() throws MalformedURLException {

		this.myMain.WaitElement(Banco2);
		this.myMain.driver.findElement(Banco2).click();
	}
	
	
	public void scroll() throws MalformedURLException, InterruptedException {
		Dimension dim = myMain.driver.manage().window().getSize();
		int height = dim.getHeight();
		log.info("height="+height);
		int width = dim.getWidth();
		log.info("width="+width);
		int x = width/2;
		int starty = (int)(height * 0.9);
		int endy = (int)(height * 0.05);
		myMain.driver.swipe(x, starty, x, endy, 500);
		Thread.sleep(200);
	}

	public void scroll1() throws MalformedURLException, InterruptedException {
		Dimension dim = myMain.driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height * 0.6);
		int endy = (int)(height * 0.09);
		myMain.driver.swipe(x, starty, x, endy, 800);
		Thread.sleep(200);
	}

	public void verticalSwipe() throws MalformedURLException, InterruptedException {
		Thread.sleep(200);
		Dimension dim = myMain.driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height * 0.80);
		int endy = (int)(height * 0.20);
		myMain.driver.swipe(x, starty, x, endy, 500);
		Thread.sleep(200);
	}


	public void clickBtnPagosAutomaticos() throws MalformedURLException {			
		this.myMain.WaitElement(btnPagosAutomaticos);
		this.myMain.driver.findElement(btnPagosAutomaticos).click();

	}
	
	
	public void clickBtnverhistorial() throws MalformedURLException {			
		this.myMain.WaitElement(btnverhistorial);
		this.myMain.driver.findElement(btnverhistorial).click();

	}
	
	public void clickBtnregresar() throws MalformedURLException {			
		this.myMain.WaitElement(btnRegresar);
		this.myMain.driver.findElement(btnRegresar).click();

	}
	
	public void clickBtntarjetas() throws MalformedURLException {			
		this.myMain.WaitElement(tarjetas);
		this.myMain.driver.findElement(tarjetas).click();

	}
	
	public void clickBtntarjetas2() throws MalformedURLException {			
		this.myMain.WaitElement(tarjetas2);
		this.myMain.driver.findElement(tarjetas2).click();

	}
	
	public void clickBtninscribir() throws MalformedURLException {			
		this.myMain.WaitElement(inscribir);
		this.myMain.driver.findElement(inscribir).click();

	}
	
	

	public void clickBtnPagoOtrasCuentas() throws MalformedURLException {			
		this.myMain.WaitElement(btnPagosOtrosCuentas);
		this.myMain.driver.findElement(btnPagosOtrosCuentas).click();
		//this.myMain.WaitElement(btnIrAgenda);
		//this.myMain.driver.findElement(btnIrAgenda).click();
		//this.myMain.driver.findElement(btnDevolverAgenda).click();
	}

	public void clickBtnagenda() throws MalformedURLException {			
		this.myMain.WaitElement(btnIrAgenda);
		this.myMain.driver.findElement(btnIrAgenda).click();

	}
	
	
	public void clickBtDevolverAgenda() throws MalformedURLException {			
		this.myMain.WaitElement(btnDevolverAgenda);
		this.myMain.driver.findElement(btnDevolverAgenda).click();

	}
	
	
	public void clickBtnDescargaTuFactura() throws MalformedURLException {			
		this.myMain.WaitElement(btnDescargaTuFactura);
		this.myMain.driver.findElement(btnDescargaTuFactura).click();
	}
	
	
	public void Factura() throws MalformedURLException {			
		this.myMain.WaitElement(factura);
		this.myMain.driver.findElement(factura).click();
	}
	

	public void clickBtnFacturaDigital() throws MalformedURLException {			
		this.myMain.WaitElement(btnFacturaDigital);
		this.myMain.driver.findElement(btnFacturaDigital).click();

	}

	public void clickBtnSuscripciones() throws MalformedURLException {			
		this.myMain.WaitElement(btnSuscripciones);
		this.myMain.driver.findElement(btnSuscripciones).click();				
	}

	public void clickBtnNotificaciones() throws MalformedURLException {			
		this.myMain.WaitElement(btnNotificaciones);
		this.myMain.driver.findElement(btnNotificaciones).click();				
	}




	public void clickBtnSeleccionaMedioPago() throws MalformedURLException {

		this.myMain.WaitElement(btnSeleccionaMedioPago);
		this.myMain.driver.findElement(btnSeleccionaMedioPago).click();
	}

	public void clickBtnDetalleDeTuPlan() throws MalformedURLException {
		this.myMain.WaitElement(btnDetalleDeTuPlan);
		this.myMain.driver.findElement(btnDetalleDeTuPlan).click();
	}

	public void clickBtnVerDetalleDeRedes() throws MalformedURLException {

		this.myMain.WaitElement(btnDescripcionRedes);
		this.myMain.driver.findElement(btnDescripcionRedes).click();
	}

	
	public void Cerrar() throws MalformedURLException {

		this.myMain.WaitElement(cerrar);
		this.myMain.driver.findElement(cerrar).click();
	}
	

	public void Administrar() throws MalformedURLException {

		this.myMain.WaitElement(administrar);
		this.myMain.driver.findElement(administrar).click();
	}
	
	public void Aplicaciones() throws MalformedURLException {

		this.myMain.WaitElement(aplicaciones);
		this.myMain.driver.findElement(aplicaciones).click();
	}
	
	public void Aplicaciones2() throws MalformedURLException {

		this.myMain.WaitElement(aplicaciones2);
		this.myMain.driver.findElement(aplicaciones2).click();
	}
	
	public void Aplicaciones3() throws MalformedURLException {

		this.myMain.WaitElement(aplicaciones3);
		this.myMain.driver.findElement(aplicaciones3).click();
	}
	
	public void Plan2() throws MalformedURLException {

		this.myMain.WaitElement(btnMejoraTuPlan2);
		this.myMain.driver.findElement(btnMejoraTuPlan2).click();
	}
	
	public void Plan3() throws MalformedURLException {

		this.myMain.WaitElement(btnMejoraTuPlan3);
		this.myMain.driver.findElement(btnMejoraTuPlan3).click();
	}
	
	public void Plan4() throws MalformedURLException {

		this.myMain.WaitElement(btnMejoraTuPlan4);
		this.myMain.driver.findElement(btnMejoraTuPlan4).click();
	}
	
	public void Plan5() throws MalformedURLException {

		this.myMain.WaitElement(btnMejoraTuPlan5);
		this.myMain.driver.findElement(btnMejoraTuPlan5).click();
	}
	
	
	public void clickBtnDescripcionDelPlan() throws MalformedURLException {

		this.myMain.WaitElement(btnDescripcionDelPlan);
		this.myMain.driver.findElement(btnDescripcionDelPlan).click();
	}

	//public void clickBtnDescripcionDelPlanC() throws MalformedURLException {

		//this.myMain.WaitElement(btnDescripcionDelPlanC);
		//this.myMain.driver.findElement(btnDescripcionDelPlanC).click();
	//}
	public void clickBtnMejoraTuPlan() throws MalformedURLException {

		this.myMain.WaitElement(btnMejoraTuPlan);
		this.myMain.driver.findElement(btnMejoraTuPlan).click();
		//this.myMain.WaitElement(btnCerrarFiltros);
		//this.myMain.driver.findElement(btnCerrarFiltros).click();
	}

	public void clickBtnPaquetesAdicionales() throws MalformedURLException {

		this.myMain.WaitElement(btnPaquetesAdicionales);
		this.myMain.driver.findElement(btnPaquetesAdicionales).click();
	}

	public void clickBtnAdministraTuRoaming() throws MalformedURLException {

		this.myMain.WaitElement(btnAdministraTuRoaming);
		this.myMain.driver.findElement(btnAdministraTuRoaming).click();
	}

	public void clickBtnRecargasPaquetes() throws MalformedURLException {

		this.myMain.WaitElement(btnRecargasPaquetes);
		this.myMain.driver.findElement(btnRecargasPaquetes).click();
	}



	public void clickBtnVerTerminos() throws MalformedURLException {

		this.myMain.WaitElement(btnTerminosCondiciones);
		this.myMain.driver.findElement(btnTerminosCondiciones).click();
	}
	public void clickBtnComprasRecurrentes() throws MalformedURLException {

		this.myMain.WaitElement(btnComprasRecurrentes);
		this.myMain.driver.findElement(btnComprasRecurrentes).click();
	}
	public void clickBtnContraSaldo() throws MalformedURLException {

		this.myMain.WaitElement(btnContraSaldo);
		this.myMain.driver.findElement(btnContraSaldo).click();
	}

	public void clickBtnTarjetaCredito() throws MalformedURLException {

		this.myMain.WaitElement(btnTarjetaCredito);
		this.myMain.driver.findElement(btnTarjetaCredito).click();
	}

	public void clickBtnCerrar() throws MalformedURLException {

		this.myMain.WaitElement(btnCerrar);
		this.myMain.driver.findElement(btnCerrar).click();
	}

	public void clickBtnPaquetesDatos() throws MalformedURLException {

		this.myMain.WaitElement(btnPaquetesDatos);
		this.myMain.driver.findElement(btnPaquetesDatos).click();
	}

	public void clickBtnRecargas() throws MalformedURLException {

		this.myMain.WaitElement(btnRecargas);
		this.myMain.driver.findElement(btnRecargas).click();
	}
	public void clickListaValoresRecargas() throws MalformedURLException {

		this.myMain.WaitElement(btnListaValoresRecarga);
		this.myMain.driver.findElement(btnListaValoresRecarga).click();
	}

	public void clickOpcionRecarga() throws MalformedURLException {

		this.myMain.WaitElement(btnValorRecarga);
		this.myMain.driver.findElement(btnValorRecarga).click();
	}
	public void clickbtnRecargar() throws MalformedURLException {

		this.myMain.WaitElement(btnRecargar);
		this.myMain.driver.findElement(btnRecargar).click();
	}

	public void clickbtnConfirmarRecarga() throws MalformedURLException {

		this.myMain.WaitElement(btnConfirmarRecarga);
		this.myMain.driver.findElement(btnConfirmarRecarga).click();
	}

	public void clickbtnCerrarOpcion() throws MalformedURLException {

		this.myMain.WaitElement(btnCerrarOpcion);
		this.myMain.driver.findElement(btnCerrarOpcion).click();
	}
	public void clickbtnFamiliayAmigos() throws MalformedURLException {

		this.myMain.WaitElement(btnFamiliayAmigos);
		this.myMain.driver.findElement(btnFamiliayAmigos).click();
	}

	public void clickbtnFamiliayAmigos1() throws MalformedURLException {

		this.myMain.WaitElement(btnFamiliayAmigos1);
		this.myMain.driver.findElement(btnFamiliayAmigos1).click();
	}
	public void clickBtnBack() throws MalformedURLException {

		this.myMain.WaitElement(btnback);
		this.myMain.driver.findElement(btnback).click();
	}

	public void clickBtnElegidosTodoDestino() throws MalformedURLException {

		this.myMain.WaitElement(btnElegidosTodoDestino);
		this.myMain.driver.findElement(btnElegidosTodoDestino).click();
	}

	public void clickBtnElegidoDeTexto() throws MalformedURLException {

		this.myMain.WaitElement(btnElegidoDeTexto);
		this.myMain.driver.findElement(btnElegidoDeTexto).click();
	}

	public void clickBtnRoamingInternacional() throws MalformedURLException {			
		this.myMain.WaitElement(btnRoamingInternacional);
		this.myMain.driver.findElement(btnRoamingInternacional).click();
	}

	public void clickBtnGestionaTuEquipo() throws MalformedURLException {			
		this.myMain.WaitElement(btnGestionaTuEquipo);
		this.myMain.driver.findElement(btnGestionaTuEquipo).click();
	}

	public void clickBtnRegistraTuEquipo() throws MalformedURLException {			
		this.myMain.WaitElement(btnRegistraTuEquipo);
		this.myMain.driver.findElement(btnRegistraTuEquipo).click();
	}

	public void clickBtnRegistraTuImeiDuplicado() throws MalformedURLException {			
		this.myMain.WaitElement(btnRegistraTuImeiDuplicado);
		this.myMain.driver.findElement(btnRegistraTuImeiDuplicado).click();
	}
	public void clickBtnReconectaPorRoboPerdida() throws MalformedURLException {			
		this.myMain.WaitElement(btnReconectaPorRoboPerdida);
		this.myMain.driver.findElement(btnReconectaPorRoboPerdida).click();
	}
	public void clickBtnConsultaTusEquipos() throws MalformedURLException {			
		this.myMain.WaitElement(btnConsultaTusEquipos);
		this.myMain.driver.findElement(btnConsultaTusEquipos).click();
	}

	public void clickBtnCambiaTuNumero() throws MalformedURLException {			
		this.myMain.WaitElement(btnCambiaTuNumero);
		this.myMain.driver.findElement(btnCambiaTuNumero).click();
	}

	public void clickBtnRedimeBeneficios() throws MalformedURLException {			
		this.myMain.WaitElement(btnRedimeBeneficios);
		this.myMain.driver.findElement(btnRedimeBeneficios).click();
	}
	public void clickBtnAbrirMenu() throws MalformedURLException {			
		this.myMain.WaitElement(btnAbrirMenu);
		this.myMain.driver.findElement(btnAbrirMenu).click();
	}

	public void clickBtnCavs() throws MalformedURLException {			
		this.myMain.WaitElement(btnCavs);
		this.myMain.driver.findElement(btnCavs).click();
	}

	public void clikcCuota() throws MalformedURLException {			
		//this.myMain.WaitElement(btnCuota);
		//this.myMain.driver.findElement(btnCuota).click();
	}

	public void clickChateConNosotros() throws MalformedURLException {			
		this.myMain.WaitElement(btnChateConNosotros);
		this.myMain.driver.findElement(btnChateConNosotros).click();
		this.myMain.WaitElement(btnInformacion);
		this.myMain.driver.findElement(btnInformacion).click();

	}

	public void clickRecomendados() throws MalformedURLException {			
		this.myMain.WaitElement(btnRecomendados);
		this.myMain.driver.findElement(btnRecomendados).click();

	}

	public void clickBtnPrepago() throws MalformedURLException {			
		this.myMain.WaitElement(btnPrepago);
		this.myMain.driver.findElement(btnPrepago).click();
	}


	/******************ACCIONES PREPAGO************/
	public void clickbtnPrepago() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPrepago);
		this.myMain.driver.findElement(btnPrepago).click();
	}

	public void clicktvDetalleConsumos() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvDetalleConsumos);
		this.myMain.driver.findElement(tvDetalleConsumos).click();
	}

	public void clickbtn_consultar_detalle_mesanterior() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_consultar_detalle_mesanterior);
		this.myMain.driver.findElement(btn_consultar_detalle_mesanterior).click();
	}

	public void clickbtn_consultar_recargasmes_anterior() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_consultar_recargasmes_anterior);
		this.myMain.driver.findElement(btn_consultar_recargasmes_anterior).click();
	}

	public void clickbtn_consultar_consumosmes() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_consultar_consumosmes);
		this.myMain.driver.findElement(btn_consultar_consumosmes).click();
	}
	
	
	public void detalle() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(Detalle);
		this.myMain.driver.findElement(Detalle).click();
	}
	
	
	public void detalle2() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(Detalle2);
		this.myMain.driver.findElement(Detalle2).click();
	}
	
	
	public void detalle3() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(Detalle3);
		this.myMain.driver.findElement(Detalle3).click();
	}
	
	
	

	public void clickbtn_consultar_recargas() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_consultar_recargas);
		this.myMain.driver.findElement(btn_consultar_recargas).click();
	}

	public void clickbtn_consultar_consumos() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_consultar_consumos);
		this.myMain.driver.findElement(btn_consultar_consumos).click();
	}

	public void clickbtn_consultar_detalle_llamadas() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_consultar_detalle_llamadas);
		this.myMain.driver.findElement(btn_consultar_detalle_llamadas).click();
	}

	public void clickexpand_detalle() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(expand_detalle);
		this.myMain.driver.findElement(expand_detalle).click();
	}

	public void clickbtn_img_otros_saldos() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_img_otros_saldos);
		this.myMain.driver.findElement(btn_img_otros_saldos).click();
	}

	public void clickbtnAdmBene() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnAdmBene);
		this.myMain.driver.findElement(btnAdmBene).click();
	}

	public void clickbtn_cambio_plan() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_cambio_plan);
		this.myMain.driver.findElement(btn_cambio_plan).click();
	}

	public void clickinformacion_prepago() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(informacion_prepago);
		this.myMain.driver.findElement(informacion_prepago).click();
	}
	
	
	public void vercontrato() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(Vercontrato);
		this.myMain.driver.findElement(Vercontrato).click();
	}
	

	public void clicktvAdminEquipo() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvAdminEquipo);
		this.myMain.driver.findElement(tvAdminEquipo).click();
	}

	public void clickbtnRegistrarEquipo() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnRegistrarEquipo);
		this.myMain.driver.findElement(btnRegistrarEquipo).click();
	}

	public void clickbtnRegisImei() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnRegisImei);
		this.myMain.driver.findElement(btnRegisImei).click();
	}

	public void clickbtnConsultarEquipo() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnConsultarEquipo);
		this.myMain.driver.findElement(btnConsultarEquipo).click();
	}

	public void clicktvRecargas() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvRecargas);
		this.myMain.driver.findElement(tvRecargas).click();
	}

	public void clickedtNumero() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(edtNumero);
		this.myMain.driver.findElement(edtNumero).click();
	}

	public void clickbtnCancelarElegidoTexto() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnCancelarElegidoTexto);
		this.myMain.driver.findElement(btnCancelarElegidoTexto).click();
	}

	public void clicktxtTerminos() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(txtTerminos);
		this.myMain.driver.findElement(txtTerminos).click();
	}

	public void clickcardComprasRecurrentes() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(cardComprasRecurrentes);
		this.myMain.driver.findElement(cardComprasRecurrentes).click();
	}

	public void clickbtnAdminCompRecuCont() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnAdminCompRecuCont);
		this.myMain.driver.findElement(btnAdminCompRecuCont).click();
	}

	public void clickbtnAdminCompRecuTarj() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnAdminCompRecuTarj);
		this.myMain.driver.findElement(btnAdminCompRecuTarj).click();
	}

	public void clickbtnPaqTodoIncE() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqTodoIncE);
		this.myMain.driver.findElement(btnPaqTodoIncE).click();
	}

	public void clickbtnPaqTodoIncC() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqTodoIncC);
		this.myMain.driver.findElement(btnPaqTodoIncC).click();
	}

	public void clickbtnPaqDatE() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqDatE);
		this.myMain.driver.findElement(btnPaqDatE).click();
	}

	public void clickbtnPaqDatC() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqDatC);
		this.myMain.driver.findElement(btnPaqDatC).click();
	}

	public void clickbtnPaqAppE() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqAppE);
		this.myMain.driver.findElement(btnPaqAppE).click();
	}

	public void clickbtnPaqAppC() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqAppC);
		this.myMain.driver.findElement(btnPaqAppC).click();
	}

	public void clickbtnPaqVozE() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqVozE);
		this.myMain.driver.findElement(btnPaqVozE).click();
	}

	public void clickbtnPaqVozC() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnPaqVozC);
		this.myMain.driver.findElement(btnPaqVozC).click();
	}

	public void clickbtnFiltro() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnFiltro);
		this.myMain.driver.findElement(btnFiltro).click();
	}

	public void clickbtnApliDiaPaqRec() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnApliDiaPaqRec);
		this.myMain.driver.findElement(btnApliDiaPaqRec).click();
	}

	public void clickbackgroundRecargasBtn() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(backgroundRecargasBtn);
		this.myMain.driver.findElement(backgroundRecargasBtn).click();
	}

	public void clickbackgroundPaquetesBtn() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(backgroundPaquetesBtn);
		this.myMain.driver.findElement(backgroundPaquetesBtn).click();
	}

	public void clicktvElegidosTodoDestino() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvElegidosTodoDestino);
		this.myMain.driver.findElement(tvElegidosTodoDestino).click();
	}

	public void clickbtnHomEleTodDest() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnHomEleTodDest);
		this.myMain.driver.findElement(btnHomEleTodDest).click();
	}

	public void clickbtnHomEleAmi() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btnHomEleAmi);
		this.myMain.driver.findElement(btnHomEleAmi).click();
	}

	public void clicktvNavegacion() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvNavegacion);
		this.myMain.driver.findElement(tvNavegacion).click();
	}

	public void clicktvCavsPre() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvCavsPre);
		this.myMain.driver.findElement(tvCavsPre).click();
	}

	public void clicktvChat() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(tvChat);
		this.myMain.driver.findElement(tvChat).click();
	}

	public void clickopenClaroVideo() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(openClaroVideo);
		this.myMain.driver.findElement(openClaroVideo).click();
	}

	public void clickopenClaromusic() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(openClaromusic);
		this.myMain.driver.findElement(openClaromusic).click();
	}



	/******************ACCIONES HOGAR**************/

	public void clicktvHogar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvHogar);
		this.myMain.driver.findElement(tvHogar).click();
	}

	public void clicktvDirectionHogar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvDirectionHogar);
		this.myMain.driver.findElement(tvDirectionHogar).click();
	}

	public void clicktvDetallePlan() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvDetallePlan);
		this.myMain.driver.findElement(tvDetallePlan).click();
	}

	public void clickbtnNavegacionDatos() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnNavegacionDatos);
		this.myMain.driver.findElement(btnNavegacionDatos).click();
	}

	public void clickbtnRegulatorio() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRegulatorio);
		this.myMain.driver.findElement(btnRegulatorio).click();
	}

	public void clickbtn_televi_paque() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_televi_paque);
		this.myMain.driver.findElement(btn_televi_paque).click();
	}

	public void clickbtnAdquirirPaquetePremium() throws InterruptedException,MalformedURLException
	{

		this.myMain.WaitElement(btnAdquirirPaquetePremium);
		this.myMain.driver.findElement(btnAdquirirPaquetePremium).click();
	}

	public void clickbtn_indicativos() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_indicativos);
		this.myMain.driver.findElement(btn_indicativos).click();
	}

	public void clickrbIndiLdiNal() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(rbIndiLdiNal);
		this.myMain.driver.findElement(rbIndiLdiNal).click();
	}

	public void clickrbIndiLdiInter() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(rbIndiLdiInter);
		this.myMain.driver.findElement(rbIndiLdiInter).click();
	}

	public void clickspiFragLdiNal() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(spiFragLdiNal);
		this.myMain.driver.findElement(spiFragLdiNal).click();
	}

	public void clickbtn_tarificador() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_tarificador);
		this.myMain.driver.findElement(btn_tarificador).click();
	}

	public void clickrgTarifiLineas() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(rgTarifiLineas);
		this.myMain.driver.findElement(rgTarifiLineas).click();
	}

	public void clickbtnTarifiLines() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnTarifiLines);
		this.myMain.driver.findElement(btnTarifiLines).click();
	}

	public void clickbtnPortalVoz() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnPortalVoz);
		this.myMain.driver.findElement(btnPortalVoz).click();
	}

	public void clickbtnDescargarVoz() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnDescargarVoz);
		this.myMain.driver.findElement(btnDescargarVoz).click();
	}

	public void clickbtnPromo() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnPromo);
		this.myMain.driver.findElement(btnPromo).click();
	}

	public void clicktvPersonalizaWifi() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvPersonalizaWifi);
		this.myMain.driver.findElement(tvPersonalizaWifi).click();
	}

	public void clickbtnPersonalizaModem() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnPersonalizaModem);
		this.myMain.driver.findElement(btnPersonalizaModem).click();
	}

	public void clickbtnPersoWifiDialog() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnPersoWifiDialog);
		this.myMain.driver.findElement(btnPersoWifiDialog).click();
	}

	public void clickbtnInfoWifiDialog() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnInfoWifiDialog);
		this.myMain.driver.findElement(btnInfoWifiDialog).click();
	}

	public void clicktvAdquirirProducto() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvAdquirirProducto);
		this.myMain.driver.findElement(tvAdquirirProducto).click();
	}

	public void clicktvTraslados() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvTraslados);
		this.myMain.driver.findElement(tvTraslados).click();
	}

	public void clicklbTextTrasUbi() throws MalformedURLException {

		this.myMain.WaitElement(lbTextTrasUbi);
		this.myMain.driver.findElement(lbTextTrasUbi).click();
	}

	public void clickbtnTrasCancel() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnTrasCancel);
		this.myMain.driver.findElement(btnTrasCancel).click();
	}

	public void clicktvZonasWifi() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvZonasWifi);
		this.myMain.driver.findElement(tvZonasWifi).click();
	}

	public void clicktvConfigSupport() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvConfigSupport);
		this.myMain.driver.findElement(tvConfigSupport).click();
	}

	public void clickclaroMusica() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(claroMusica);
		this.myMain.driver.findElement(claroMusica).click();
	}

	public void clicktvAdminFactura() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvAdminFactura);
		this.myMain.driver.findElement(tvAdminFactura).click();
	}

	public void clickbtn_verHistoricoPagosHogar() throws InterruptedException,MalformedURLException
	{

		this.myMain.WaitElement(btn_verHistoricoPagosHogar);
		this.myMain.driver.findElement(btn_verHistoricoPagosHogar).click();
	}

	public void clickbtn_pagar_total_factura() throws InterruptedException, MalformedURLException {
		this.myMain.WaitElement(btn_pagar_total_factura);
		this.myMain.driver.findElement(btn_pagar_total_factura).click();
	}

	public boolean isElementDisplayed(MobileElement element){
		try{
			log.info("Elemento  presente, we are good here!");
			return element.isDisplayed();
		}
		catch(Exception e){
			log.info("Elemento no presente, we are good here!");
			//System.out.println(e);
			return false;
		}
	}

	public void clickbtn_domiciliacion_factura() throws InterruptedException,MalformedURLException
	{

		this.myMain.WaitElement(btn_domiciliacion_factura);
		this.myMain.driver.findElement(btn_domiciliacion_factura).click();
	}

	public void clickbtnPagoOtherFact() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnPagoOtherFact);
		this.myMain.driver.findElement(btnPagoOtherFact).click();
	}

	public void clickbtn_enviar_factura_correo() throws InterruptedException,MalformedURLException
	{

		this.myMain.WaitElement(btn_enviar_factura_correo);
		this.myMain.driver.findElement(btn_enviar_factura_correo).click();
	}

	public void clickbtn_descargar_factura() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_descargar_factura);
		this.myMain.driver.findElement(btn_descargar_factura).click();
	}
	
	public void clickbtn_descargar_factura2() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_descargar_factura2);
		this.myMain.driver.findElement(btn_descargar_factura2).click();
	}

	public void clickbtn_convenio_electronico() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_convenio_electronico);
		this.myMain.driver.findElement(btn_convenio_electronico).click();
	}

	public void clickbtn_detalle_facturas() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_detalle_facturas);
		this.myMain.driver.findElement(btn_detalle_facturas).click();
	}

	public void clickbtn_historial_factura() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_historial_factura);
		this.myMain.driver.findElement(btn_historial_factura).click();
	}

	public void clicktvElegidos() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvElegidos);
		this.myMain.driver.findElement(tvElegidos).click();
	}

	public void clicklink_terminos_condiciones() throws InterruptedException,MalformedURLException
	{

		this.myMain.WaitElement(link_terminos_condiciones);
		this.myMain.driver.findElement(link_terminos_condiciones).click();
	}

	public void clickbtnAdminElegidoMovil() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnAdminElegidoMovil);
		this.myMain.driver.findElement(btnAdminElegidoMovil).click();
	}

	public void clickbtnAddElegido() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnAddElegido);
		this.myMain.driver.findElement(btnAddElegido).click();
	}

	public void clickbtnCancelarElegidoFijo() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnCancelarElegidoFijo);
		this.myMain.driver.findElement(btnCancelarElegidoFijo).click();
	}

	public void clicktvRemotes() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvRemotes);
		this.myMain.driver.findElement(tvRemotes).click();
	}

	public void clickbtnConfCtrlTV() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnConfCtrlTV);
		this.myMain.driver.findElement(btnConfCtrlTV).click();
	}

	public void clickbtnConfCtrlTVOpc1() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnConfCtrlTVOpc1);
		this.myMain.driver.findElement(btnConfCtrlTVOpc1).click();
	}

	public void clickbtnConfCtrlTVCod() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnConfCtrlTVCod);
		this.myMain.driver.findElement(btnConfCtrlTVCod).click();
	}

	public void clickbtnConfCtrlDeco() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnConfCtrlDeco);
		this.myMain.driver.findElement(btnConfCtrlDeco).click();
	}

	public void clickbtnConfCtrlDecoOpc1() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnConfCtrlDecoOpc1);
		this.myMain.driver.findElement(btnConfCtrlDecoOpc1).click();
	}

	public void clickbtnConfCtrlDecoCod() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnConfCtrlDecoCod);
		this.myMain.driver.findElement(btnConfCtrlDecoCod).click();
	}

	public void clicktvRecomendadorInternet() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvRecomendadorInternet);
		this.myMain.driver.findElement(tvRecomendadorInternet).click();
	}

	public void clickbtnEmpezar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnEmpezar);
		this.myMain.driver.findElement(btnEmpezar).click();
	}

	public void clickbtnRICasa() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRICasa);
		this.myMain.driver.findElement(btnRICasa).click();
	}

	public void clickbtnRIMenor35() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIMenor35);
		this.myMain.driver.findElement(btnRIMenor35).click();
	}

	public void clickbtnRIPiso1() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIPiso1);
		this.myMain.driver.findElement(btnRIPiso1).click();
	}

	public void clickbtnRIHabitacion1() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIHabitacion1);
		this.myMain.driver.findElement(btnRIHabitacion1).click();
	}

	public void clickbtnRISiguiente1() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRISiguiente1);
		this.myMain.driver.findElement(btnRISiguiente1).click();
	}

	public void clickbtnRISmartTableAdd() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRISmartTableAdd);
		this.myMain.driver.findElement(btnRISmartTableAdd).click();
	}

	public void clickbtnRIComputadoresAdd() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIComputadoresAdd);
		this.myMain.driver.findElement(btnRIComputadoresAdd).click();
	}

	public void clickbtnRISiguiente2() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRISiguiente2);
		this.myMain.driver.findElement(btnRISiguiente2).click();
	}

	public void clickbtnRIBasicoInfo() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIBasicoInfo);
		this.myMain.driver.findElement(btnRIBasicoInfo).click();
	}

	public void clickbtnRIBasicoAtras() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIBasicoAtras);
		this.myMain.driver.findElement(btnRIBasicoAtras).click();
	}

	public void clickbtnRIBasico() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIBasico);
		this.myMain.driver.findElement(btnRIBasico).click();
	}

	public void clickbtnRISiguiente3() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRISiguiente3);
		this.myMain.driver.findElement(btnRISiguiente3).click();
	}

	public void clickbtnRIReiniciar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnRIReiniciar);
		this.myMain.driver.findElement(btnRIReiniciar).click();
	}

	public void clicktvCavs() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvCavs);
		this.myMain.driver.findElement(tvCavs).click();
	}

	public void clicktvDesasociar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvDesasociar);
		this.myMain.driver.findElement(tvDesasociar).click();
	}

	public void clicktvRedMas() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvRedMas);
		this.myMain.driver.findElement(tvRedMas).click();
	}

	public void clicktvVisitaTecnica() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvVisitaTecnica);
		this.myMain.driver.findElement(tvVisitaTecnica).click();
	}

	public void clickbtnTraslado() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnTraslado);
		this.myMain.driver.findElement(btnTraslado).click();
	}
	/*
		public void clickbtnTrasCancel() throws InterruptedException, MalformedURLException {

			this.myMain.WaitElement(btnTrasCancel);
			this.myMain.driver.findElement(btnTrasCancel).click();
		}
	 */
	public void clickbtnVisitaAnt1() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnVisitaAnt1);
		this.myMain.driver.findElement(btnVisitaAnt1).click();
	}

	public void clicktvStarWars() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvStarWars);
		this.myMain.driver.findElement(tvStarWars).click();
	}

	public void clicktvClaroGamers() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvClaroGamers);
		this.myMain.driver.findElement(tvClaroGamers).click();
	}

	public void clickbtnIrCatalogo() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btnIrCatalogo);
		this.myMain.driver.findElement(btnIrCatalogo).click();
	}

	public void clicktvCuenta() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvCuenta);
		this.myMain.driver.findElement(tvCuenta).click();
	}

	public void clicktvClaroClub() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvClaroClub);
		this.myMain.driver.findElement(tvClaroClub).click();
	}

	public void clicktvRecomendados() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvRecomendados);
		this.myMain.driver.findElement(tvRecomendados).click();
	}

	public void clickclaroVideo() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(claroVideo);
		this.myMain.driver.findElement(claroVideo).click();
	}

	public void clicktvDetalleConsumo() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(tvDetalleConsumo);
		this.myMain.driver.findElement(tvDetalleConsumo).click();
	}

	public void clickbtn_aceptar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_aceptar);
		this.myMain.driver.findElement(btn_aceptar).click();
	}

	public void clickbtn_cancelar() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(btn_cancelar);
		this.myMain.driver.findElement(btn_cancelar).click();
	}

	
	public void menu() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(Menu);
		this.myMain.driver.findElement(Menu).click();
	}
	
	public void cerrarsesion() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(Cerrarsesion);
		this.myMain.driver.findElement(Cerrarsesion).click();
	}
	
	public void cerrarsesion2() throws InterruptedException, MalformedURLException {

		this.myMain.WaitElement(Cerrarsesion2);
		this.myMain.driver.findElement(Cerrarsesion2).click();
	}


	/*public void getlblMiClaro() throws MalformedURLException {	
			this.myMain.WaitElement(lblMiClaro);
			this.myMain.driver.findElement(lblMiClaro).getId();
				}*/



	/** METODOS */

	public void execLogin(String usuario, String contrasena) throws InterruptedException, MalformedURLException {
		this.clickLinkPersonas();
		this.setTxtUsuario(usuario);
		this.setTxtContrasena(contrasena);
		this.clickBtnIniciarSesion();
	}

	public void execPostPago() throws InterruptedException, MalformedURLException {		
		this.clickbtnPostPago();
	}

	public void execDetalleDeConsumos() throws InterruptedException, MalformedURLException {
		this.clickBtnDetalleConsumos();
		//this.clikcCuota();
		//this.clickBtnBeneficio();
		this.clickBtnVoz();
		this.clickBtnLdi();
		this.clickBtnSMS();
		this.clickBtnVoz();
		this.clickBtnConsumos();
		this.clickBtnApps();
		this.clickBtnatrasApps();
		this.clickBtnConsumoRecargas();
		this.clickBtnSaldo();
		this.clickBtnSaldo2();
		this.clickBtnAtras();
		this.clickBtnSaldo3();
		this.clickBtnMensaje();
		this.clickBtnAtras();
		this.clickBtnSaldo4();
		this.clickBtnAtras();
		this.clickBtnSaldo5();
		this.clickBtnMensaje();
		this.clickBtnSaldo6();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execPagaTuFactura() throws InterruptedException, MalformedURLException {
		this.clickBtnPagaTuFactura();
		log.info("clickBtnDetalleFactura");
		this.clickBtnHistorial();
		this.clickBtnAtras();
		this.clickBtnDetalleFactura();
		log.info("clickBtnAtras");
		this.clickBtnAtras();
		log.info("clickBtnPagaTuFacturAqui");
		this.clickBtnPagaTuFacturAqui();
		this.scroll();
		this.clickBtnSeleccionaListaMedioPago();
		this.BotonPSE();
		this.BotonPagar();
		this.BotonBanco();
		this.BotonBanco2();
		this.clickBtnAtras();
		//this.scroll();
		this.verticalSwipe();
		this.clickBtnPagosAutomaticos();
		this.clickBtnverhistorial();
		this.clickBtnregresar();
		
		//this.clickBtntarjetas();
		//this.clickBtntarjetas2();
		//this.clickBtninscribir();
		this.clickBtnAtras();
		this.clickBtnPagoOtrasCuentas();
		this.clickBtnagenda();
		this.clickBtDevolverAgenda();
		this.clickBtnAtras();
		//this.verticalSwipe();
		this.clickBtnDescargaTuFactura();
		this.Factura();
		//this.clickBtDevolverAgenda();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnFacturaDigital();
		this.clickBtnSuscripciones();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execDetalleDeTuPlan() throws InterruptedException, MalformedURLException {		
		this.clickBtnDetalleDeTuPlan();	
		this.clickBtnVerDetalleDeRedes();
		this.Cerrar();
		this.Administrar();
		this.clickBtnAtras();
		this.verticalSwipe();
		this.clickBtnDescripcionDelPlan();
		//this.clickBtnDescripcionDelPlanC();
		//this.scroll1();						
		this.Aplicaciones();
		this.Aplicaciones2();
		this.Aplicaciones3();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.verticalSwipe();
        this.clickBtnMejoraTuPlan();
        this.Plan2();
        this.Plan3();
        this.Plan4();
        this.Plan5();
        this.clickBtnAtras();
		this.clickBtnPaquetesAdicionales();
		this.clickBtnCerrar();
		this.clickBtnAdministraTuRoaming();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execRecargasyPaquetes() throws InterruptedException, MalformedURLException {		
		this.clickBtnRecargasPaquetes();
		this.clickBtnVerTerminos();
		this.clickBtnAtras();
		this.clickBtnComprasRecurrentes();
		this.clickBtnContraSaldo();
		this.clickBtnCerrar();
		this.clickBtnTarjetaCredito();
		this.clickBtnCerrar();
		this.clickBtnAtras();
		this.clickBtnPaquetesDatos();
		this.clickBtnRecargas();
		this.clickListaValoresRecargas();
		this.clickOpcionRecarga();
		/*
		 * PENDIENTE POR ERROR EN XPATH
		 * this.clickbtnRecargar();
		 * this.clickbtnConfirmarRecarga();
		 * this.clickBtnAtras();
		 * this.clickbtnCerrarOpcion();
		 */
		this.clickBtnAtrasImg();
	}

	public void execFamiliayAmigos() throws InterruptedException, MalformedURLException {		
		this.clickbtnFamiliayAmigos();
		this.clickbtnFamiliayAmigos1();
		this.clickBtnAtras();
		this.clickBtnElegidosTodoDestino();
		this.clicklink_terminos_condiciones();
		this.clickBtnAtras();
		this.clickBtnAtras();
		//this.clickBtnElegidoDeTexto();
		//this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execRoamingInternacional() throws InterruptedException, MalformedURLException {		
		this.clickBtnRoamingInternacional();
		this.clickBtnAtras();
	}

	public void execGestionaTuEquipo() throws InterruptedException, MalformedURLException {		
		this.clickBtnGestionaTuEquipo();
		this.clickBtnRegistraTuEquipo();
		this.clickBtnCerrar();
		this.clickBtnRegistraTuImeiDuplicado();
		this.clickBtnCerrar();
		//this.clickBtnReconectaPorRoboPerdida();
		//this.clickBtnCerrar();
		this.clickBtnConsultaTusEquipos();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execCambiaTuNumero() throws InterruptedException, MalformedURLException {		
		this.clickBtnCambiaTuNumero();
		this.clickBtnAtras();
	}

	public void execRedimeBeneficios() throws InterruptedException, MalformedURLException {		
		this.clickBtnRedimeBeneficios();
		this.clickBtnAtras();
		this.scroll1();
	}

	public void execCentroVentas() throws InterruptedException, MalformedURLException {	
		this.clickBtnCavs();
		this.clickBtnAtras();
	}

	public void execChateaConNosotros() throws InterruptedException, MalformedURLException {
		this.clickChateConNosotros();
		this.clickBtnAtras();
	}

	public void execRecomendados() throws InterruptedException, MalformedURLException {
		this.clickRecomendados();
		this.scroll1();
		this.clickBtnAtras();
	}

	/********************* METODOS PREPAGO*****************/

	public void execPrepago() throws InterruptedException, MalformedURLException {		
		this.clickBtnPrepago();
	}

	public void execSaldosConsumos() throws InterruptedException, MalformedURLException {
		this.clicktvDetalleConsumos();
		this.clickbtn_consultar_detalle_mesanterior();
		this.clickbtn_consultar_recargasmes_anterior();
		this.clickBtnAtras();
		this.clickbtn_consultar_consumosmes();
		//this.clickbtn_aceptar();
		this.detalle();
		this.clickBtnAtras();
		this.detalle2();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickbtn_consultar_recargas();
		this.clickBtnAtras();
		this.clickbtn_consultar_consumos();
		//this.clickbtn_consultar_detalle_llamadas();
		//this.clickexpand_detalle();
		this.detalle3();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickbtn_img_otros_saldos();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execDetallePlanPre() throws InterruptedException, MalformedURLException {
		this.clicktvDetallePlan();
		this.clickbtnAdmBene();
		this.clickbtnHomEleTodDest();
		this.clicklink_terminos_condiciones();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickbtnHomEleAmi();
		this.clicklink_terminos_condiciones();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.verticalSwipe();
		this.clickbtn_cambio_plan();
		this.clickinformacion_prepago();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.vercontrato();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execGestionaEquipoPre() throws InterruptedException, MalformedURLException {
		this.clicktvAdminEquipo();
		this.clickbtnRegistrarEquipo();
		this.clickbtn_aceptar();
		this.clickbtnRegisImei();
		this.clickbtn_aceptar();
		this.clickbtnConsultarEquipo();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execRecargasPaquetesPre() throws InterruptedException, MalformedURLException {
		this.clicktvRecargas();
		this.clickedtNumero();
		this.clickbtnCancelarElegidoTexto();
		this.clicktxtTerminos();
		this.clickBtnAtras();
		this.clickcardComprasRecurrentes();
		this.clickbtnAdminCompRecuCont();
		this.clickbtn_aceptar();
		this.clickbtnAdminCompRecuTarj();
		this.clickbtn_aceptar();
		this.clickBtnAtras();
		this.clickbtnPaqTodoIncE();
		this.clickbtnPaqTodoIncC();

		this.clickbtnPaqDatE();
		this.clickbtnPaqDatC();

		this.clickbtnPaqAppE();
		this.clickbtnPaqAppC();

		this.clickbtnPaqVozE();
		this.clickbtnPaqVozC();

		this.clickbtnFiltro();
		this.clickbtnApliDiaPaqRec();

		this.clickbackgroundRecargasBtn();
		this.clickbackgroundPaquetesBtn();

		this.clickBtnAtrasImg();
	}

	public void execElegidosPre() throws InterruptedException, MalformedURLException {
		this.clicktvElegidosTodoDestino();
		this.clickbtnHomEleTodDest();
		this.clicklink_terminos_condiciones();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickbtnHomEleAmi();
		this.clicklink_terminos_condiciones();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	public void execAdministraNavegacion() throws InterruptedException, MalformedURLException {
		this.clicktvNavegacion();
		this.clickBtnAtras();
	}

	public void execCentroAtencionVentasPre() throws InterruptedException, MalformedURLException {
		this.clicktvCavs();
		this.clickBtnAtras();
	}

	public void execChateaConNosotrosPre() throws InterruptedException, MalformedURLException {
		this.clicktvChat();
		this.clickBtnAtras();
	}

	public void execClaroVideoPre() throws InterruptedException, MalformedURLException {
		this.clickopenClaroVideo();
	}

	public void execClaroMusicaPre() throws InterruptedException, MalformedURLException {
		this.clickopenClaromusic();
	}


	/********************* METODOS HOGAR*****************/

	//Detalle de tu plan

	public void execHogar() throws InterruptedException, MalformedURLException {
		this.clicktvHogar();
	}

	public void execDetalleDeTuPlanHogar() throws InterruptedException, MalformedURLException {
		this.clicktvDetallePlan();
		this.clickbtnNavegacionDatos();
		this.clickbtn_aceptar();
		this.clickbtnRegulatorio();
		this.clickBtnAtras();
		this.clickbtn_televi_paque();
		this.clickBtnAtras();
		//this.clickbtn_aceptar();
		this.clickbtnAdquirirPaquetePremium();
		this.clickBtnAtras();
		this.clickbtn_indicativos();
		this.clickrbIndiLdiNal();
		this.clickrbIndiLdiInter();
		//this.clickspiFragLdiNal();
		this.clickBtnAtras();
		this.clickbtn_tarificador();
		this.clickrgTarifiLineas();
		this.clickbtnTarifiLines();
		this.clickbtn_aceptar();
		this.clickBtnAtras();
		this.clickbtnPortalVoz();
		this.clickbtn_aceptar();
		this.clickBtnAtras();
		/*
		 * Pendiente abre google play
		 * this.clickbtnDescargarVoz();
		 * this.clickbtn_cancelar();
		 */
		this.scroll();
		this.clickbtnPromo();
		this.clickBtnAtras();
		this.clickBtnAtras();	
	}

	//Paga tu factura
	public void execPagaFactura() throws InterruptedException, MalformedURLException {
		this.clicktvAdminFactura();
		this.clickbtn_verHistoricoPagosHogar();
		this.clickBtnAtras();
		//this.clickbtn_pagar_total_factura();
		//this.clickBtnAtras();
		this.clickbtn_domiciliacion_factura();
		this.clickBtnverhistorial();
		this.clickBtnregresar();
		this.clickBtnAtras();
		this.clickbtnPagoOtherFact();
		this.clickBtnAtras();
		this.verticalSwipe();
		this.clickbtn_enviar_factura_correo();
		this.clickbtn_aceptar();
		this.clickbtn_descargar_factura();
		this.clickbtn_descargar_factura2();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickbtn_convenio_electronico();
		this.clickBtnAtras();
		this.clickbtn_detalle_facturas();
		this.clickbtn_historial_factura();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
		
		this.menu();
		this.cerrarsesion();
		this.cerrarsesion2();
	}

	//Visitas técnicas
	public void execVisitasTecnicas() throws InterruptedException, MalformedURLException {
		this.clicktvVisitaTecnica();
		this.clickbtnTraslado();
		this.clickbtnTrasCancel();
		this.clickbtnVisitaAnt1();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}


	//Personaliza tu red WIFI
	public void execPersonalizaRedWifi() throws InterruptedException, MalformedURLException {
		this.clicktvPersonalizaWifi();
		this.clickbtnPersonalizaModem();
		this.clickbtnPersoWifiDialog();
		this.clickBtnAtras();
		this.clickbtnPersonalizaModem();
		this.clickbtnInfoWifiDialog();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	//Elegidos
	public void execElegidos() throws InterruptedException, MalformedURLException {
		this.clicktvElegidos();
		this.clicklink_terminos_condiciones();
		this.clickBtnAtras();
		this.clickbtnAdminElegidoMovil();
		this.clickbtnAddElegido();
		this.clickbtnCancelarElegidoFijo();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	//Entra al lado Claro
	public void execEntraLadoClaro() throws InterruptedException, MalformedURLException {
		this.clicktvStarWars();
		this.clickBtnAtras();
	}

	//Adquirir producto
	public void execAdquirirProducto() throws InterruptedException, MalformedURLException {
		this.clicktvAdquirirProducto();
		this.clickBtnAtras();
	}

	//Configurar Control Remoto
	public void execControlRemoto() throws InterruptedException, MalformedURLException {
		this.clicktvRemotes();
		this.clickbtnConfCtrlTV();
		this.clickbtnConfCtrlTVOpc1();
		this.clickbtnConfCtrlTVCod();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();

		this.clickbtnConfCtrlDeco();
		this.clickbtnConfCtrlDecoOpc1();
		this.clickbtnConfCtrlDecoCod();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	//Claro Gaming
	public void execClaroGaming() throws InterruptedException, MalformedURLException {
		this.clicktvClaroGamers();
		this.clickbtnIrCatalogo();
		this.clickBtnAtras();
		this.clickBtnAtras();
	}

	//Solicitar traslado
	public void execSolictarTraslado() throws InterruptedException, MalformedURLException {
		this.clicktvTraslados();
		this.clicklbTextTrasUbi();
		this.verticalSwipe(); 
		this.clickbtnTrasCancel();
	}

	//Recomendador de internet
	public void execRecomendadorInternet() throws InterruptedException, MalformedURLException {
		this.clicktvRecomendadorInternet();
		this.clickbtnEmpezar();

		this.clickbtnRICasa();

		this.clickbtnRIMenor35();

		this.clickbtnRIPiso1();

		this.clickbtnRIHabitacion1();

		this.clickbtnRISiguiente1();

		this.clickbtnRISmartTableAdd();

		this.clickbtnRIComputadoresAdd();

		this.clickbtnRISiguiente2();

		this.clickbtnRIBasicoInfo();

		this.clickbtnRIBasicoAtras();

		this.clickbtnRIBasico();

		this.clickbtnRISiguiente3();

		this.clickbtnRIReiniciar();

		this.clickBtnAtras();
	}

	//Redime beneficios
	public void execRedimeBeneficiosHogar() throws InterruptedException, MalformedURLException {
		this.clicktvCuenta();
		this.verticalSwipe();
		this.clicktvClaroClub();
		this.clickBtnAtras();
	}

	//Centros de atencion y ventas
	public void execCentroAtencionVentas() throws InterruptedException, MalformedURLException {
		this.clicktvDirectionHogar();
		this.verticalSwipe();
		this.clicktvZonasWifi();
		this.clickBtnAtras();
	}

	//Chatea con nosotros
	public void execChateaNosotros() throws InterruptedException, MalformedURLException {
		this.clicktvCavs();
		this.clickBtnAtras();
	}

	//Recomendados
	public void execRecomendadosHogar() throws InterruptedException, MalformedURLException {
		this.clicktvRecomendados();
		this.clickBtnAtras();
	}

	//Configuracion y Soporte
	public void execConfiguracionSoporte() throws InterruptedException, MalformedURLException {
		this.clicktvConfigSupport();
		this.clickBtnAtras();
	}

	//Desasociar cuenta
	public void execDesasociarCuenta() throws InterruptedException, MalformedURLException {
		this.clicktvDesasociar();
		this.clickbtn_cancelar();
	}

	//Claro video
	public void execClaroVideo() throws InterruptedException, MalformedURLException {
		this.clickclaroVideo();
		//Pendiente abre google play
	}

	//Claro Musica
	public void execClaroMusica() throws InterruptedException, MalformedURLException {
		this.clickclaroMusica();
		//Pendiente abre google play
	}

	//Streaming en vivo
	public void execStreamingVivo() throws InterruptedException, MalformedURLException {
		this.clicktvRedMas();
		this.clickBtnAtras();
	}


	//Detalle de consumos
	public void execDetalleConsumos() throws InterruptedException, MalformedURLException {
		this.clicktvDetalleConsumo();
		this.clickbtn_aceptar();
	}

	//Menu
		public void execmenu() throws InterruptedException, MalformedURLException {
			this.menu();
			this.cerrarsesion();
			this.cerrarsesion2();
		}
	

}
