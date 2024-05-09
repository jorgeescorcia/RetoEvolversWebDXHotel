package com.co.tevolvers.task.front;

import com.co.tevolvers.utils.front.Diccionario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.tevolvers.userinterface.dxhotels.BuscarHotel.*;
import static com.co.tevolvers.utils.front.Diccionario.*;

public class LlenarCamposHotel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(

                SendKeys.of(LOCATION_CITY).into(LOCATION),
                Hit.the(Keys.ENTER).into(LOCATION),
                //Click.on(IMG_CALENDARIO),
                Enter.theValue("11 May 2024").into(CHECK_IN),
                Enter.theValue("16 May 2024").into(CHECK_OUT),
                Click.on(COMBOLIST),
                SendKeys.of("2").into(NUMERO_HABITACIONES),
                Hit.the(Keys.ENTER).into(NUMERO_HABITACIONES),
                Click.on(SPIN),
                Click.on(SPIN),
                Enter.theValue("2").into(NUMERO_NINOS),
                Click.on(BTN_SEARCH)




        );
    }

    public static LlenarCamposHotel llenarCamposHotel(){
        return Tasks.instrumented(LlenarCamposHotel.class);
    }


}
