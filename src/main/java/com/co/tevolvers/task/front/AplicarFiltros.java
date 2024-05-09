package com.co.tevolvers.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.tevolvers.userinterface.dxhotels.AplicarFiltrosUI.*;

public class AplicarFiltros implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(RANGO_PRECIO),

                Click.on(ESTRELLA1),
                Click.on(ESTRELLA2),
                Click.on(BTN_APPLY)
        );

    }


    public static AplicarFiltros aplicarFiltros(){
        return Tasks.instrumented(AplicarFiltros.class);
    }

}
