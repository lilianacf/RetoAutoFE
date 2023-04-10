#language: es

Característica: Login Swag Labs
  Yo como usuario del sitio web Swag Labs quiero iniciar sesión de usuario para gestionar mi cuenta

  Antecedentes:
    Dado que ingreso al sitio web www.saucedemo.com

  Escenario: login en Swag Labs
    Cuando inicio sesión con el 'standard_user' y la 'secret_sauce'
    Entonces visualizo el dashboard de productos de Swag Labs

  Escenario: login en Swag Labs usuario o contraseña invalido
    Cuando inicio sesión con el 'standard_use' y la 'secret_sauce'
    Entonces visualizo el mensaje de error usuario o clave incorrecto


