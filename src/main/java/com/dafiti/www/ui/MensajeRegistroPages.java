package com.dafiti.www.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeRegistroPages {

    public static final Target LBL_NOMBRE_USUARIO = Target
            .the("TEXTO NOMBRE DE USUARIO")
            .located(By.xpath("//span[@class='text']"));
}
