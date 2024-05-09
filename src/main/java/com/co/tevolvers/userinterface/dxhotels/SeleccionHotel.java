package com.co.tevolvers.userinterface.dxhotels;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionHotel extends PageObject {

    public static final Target HOTEL =
            Target.the("Hotel").locatedBy("//a[@id='MainContentPlaceHolder_HotelsDataView_IT0_HotelTitleHyperLink_0']");
    public static final Target BTN_RESERVAR =
            Target.the("Hotel").locatedBy("//div[@id='MainContentPlaceHolder_RoomsNavBar_GHTCE0_RoomBookItButton_0_CD']");



}
