package com.dafiti.www.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductoPages {

    public static final Target BTN_MARCAS = Target
            .the("BOTON DE MARCAS")
            .located(By.xpath("//a[@data-position='8']"));

    public static final Target CKC_ZAPATOS = Target
            .the("CHEK DE ZAPATOS")
            .located(By.xpath("(//span[@class='iconImg i-square'])[5]"));

    public static final Target BTN_ADIDAS = Target
            .the("BOTON ADIDAS")
            .located(By.xpath("(//a[.='adidas'])[1]"));

    public static final Target BTN_MASCULINO = Target
            .the("BOTON MASCULINO")
            .located(By.xpath("//span[.='Masculino']"));

    public static final Target BTN_ZAPATO = Target
            .the("BOTON ZAPATO")
            .located(By.xpath("(//div[@class='itm-product-main-info main-card'])[3]"));

    public static final Target BTN_ZAPATO2 = Target
            .the("BOTON ZAPATO 2")
            .located(By.xpath("(//div[@class='itm-product-main-info main-card'])[2]"));


    public static final Target BTN_TALLAS = Target
            .the("SELECCIONAR TALLA")
            .located(By.xpath("(//div[@class='selectContainer'])[1]"));

    public static final Target LST_TALLA = Target
            .the("LISTA DE TALLAS")
            .located(By.xpath("(//li/span/span/span[.='Disponible'])[1]"));

    public static final Target BTN_AGREGAR = Target
            .the("BOTON AGREGAR")
            .located(By.id("AddToCart"));

    public static final Target BTN_CARRITO = Target
            .the("BOTON CARRITO DE COMPRAS")
            .located(By.xpath("//span[@class='icon icon-cart']"));

    public static final Target BTN_CANTIDAD = Target
            .the("BOTON AGREGAR")
            .located(By.xpath("//select[@class='cartQty sel-cart-quantity-AD858SH83DRCCO-4933773']"));


    public static final Target LST_CANTIDAD = Target
            .the("BOTON CARRITO DE COMPRAS")
            .located(By.xpath("//select/option[.='3']"));




}
