package com.dafiti.www.questions;

import com.dafiti.www.ui.MensajeRegistroPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPages.LBL_NOMBRE_USUARIO.resolveFor(actor).isVisible();
    }



    public static Question validar() {
        return new ValidacionRegistro();
    }
}
