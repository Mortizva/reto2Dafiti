package com.dafiti.www.taks;

import com.dafiti.www.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.dafiti.www.ui.MensajeRegistroPages.LBL_NOMBRE_USUARIO;
import static com.dafiti.www.ui.RegistroPages.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegistroTaks implements Task {

    Excel excel = new Excel();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_REGISTRAR_ENTRAR, isClickable()).forNoMoreThan(120).seconds(),
                    JavaScriptClick.on(BTN_REGISTRAR_ENTRAR),
                    WaitUntil.the(LBL_NUEVOS_CLIENTES, isClickable()).forNoMoreThan(120).seconds(),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,0)).into(TXT_EMAIL),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,1)).into(TXT_CLAVE),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,2)).into(TXT_CONFIRMAR_CLAVE),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,3)).into(TXT_NOMBRRE),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,4)).into(TXT_APELLIDO),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,5)).into(TXT_IDENTIFICACION),
                    Click.on(BTN_TIPO_ID),
                    WaitUntil.the(LST_TIPO_ID, isClickable()).forNoMoreThan(120).seconds(),
                    Click.on(LST_TIPO_ID),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,7)).into(TXT_DIA),
                    Enter.theValue(excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,8)).into(TXT_MES),
                    Click.on(BTN_ANIO),
                    WaitUntil.the(LST_ANIO, isClickable()).forNoMoreThan(120).seconds(),
                    Click.on(LST_ANIO),
                    Click.on(BTN_SEXO),
                    WaitUntil.the(LST_SEXO, isClickable()).forNoMoreThan(120).seconds(),
                    Click.on(LST_SEXO),
                    Click.on(BTN_ENVIAR),
                    WaitUntil.the(LBL_NOMBRE_USUARIO, isClickable()).forNoMoreThan(120).seconds()

                    );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static RegistroTaks registro (){
        return instrumented (RegistroTaks.class);
    }
}
