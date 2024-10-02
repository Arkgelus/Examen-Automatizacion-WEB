Feature: Validacion del precion de un producto
  @tienda
  Scenario Outline: Validacion del precion de un producto
    Given estoy en la pagina de la tienda
    And me logueo con mi usuario "<usuario>" y clave  "<contraseña>"
    When navego a la categoria "<categoria>" y subcategoria "<subcategoria>"
    And agrego "<cantida>" unidades del primer producto al carrito
    When  valido en el popup la configuracion del producto agregado
    And  valido en el popup que el monto total sea calculado correctamente
    When finalizado la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validad el calculo del precios en el carrito

    Examples:
    |usuario|contraseña|categoria|subcategoria|cantida|
    |     arkgelus@gmail.com  | casa@1287         | Clothes        |  Men          |     2  |
    |     arkgelus@gmail.com  | casa1ok33        | Clothes        |  Men          |     2  |




