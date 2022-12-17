package com.dafiti.www.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarProductoPages {

    public static final Target BTN_ELIMINAR = Target
            .the("ELIMINAR PRODUCTO")
            .located(By.xpath("(//a[@title='Eliminar producto'])[1]"));


}
