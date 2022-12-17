package com.dafiti.www.stepDefinitions;

import com.dafiti.www.questions.ValidarProducto;
import com.dafiti.www.taks.AgregarProductoTaks;
import com.dafiti.www.taks.AgregarSegundoProductoTaks;
import com.dafiti.www.taks.EliminarProductoTaks;
import com.dafiti.www.taks.InicioSesionTaks;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProductosStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor miguel = Actor.named("miguel");


    @Before
    public void configuracion(){
        OnStage.setTheStage(new OnlineCast());
        miguel.can(BrowseTheWeb.with(navegador));
    }

    @Cuando("^el usuario inicie sesion en la pagina web$")
    public void elUsuarioInicieSesionEnLaPaginaWeb() {
        miguel.attemptsTo(InicioSesionTaks.entrar());
    }

    @Cuando("^el usuario seleccione una categoria para agregar un producto al carrito$")
    public void elUsuarioSeleccioneUnaCategoriaParaAgregarUnProductoAlCarrito() {
       miguel.attemptsTo(AgregarProductoTaks.agregar1());
    }


    @Cuando("^el usuario seleccione otro producto y lo agregue al carrito$")
    public void elUsuarioSeleccioneOtroProductoYLoAgregueAlCarrito() {
        miguel.attemptsTo(AgregarSegundoProductoTaks.agregar2());
    }

    @Cuando("^el usuario vaya al carrito de compras para eliminar los productos$")
    public void elUsuarioVayaAlCarritoDeComprasParaEliminarLosProductos() {
        miguel.attemptsTo(EliminarProductoTaks.eliminar());
    }

    @Entonces("^el usuario visualiza un mensaje$")
    public void elUsuarioVisualizaUnMensaje() {
        miguel.should(seeThat("el usuario puede ver", ValidarProducto.validar(), Matchers.equalTo(true)));
    }
}
