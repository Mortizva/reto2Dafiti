#language: es
Característica: agregar productos al carrito y eliminarlos

  Escenario: agregar y eliminar producto del carrito exitoso
    Dado que el usuario se encuentre en la pagina web de dafiti
    Cuando el usuario inicie sesion en la pagina web
    Y el usuario seleccione una categoria para agregar un producto al carrito
    Y el usuario seleccione otro producto y lo agregue al carrito
    Y el usuario vaya al carrito de compras para eliminar los productos
    Entonces el usuario visualiza un mensaje