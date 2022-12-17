package com.dafiti.www.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeProductoPages {

    public static final Target LBL_CARRITO_VACIO = Target
            .the("TEXTO CARRITO ESTA VACIO")
            .located(By.xpath("//p[@class='cartTitleEmpty mbm']"));

}
