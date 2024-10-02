package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");
    public static By confirmationPopup;
    public static By totalAmount;
    public static By clothesCategory = By.xpath("//a[@href='/store/pe/clothes']");

    // Selector para la subcategoría de hombres
    public static By menSubCategory = By.xpath("//a[@href='/store/pe/clothes/men']");

    // Selector para el primer producto
    public static By firstProduct = By.xpath("//div[@class='product-item'][1]");

    // Selector para el botón agregar al carrito
    public static By addToCartButton = By.cssSelector(".add-to-cart");

    // Popup confirmación
    public static By popupConfirmation = By.cssSelector(".popup-confirmation");

    // Selector para el total en el popup
    public static By popupTotal = By.cssSelector(".popup-total");

    // Carrito
    public static By cartTitle = By.cssSelector("h1.cart-title");
    public static By cartTotal = By.cssSelector(".cart-total");
}
