import WebSite.Locators;
import SetUp.SetUp;
import WebSite.WebSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcuteTest {

    private static WebDriver driver;
    private static WebSite webSite;

    public static void main(String[] args) throws InterruptedException {
        driver = SetUp.getDriver();
        webSite = new WebSite(driver);

        // Variables Standaroup
        String url = "https://tiendaonline.movistar.com.pe/ofertas/servicioshogar/internet-gamer";
        String celular = "999999999";
        String dni = "99999999";

        //Scroll
        webSite.navigateToWebsite(url);
        webSite.scrollByPixels(Locators.scroll1Amount); //Scroll 220 píxeles
        webSite.ClickToCall("tel:0800-19239");

        // Banner
        webSite.inputFormularioBanner(celular);
        webSite.submitPedidoBanner();
        String mensajeBanner = webSite.validarPedido();
        if (mensajeBanner.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación BANNER");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();
        webSite.scrollByPixels(Locators.scroll2Amount); //Scroll 1000 píxeles

        //Mini Banner Sube de Nivel
        webSite.IniciarNivel();
        webSite.SeleccionarChecbox();
        webSite.limpiarButton();
        webSite.seleccionRandom();
        webSite.buscarButton();
        webSite.inputFormularioNivel(dni, celular);
        webSite.submitPedidoNivel();
        String mensajeSubeNivel = webSite.validarPedido();
        if (mensajeSubeNivel.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación SUBE DE NIVEL");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();

        //Registrar Plan de Internet
        webSite.SeleccionarAcordeon();
        webSite.openPlan();
        webSite.openTratamiento();
        webSite.validarPoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "INTERNET FIBRA");
        webSite.closeModal1();
        webSite.inputFormulario1(dni, celular);
        webSite.submitPedidoPlan();
        String mensajeInternet = webSite.validarPedido();
        if (mensajeInternet.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación INTERNET FIBRA");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();

        //Registrar Plan Dúo Internet + TV
        webSite.planDuoTV();
        webSite.SeleccionarAcordeon();
        webSite.openPlan();
        webSite.openTratamiento();
        webSite.validarPoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "DÚO INTERNET + TV");
        webSite.closeModal1();
        webSite.inputFormulario1(dni, celular);
        webSite.submitPedidoPlan();
        String mensajeDuoTV = webSite.validarPedido();
        if (mensajeDuoTV.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación DÚO INTERNET + TV");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();
        webSite.cerrarAcordeon();

        //Registrar Plan Dúo Internet + Fijo
        webSite.planDuoFijo();
        webSite.SeleccionarAcordeon();
        webSite.openPlan();
        webSite.openTratamiento();
        webSite.validarPoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "DÚO INTERNET + FIJO");
        webSite.closeModal1();
        webSite.inputFormulario1(dni, celular);
        webSite.submitPedidoPlan();
        String mensajeDuoFijo = webSite.validarPedido();
        if (mensajeDuoFijo.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación DÚO INTERNET + FIJO");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();
        webSite.cerrarAcordeon();

        //Registrar Plan Trío Fibra
        webSite.planTrio();
        webSite.SeleccionarAcordeon();
        webSite.openPlan();
        webSite.openTratamiento();
        webSite.validarPoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "TRÍO FIBRA");
        webSite.closeModal1();
        webSite.inputFormulario1(dni, celular);
        webSite.submitPedidoPlan();
        String mensajeTrioF = webSite.validarPedido();
        if (mensajeTrioF.equals("¡Gracias por contactarnos!")) {
            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación TRÍO FIBRA");
        } else {
            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
        }
        webSite.closeModal();
        webSite.cerrarAcordeon();

        //Preguntas Frecuentes
        webSite.scrollByPixels(Locators.scroll2Amount);
        webSite.preguntasFrec();
        //Términos y condiciones
        webSite.scrollByPixels(Locators.scroll1Amount);
        webSite.verLegales();
        webSite.scrollByPixels(Locators.scroll1Amount);


        SetUp.closeDriver();
    }
}
