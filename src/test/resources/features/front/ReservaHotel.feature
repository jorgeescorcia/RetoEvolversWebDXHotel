# language: es

Característica: Proceso de reserva de Hotel

  Escenario: Reserva de hotel en DXHotels
    Dado que el usuario esta en la pagina de reserva del hotel
    Cuando el usuario llena los datos para hacer reserva
    Y escoge el hotel mas economico de la lista
    Entonces se muestra un mensaje de confirmación de reserva exitosa