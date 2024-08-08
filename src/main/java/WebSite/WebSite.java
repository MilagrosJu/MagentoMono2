package WebSite;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WebSite {

    private static WebDriver driver;

    public WebSite(WebDriver driver) {
        WebSite.driver = driver;
    }

    public void navigateToWebsite(String url) throws InterruptedException {
        driver.get(url);

        // Use WebDriverWait para espera explícita (recomendado)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));  // Espere la carga básica de la página
    }
    // Scroll
    public void scrollByPixels(int amount) throws InterruptedException {
        // Desplazar la ventana verticalmente por la cantidad especificada
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + amount + ")");
        Thread.sleep(4000);
    }
    //cerrar nodales
    public void closeModal() throws InterruptedException {
        driver.findElement(Locators.cerrarNodal).click();
        Thread.sleep(4000);
    }
    public void closeModal1() throws InterruptedException {
        driver.findElement(Locators.cerrarNodal1).click();
        Thread.sleep(4000);
    }
   //validar pedidos
   public String validarPedido () {
        return driver.findElement(Locators.confirmationMessage).getText();
   }
    //Click To Call
   public void ClickToCall(String urlValue) throws InterruptedException {
       WebElement callButton = driver.findElement(Locators.call);
       Thread.sleep(3000);
       String hrefValue = callButton.getAttribute("href");

       if (hrefValue.equals(urlValue)) {
           System.out.println("URL de llamada correcta");
       } else {
           System.err.println("¡Error! La URL no coincide: " + hrefValue);
       }
   }

    //Banner principal
   public void inputFormularioBanner(String celular) {
        driver.findElement(Locators.inputCelular1).click();
        driver.findElement(Locators.inputCelular1).sendKeys(celular);
   }
   public void submitPedidoBanner() throws InterruptedException {
       driver.findElement(Locators.registrarButton).click();
       Thread.sleep(6000);
   }
    //Mini Banner sube de nivel
   public void IniciarNivel() throws InterruptedException {
       driver.findElement(Locators.nivelButton).click();
       Thread.sleep(2000);
   }
   //Acordeon
   public void SeleccionarChecbox() throws InterruptedException {
       driver.findElement(Locators.selectBox).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox1).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox2).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox3).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox4).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox5).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox6).click();
       Thread.sleep(500);
   }
   public void limpiarButton() throws InterruptedException {
       driver.findElement(Locators.limpiarButton).click();
       Thread.sleep(2000);
   }
   public void seleccionRandom() throws InterruptedException {
       driver.findElement(Locators.selectBox).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox2).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox3).click();
       Thread.sleep(500);
       driver.findElement(Locators.selectBox5).click();
       Thread.sleep(500);
   }
   public void buscarButton() throws InterruptedException {
       driver.findElement(Locators.buscarButton).click();
       Thread.sleep(5000);
   }
   public void inputFormularioNivel(String dni, String celular) {
       driver.findElement(Locators.inputDNI).sendKeys(dni);
       driver.findElement(Locators.inputCelular).sendKeys(celular);
   }

   public void submitPedidoNivel() throws InterruptedException {
       driver.findElement(Locators.submitButton2).click();
       Thread.sleep(4000);
   }

   //Validar links
   public void openPlan() throws InterruptedException {
        driver.findElement(Locators.FormularioButton).click();
        Thread.sleep(2000);
   }
   public void openTratamiento() throws InterruptedException {
       driver.findElement(Locators.terminosCheck).click();
       Thread.sleep(2000);
       driver.findElement(Locators.terminosCheck).click();
       Thread.sleep(1000);
       driver.findElement(Locators.terminosLink).click();
       Thread.sleep(2000);
   }
   //Acordeon
   public void SeleccionarAcordeon() throws InterruptedException {
       driver.findElement(Locators.IntVerBenef1).click();
       Thread.sleep(2000);
       driver.findElement(Locators.IntVerBenef2).click();
       Thread.sleep(2000);
       driver.findElement(Locators.IntVerBenef3).click();
       Thread.sleep(2000);
   }
    public void cerrarAcordeon() throws InterruptedException {
        driver.findElement(Locators.IntVerBenef1).click();
        Thread.sleep(1000);
        driver.findElement(Locators.IntVerBenef2).click();
        Thread.sleep(1000);
        driver.findElement(Locators.IntVerBenef3).click();
        Thread.sleep(1000);
    }

   //Registrar Plan
   public void validarPoliticas(String urlEsperada, String nombreSeccion) throws InterruptedException {
        String handlePaginaActual = driver.getWindowHandle();
        driver.findElement(Locators.terminosLink1).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(handlePaginaActual)) {
                driver.switchTo().window(handle);
                String urlActual = driver.getCurrentUrl();

                if (urlActual.equals(urlEsperada)) {
                    System.out.println("URL correcta: " + urlActual + " " + nombreSeccion);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                } else {
                    System.err.println("¡Error! La URL no coincide: " + urlActual);
                    driver.close(); // Cerrar la ventana actual
                    driver.switchTo().window(handlePaginaActual); // Volver a la ventana inicial
                }
            }
        }
   }
   public void inputFormulario1(String dni, String celular) {
        driver.findElement(Locators.input1DNI).sendKeys(dni);
        driver.findElement(Locators.input1Celular).sendKeys(celular);
   }

   public void submitPedidoPlan() throws InterruptedException {
        driver.findElement(Locators.SubmitButton).click();
        Thread.sleep(6000);
   }

   public void planDuoTV() throws InterruptedException {
       driver.findElement(Locators.planDTV).click();
       Thread.sleep(500);
   }
   public void planDuoFijo() throws InterruptedException {
       driver.findElement(Locators.planDF).click();
       Thread.sleep(500);
   }
   public void planTrio() throws InterruptedException {
       driver.findElement(Locators.planTrio).click();
       Thread.sleep(500);
   }
   public void preguntasFrec() throws  InterruptedException {
       driver.findElement(Locators.pregunta1).click();
       Thread.sleep(1000);
       driver.findElement(Locators.pregunta2).click();
       Thread.sleep(1000);
       driver.findElement(Locators.pregunta3).click();
       Thread.sleep(1000);
       driver.findElement(Locators.pregunta4).click();
       Thread.sleep(1000);
   }
   public void verLegales() throws  InterruptedException {
       driver.findElement(Locators.verTerminos).click();
       Thread.sleep(3000);
       driver.findElement(Locators.verTerminos).click();
   }

