package stepsdefinitions.front;

import com.co.tevolvers.task.front.AbrirWeb;
import com.co.tevolvers.task.front.AplicarFiltros;
import com.co.tevolvers.task.front.LlenarCamposHotel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservaHotelSteps extends SetupFront {


    @Before
    public void prepararTest(){
        setUpTest();
    }

    @Dado("que el usuario esta en la pagina de reserva del hotel")
    public void que_el_usuario_esta_en_la_pagina_de_reserva_del_hotel() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());

    }
    @Cuando("el usuario llena los datos para hacer reserva")
    public void el_usuario_llena_los_datos_para_hacer_reserva() {
        theActorInTheSpotlight().attemptsTo(LlenarCamposHotel.llenarCamposHotel());
        theActorInTheSpotlight().attemptsTo(AplicarFiltros.aplicarFiltros());

    }
    @Cuando("escoge el hotel mas economico de la lista")
    public void escoge_el_hotel_mas_economico_de_la_lista() {

    }
    @Entonces("se muestra un mensaje de confirmación de reserva exitosa")
    public void se_muestra_un_mensaje_de_confirmación_de_reserva_exitosa() {

    }


}
