package com.dafiti.www.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionPages {

    public static final Target BTN_REGISTRAR_ENTRAR = Target
            .the("BOTON REGISTRAR Y ENTRAR")
            .located(By.id("LoginInfoTag"));

    public static final Target TXT_EMAIL = Target
            .the("INGRESAR EMAIL")
            .located(By.id("LoginForm_email"));

    public static final Target TXT_CLAVE = Target
            .the("INGRESAR CLAVE")
            .located(By.id("LoginForm_password"));

    public static final Target BTN_INICIO_SESION = Target
            .the("INGRESAR CLAVE")
            .located(By.id("loginButton"));



}
