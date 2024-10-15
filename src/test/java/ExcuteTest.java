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
        String url = "https://tiendaonline.movistar.com.pe/ofertas/servicioshogar/magento-mono2";
        String celular = "999999999";

        webSite.navigateToWebsite(url);
        //Banner Principal - NO ACTIVADO
        //webSite.visitBanner("https://tienda.movistar.com.pe/solicitud/checkout/cobertura?service=78164161300FTTH&ref_origin=LC_MAGENTOMONO2_SOLOINTERNET_PARRILLA_300MBPS_HOGAR", "TIENDA MOVISTAR INTERNET 79.9");

        //Parrilla de Planes
        webSite.Acordeon();
        webSite.validarParrilla("PARRILLA DE PLANES");
        webSite.Acordeon();
        webSite.scrollByPixels(Locators.scroll2Amount);
        webSite.scrollByPixels(Locators.scrollAmount);

        //Canales Exclusivos - NO HABILITADO
//        webSite.CanalesExclusivos();
//        webSite.openTratamiento();
//        webSite.validarPoliticas("https://centrodetransparencia.movistar.com.pe/politica-local-privacidad", "CANALES EXCLUSIVOS");
//        webSite.closeModal();
//        webSite.inputFormulario(celular);
//        webSite.submitCanales();
//        String mensajeInternet = webSite.validarPedido();
//        if (mensajeInternet.equals("¡Gracias por contactarnos!")) {
//            System.out.println("Prueba exitosa: Se verificó el mensaje de confirmación INTERNET FIBRA");
//        } else {
//            System.out.println("Prueba fallida: El mensaje de confirmación no es el esperado");
//        }
//        webSite.closeModal();

        //Términos y condiciones
        webSite.verLegales();
        webSite.scrollByPixels(Locators.scroll1Amount);
        webSite.verLegales();

        SetUp.closeDriver();
    }
}
