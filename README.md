# Automatización de Pruebas para Reserva de Hotel DXHotels

Este repositorio contiene la automatización de pruebas para una aplicación web de reservas de hotel. A continuación, se detallan los escenarios automatizados y cómo se abordaron los defectos encontrados.

## Escenarios Automatizados

### 1. Login Exitoso y Fallido
Descripción: Se verifica que el inicio de sesión funcione correctamente y que falle cuando se proporcionan credenciales incorrectas.
Pasos:
- Ingresar credenciales válidas y hacer clic en “Login”.
- Verificar que se redireccione a la página principal.
- Ingresar credenciales inválidas y verificar que se muestre un mensaje de error.

### 2. Reservación de Hotel
Descripción: Se automatiza la reserva de un hotel con filtros específicos.
Pasos:
- Seleccionar Locacion
- Seleccionar fechas de check-in y check-out según las especificaciones.
- Ingresar el número de habitaciones, adultos y niños.
- Establecer el rango de precio superior a $200 USD y 3 o más estrellas.
- Aplicar los filtros.
- Seleccionar el hotel más económico que cumpla con los filtros.
- Llenar informacion requerida para la reserva
- Reservar Hotel
- Validar que se muestre un mensaje de reserva exitosa.

## Defectos Encontrados

Como (QA), abordaría estos errores de la siguiente manera:

## Funcionalidad de inicio de sesión no funcional:
- Primero, verificaría si el problema es específico de la automatización o si también ocurre manualmente. Si es un problema general, informaría al equipo de desarrollo para que lo solucionen.
- Luego, revisaría el flujo de inicio de sesión en la automatización. ¿Está utilizando credenciales válidas? ¿Hay algún problema con la interacción de la interfaz de usuario?
- Realizaría pruebas exploratorias para identificar posibles causas raíz. ¿Hay errores en los mensajes de error? ¿Se están manejando correctamente las excepciones?
- Si es posible, intentaría acceder directamente a la funcionalidad de inicio de sesión a través de la interfaz de usuario y verificaría si el problema persiste.
- Documentaría el problema detalladamente y lo reportaría al equipo de desarrollo para su corrección.
  
## Filtro de reserva no funciona y falta el botón de reserva:
- Verificaría si el filtro de precio está configurado correctamente en la automatización. ¿Se están pasando los valores correctos al filtro?
- Probaría manualmente la funcionalidad de filtrado de precios para confirmar si el problema es específico de la automatización o si también ocurre en la interfaz de usuario.
- Si el filtro no funciona, investigaría si hay problemas con la lógica de programación o con la interacción con la interfaz de usuario.
- Respecto al botón de reserva faltante, revisaría el código fuente o la estructura de la página para asegurarme de que el elemento esté presente y accesible.
- Si el botón está ausente, informaría al equipo de desarrollo para que lo agreguen, como tambien un mensaje de reserva exitosa
- Documentaría ambos problemas y los reportaría para su corrección.

# Requisitos Para Ejecucion
- Clonar Repositorio
- Java Development Kit (JDK) 17
- Gradle 7.6.3
- Gherkin
- Chrome Version > 100


