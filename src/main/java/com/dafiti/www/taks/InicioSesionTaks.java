package com.dafiti.www.taks;

import com.dafiti.www.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.dafiti.www.ui.InicioSesionPages.*;
import static com.dafiti.www.ui.RegistroPages.LBL_NUEVOS_CLIENTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class InicioSesionTaks implements Task {

    Excel excel = new Excel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_REGISTRAR_ENTRAR, isClickable()).forNoMoreThan(120).seconds(),
                    Click.on(BTN_REGISTRAR_ENTRAR),
                    WaitUntil.the(LBL_NUEVOS_CLIENTES, isClickable()).forNoMoreThan(120).seconds(),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Credenciales",1,0)).into(TXT_EMAIL),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Credenciales",1,1)).into(TXT_CLAVE),
                    Click.on(BTN_INICIO_SESION)

                    );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static InicioSesionTaks entrar (){
        return instrumented (InicioSesionTaks.class);
    }

}
