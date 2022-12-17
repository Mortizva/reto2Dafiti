package com.dafiti.www.ui;

import com.dafiti.www.utils.Excel;
import net.serenitybdd.core.pages.PageObject;
//import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.IOException;

//@DefaultUrl("https://www.dafiti.com.co/")
public class RegistroPages extends PageObject {

    public static Excel excel = new Excel();

    public static final Target BTN_REGISTRAR_ENTRAR = Target
            .the("BOTON REGISTRAR Y ENTRAR")
            .located(By.id("LoginInfoTag"));

    public static final Target LBL_NUEVOS_CLIENTES = Target
            .the("TITULO NUEVOS CLIENTES")
            .located(By.xpath("//h2[.='Nuevos clientes']"));

    public static final Target TXT_EMAIL = Target
            .the("EMAIL")
            .located(By.id("RegistrationForm_email"));

    public static final Target TXT_CLAVE = Target
            .the("CLAVE")
            .located(By.id("RegistrationForm_password"));

    public static final Target TXT_CONFIRMAR_CLAVE = Target
            .the("CONFIRMAR CLAVE")
            .located(By.id("RegistrationForm_password2"));

    public static final Target TXT_NOMBRRE = Target
            .the("NOMBRE")
            .located(By.id("RegistrationForm_first_name"));

    public static final Target TXT_APELLIDO = Target
            .the("NOMBRE")
            .located(By.id("RegistrationForm_last_name"));

    public static final Target TXT_IDENTIFICACION = Target
            .the("IDENTIFICACION")
            .located(By.id("RegistrationForm_identification"));

    public static final Target BTN_TIPO_ID = Target
            .the("BOTON TIPO DE IDENTIFICACION")
            .located(By.id("RegistrationForm_identification_type"));

    public static final Target TXT_DIA = Target
            .the("DIA")
            .located(By.id("RegistrationForm_day"));

    public static final Target TXT_MES = Target
            .the("MES")
            .located(By.id("RegistrationForm_month"));

    public static final Target BTN_ANIO = Target
            .the("BOTON DEL ANIO")
            .located(By.id("RegistrationForm_year"));

    public static final Target BTN_SEXO = Target
            .the("BOTON TIPO DE SEXO")
            .located(By.id("RegistrationForm_gender"));

    public static final Target BTN_ENVIAR = Target
            .the("BOTON ENVIAR")
            .located(By.id("createAccountButton"));


    public static final Target LST_TIPO_ID;
    public static final Target LST_ANIO;
    public static final Target LST_SEXO;

    static {
        try {
            LST_TIPO_ID = Target
                    .the("TIPO DE IDENTIFICACION")
                    .located(By.xpath("//select/option[.='"+excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,6)+"']"));
            LST_ANIO = Target
                    .the("ANIO")
                    .located(By.xpath("//select/option[.='"+excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,9)+"']"));
            LST_SEXO = Target
                    .the("SEXO")
                    .located(By.xpath("//select/option[.='"+excel.leerDatosExcel("DatosDafiti.xlsx","Registro",1,10)+"']"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
