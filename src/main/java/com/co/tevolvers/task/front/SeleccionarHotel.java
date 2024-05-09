package com.co.tevolvers.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.co.tevolvers.userinterface.dxhotels.SeleccionHotel.BTN_RESERVAR;
import static com.co.tevolvers.userinterface.dxhotels.SeleccionHotel.HOTEL;

public class SeleccionarHotel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(HOTEL),
                Click.on(BTN_RESERVAR)
        );

    }

    public static SeleccionarHotel seleccionarHotel(){
       return Tasks.instrumented(SeleccionarHotel.class);

    }
}
