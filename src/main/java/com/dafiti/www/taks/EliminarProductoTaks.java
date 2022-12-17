package com.dafiti.www.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.dafiti.www.ui.EliminarProductoPages.BTN_ELIMINAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EliminarProductoTaks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ELIMINAR, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(BTN_ELIMINAR),
                WaitUntil.the(BTN_ELIMINAR, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(BTN_ELIMINAR)

                );
    }
    public static EliminarProductoTaks eliminar (){
        return instrumented (EliminarProductoTaks.class);
    }

}
