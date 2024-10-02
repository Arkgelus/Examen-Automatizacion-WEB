package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.MyLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class TiendaStepDefinitions {
    private WebDriver driver;
    @Given("estoy en la pagina de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");
        screenShot();
    }

    @And("me logueo con mi usuario {string} y clave  {string}")
    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {

        MyLoginSteps myLoginSteps=new MyLoginSteps(driver);
        myLoginSteps.typeUser(usuario);
        myLoginSteps.typePassword(clave);
        myLoginSteps.login();
        screenShot();

    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String arg0, String arg1) {

    }

    @And("agrego {string} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(String arg0) {
    }

    @When("valido en el popup la configuracion del producto agregado")
    public void validoEnElPopupLaConfiguracionDelProductoAgregado() {
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
    }

    @When("finalizado la compra")
    public void finalizadoLaCompra() {
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
    }

    @And("vuelvo a validad el calculo del precios en el carrito")
    public void vuelvoAValidadElCalculoDelPreciosEnElCarrito() {
    }
}
