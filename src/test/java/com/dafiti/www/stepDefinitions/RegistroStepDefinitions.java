package com.dafiti.www.stepDefinitions;

import com.dafiti.www.questions.ValidacionRegistro;
import com.dafiti.www.taks.RegistroTaks;
import com.dafiti.www.ui.RegistroPages;
import com.dafiti.www.utils.Excel;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.io.IOException;

public class RegistroStepDefinitions {

    Excel excel = new Excel();
    @Managed (driver = "chrome")
    private WebDriver navegador;
    private Actor miguel = Actor.named("miguel");


    @Before
    public void configuracion(){
        OnStage.setTheStage(new OnlineCast());
        miguel.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^que el usuario se encuentre en la pagina web de dafiti$")
    public void queElUsuarioSeEncuentreEnLaPaginaWebDeDafiti() throws IOException {
        miguel.attemptsTo(Open.url(excel.leerDatosExcel("DatosDafiti.xlsx","Dominios",1,0)));
    }


    @Cuando("^el usuario ingrese los datos para el registro$")
    public void elUsuarioIngreseLosDatosParaElRegistro() {
        miguel.attemptsTo(RegistroTaks.registro());
    }

    @Entonces("^el usuario visualiza su nombre$")
    public void elUsuarioVisualizaSuNombre() {
        miguel.should(seeThat("el actor puede ver", ValidacionRegistro.validar(), Matchers.equalTo(true)));
    }
}
