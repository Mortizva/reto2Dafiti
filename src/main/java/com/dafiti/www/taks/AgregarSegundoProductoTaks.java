package com.dafiti.www.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.dafiti.www.ui.AgregarProductoPages.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarSegundoProductoTaks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_MARCAS, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(BTN_MARCAS),
                WaitUntil.the(CKC_ZAPATOS, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(CKC_ZAPATOS),
                WaitUntil.the(BTN_ADIDAS, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(BTN_ADIDAS),
                WaitUntil.the(BTN_MASCULINO, isClickable()).forNoMoreThan(120).seconds(),
                Scroll.to(BTN_MASCULINO),
                Click.on(BTN_ZAPATO2),
                WaitUntil.the(BTN_TALLAS, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(BTN_TALLAS),
                WaitUntil.the(LST_TALLA, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(LST_TALLA),
                Click.on(BTN_AGREGAR),
                Click.on(BTN_CARRITO)
        );

        actor.attemptsTo(
                WaitUntil.the(BTN_MARCAS, isClickable()).forNoMoreThan(120).seconds(),
                Click.on(BTN_MARCAS),
                Click.on(BTN_CARRITO)
        );

    }
    public static AgregarSegundoProductoTaks agregar2 (){
        return instrumented (AgregarSegundoProductoTaks.class);
    }

}
