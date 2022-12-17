package com.dafiti.www.questions;

import com.dafiti.www.ui.MensajeProductoPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarProducto implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeProductoPages.LBL_CARRITO_VACIO.resolveFor(actor).isClickable();
    }

    public static Question validar() {
        return new ValidarProducto();
    }
}
