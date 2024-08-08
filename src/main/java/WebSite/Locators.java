package WebSite;

import org.openqa.selenium.By;

public class Locators {
    //Definiendo Scroll
    public static final int scrollAmount = 530; // Cantidad de píxeles a desplazar
    public static final int scroll1Amount = 220; // Cantidad de píxeles a desplazar
    public static final int scroll2Amount = 1000; // Cantidad de píxeles a desplazar

    //cerrar
    public static final By cerrarNodal = By.xpath("/html/body/div[5]/div[2]/span/img");
    //mensaje
    public static final By confirmationMessage = By.xpath("/html/body/div[5]/div[2]/div/div/div/h3"); //Identifica que el mensaje sea correcto

    //Click to call
    public static final By call = By.xpath("/html/body/div[3]/a");

    //Banner Principal
    public static final By inputCelular1 = By.xpath("/html/body/div[3]/section/div[2]/div/swiper-container/swiper-slide/div/div/div[1]/form/div[1]/div[1]/input"); // Identificador del campo Celular
    public static final By registrarButton = By.xpath("/html/body/div[3]/section/div[2]/div/swiper-container/swiper-slide/div/div/div[1]/form/div[1]/div[2]/button"); // Identificador del botón

    //MiniBanner Sube de Nivel
    public static final By nivelButton = By.xpath("/html/body/div[3]/section/div[5]/div/div[2]");
    //checkbox
    public static final By selectBox = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[1]");
    public static final By selectBox1 = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[2]");
    public static final By selectBox2 = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[3]");
    public static final By selectBox3 = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[4]");
    public static final By selectBox4 = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[5]");
    public static final By selectBox5 = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[6]");
    public static final By selectBox6 = By.xpath("/html/body/div[3]/section/div[6]/div/div/label[7]");
    public static final By buscarButton = By.xpath("/html/body/div[3]/section/div[6]/div/button[1]");
    public static final By limpiarButton = By.xpath("/html/body/div[3]/section/div[6]/div/button[2]");
    public static final By inputDNI = By.xpath("/html/body/div[5]/div[2]/div/div/form/div[1]/label[1]/div/input");
    public static final By inputCelular = By.xpath("/html/body/div[5]/div[2]/div/div/form/div[1]/label[2]/div/input");
    public static final By submitButton2 = By.xpath("/html/body/div[5]/div[2]/div/div/form/div[2]/div/button");

    //parrilla
    public static final By input1DNI = By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/form/div[1]/label/div/input");
    public static final By input1Celular = By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/form/div[2]/label/div/input");
    public static final By FormularioButton = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/swiper-container/swiper-slide[1]/div/div[3]/button");
    public static final By SubmitButton = By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/form/div[4]/div/button");
    public static final By cerrarNodal1 = By.xpath("/html/body/div[6]/div[2]/span");

    //Acordeon Planes
    public static final By IntVerBenef1 = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/swiper-container/swiper-slide[1]/div/div[5]");
    public static final By IntVerBenef2 = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/swiper-container/swiper-slide[2]/div/div[5]");
    public static final By IntVerBenef3 = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/swiper-container/swiper-slide[3]/div/div[4]");

    //Ver Politicas
    public static final By terminosCheck = By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/form/div[3]/div/div[1]/input");
    public static final By terminosLink = By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/form/div[3]/div/div[1]/label/span");
    public static final By terminosLink1 = By.xpath("/html/body/div[6]/div[2]/div/div/div[2]/a");

    //planes
    public static final By planDTV = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/div/div[2]");
    public static final By planDF = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/div/div[3]");
    public static final By planTrio = By.xpath("/html/body/div[3]/section/div[6]/div[2]/div/div/div/div[4]");

    //preguntas frecuentes
    public static final By pregunta1 = By.xpath("/html/body/div[3]/section/div[10]/div[2]/div");
    public static final By pregunta2 = By.xpath("/html/body/div[3]/section/div[10]/div[4]/div");
    public static final By pregunta3 = By.xpath("/html/body/div[3]/section/div[10]/div[6]/div");
    public static final By pregunta4 = By.xpath("/html/body/div[3]/section/div[10]/div[8]/div");

    //Legales
    public static final By verTerminos = By.xpath("/html/body/div[3]/section/div[11]/div[1]");
}