//    public void selectPromNove() throws InterruptedException {
//        WebElement checkboxBeforeElement = driver.findElement(Locators.deselpm2Box);  // Localizar el elemento con ::before
//        // Cast driver to JavascriptExecutor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        // Simular clic usando JavaScript
//        js.executeScript("arguments[0].click();", checkboxBeforeElement);
//        Thread.sleep(1000);
//        WebElement checkbox2BeforeElement = driver.findElement(Locators.selpm2Box);  // Localizar el elemento con ::before
//        // Cast driver to JavascriptExecutor
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//        // Simular clic usando JavaScript
//        js2.executeScript("arguments[0].click();", checkbox2BeforeElement);
//        Thread.sleep(1000);
//        //driver.findElement(Locators.promm2Link).click();
//        //Thread.sleep(2000);
//        //driver.findElement(Locators.promm2Cerrar).click();
//        //Thread.sleep(2000);
//    }
//
//    public void selectRestricciones() throws InterruptedException {
//        WebElement checkboxBeforeElement = driver.findElement(Locators.deselrm2Box);  // Localizar el elemento con ::before
//        // Cast driver to JavascriptExecutor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        // Simular clic usando JavaScript
//        js.executeScript("arguments[0].click();", checkboxBeforeElement);
//        Thread.sleep(1000);
//        WebElement checkbox2BeforeElement = driver.findElement(Locators.selrm2Box);  // Localizar el elemento con ::before
//        // Cast driver to JavascriptExecutor
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//        // Simular clic usando JavaScript
//        js2.executeScript("arguments[0].click();", checkbox2BeforeElement);
//        Thread.sleep(1000);
//        //driver.findElement(Locators.restm2Link).click();
//        //Thread.sleep(2000);
//        //driver.findElement(Locators.restm2Cerrar).click();
//        //Thread.sleep(2000);
//    }

//    public void abrir2M5EnlaceEnNuevaVentana(String url) throws InterruptedException {
//        String handlePaginaActual = driver.getWindowHandle(); // Obtener el identificador de ventana actual
//        driver.findElement(Locators.polm4Link).click(); // Click en el enlace Políticas
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Tiempo máximo de espera (10)
//        wait.until(ExpectedConditions.numberOfWindowsToBe(3)); // Cantidad de páginas (2)
//        // Validar que la URL nueva sea igual al Enlace
//        for (String handle : driver.getWindowHandles()) {
//            if (handle.equals(handlePaginaActual)) {  // Si deseas pasar a la nueva ventana agrear el signo de admiración "!" antes de handle.equals
//                driver.switchTo().window(handle);
//                break;
//            }
//        }
//        Thread.sleep(5000);
//    }
//

//    // Términos y Condiciones
//    public void desplegarTerminos() throws InterruptedException{
//        driver.findElement(Locators.clickaTerminos).click();
//        Thread.sleep(1000);
//    }
//
//    public String validarVencimiento() {
//        return driver.findElement(Locators.validarLegal).getText();
//    }
//
//    public void contraerTerminos() throws InterruptedException{
//        driver.findElement(Locators.clickcTerminos).click();
//        Thread.sleep(1000);
//    }

}
